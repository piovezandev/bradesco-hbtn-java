import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {

	private static List<Aluno> alunos = new ArrayList<Aluno>();

	public static void main(String[] args) {
		adicionarAluno("aluno1", 20);
		adicionarAluno("aluno2", 19);
		adicionarAluno("aluno3", 30);
		listarAlunos();
		System.out.println(buscarAluno("aluno2"));
		excluirAluno("aluno2");
		excluirAluno("aluno2");
		System.out.println(buscarAluno("aluno3"));
	}

	public static void adicionarAluno(String nome, int idade) {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(idade);
		
		alunos.add(aluno);
	}

	public static void excluirAluno(String nome) {		
		for (int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getNome().contains(nome)) {
				alunos.remove(i);
			}
		}		
	}

	public static Aluno buscarAluno(String nome) {		
		for (Aluno aluno : alunos) {
			if(aluno.getNome().contains(nome)) {
				return aluno;
			}
		}
		return null;
		
	}

	public static void listarAlunos() {
		System.out.println(getAlunos());
	}

	public static List<Aluno> getAlunos() {
		return alunos;
	}

}
