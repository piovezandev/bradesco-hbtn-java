import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
	
	private List<Tarefa> tarefas;
	
	public ListaTodo() {
		tarefas = new ArrayList<Tarefa>();
	}

	public void adicionarTarefa(Tarefa tarefa) {
		for (Tarefa tarefaAtual : tarefas) {
			if (tarefaAtual.getIdentificador() == tarefa.getIdentificador()) {
				throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
			}
		}
		tarefa.modificarDescricao(tarefa.getDescricao());
		tarefas.add(tarefa);
	}

	public boolean marcarTarefaFeita(int identificador) {
		boolean isTarefaFeita = false;
		for (int i = 0; i < tarefas.size(); i++) {
			Tarefa tarefaAtual = tarefas.get(i);
			if(tarefaAtual.getIdentificador() == identificador) {
				isTarefaFeita = true;
				tarefaAtual.setEstahFeita(true);
			}else {
				isTarefaFeita = false;
				tarefaAtual.setEstahFeita(false);
			}			
		}
		return isTarefaFeita;
	}
	
	public boolean desfazerTarefa(int identificador) {
		boolean tarefaNaoFeita = false;
		for (int i = 0; i < tarefas.size(); i++) {
			Tarefa tarefaAtual = tarefas.get(i);
			if(tarefaAtual.getIdentificador() == identificador) {
				tarefaNaoFeita = true;
				tarefaAtual.setEstahFeita(false);
			}else {
				tarefaNaoFeita = false;
			}			
		}
		return tarefaNaoFeita;
	}
	
	public void desfazerTodas() {
		for (int i = 0; i < tarefas.size(); i++) {
			tarefas.get(i).setEstahFeita(false);
		}
	}	

	public void fazerTodas() {
		for (int i = 0; i < tarefas.size(); i++) {
			tarefas.get(i).setEstahFeita(true);
		}
	}

	public void listarTarefas() {
		for (int i = 0; i < tarefas.size(); i++) {
			Tarefa tarefa = tarefas.get(i);
			if (tarefa.isEstahFeita()) {
			System.out.println("[X]  Id: "+tarefa.getIdentificador()+" - Descricao: "+tarefa.getDescricao()+"");
			}else {
				System.out.println("[ ]  Id: "+tarefa.getIdentificador()+" - Descricao: "+tarefa.getDescricao()+"");
			}
		}
	}

}
