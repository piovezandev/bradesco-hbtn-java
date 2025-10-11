import java.util.LinkedList;

public class Fila {

	private LinkedList<Integer> fila = new LinkedList<>();

	private int capacidade;

	public Fila(int capacidade) {
		this.capacidade = capacidade;
	}

	public synchronized void adicionar(int item) throws InterruptedException {
		while (this.fila.size() == getCapacidade()) {
			wait();
		}

		fila.add(item);
		System.out.println("ADICIONOU: " + item);

		notify();
	}

	public synchronized int retirar() throws InterruptedException {
		while (this.fila.isEmpty()) {
			wait();
		}

		int item = fila.removeFirst();
		System.out.println("REMOVEU: " + item);

		notify();

		return item;
	}

	public LinkedList<Integer> getFila() {
		return fila;
	}

	public void setFila(LinkedList<Integer> fila) {
		this.fila = fila;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
