import java.util.List;

public class Pessoa implements Comparable<Pessoa>{

	private int codigo;
	private String nome;
	private String cargo;
	private int idade;
	private double salario;
	private List<String> hobbies;

	public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.hobbies = hobbies;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		String salarioAux = String.format("%.6f", salario).replace('.', ',');
		return "["+codigo+"] " + nome + " "+ cargo + " " + idade + " R$ "+ salarioAux;
	}


	@Override
	public int compareTo(Pessoa o) {
	    return this.nome.compareTo(o.nome);
	}
	
}
