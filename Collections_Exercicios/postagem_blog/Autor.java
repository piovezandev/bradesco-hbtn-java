public class Autor<T> implements Comparable<T>{

	private String nome;
	private String sobrenome;

	public Autor(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return nome +" "+ sobrenome;
	}

	@Override
	public int compareTo(T o) {
		return 0;
	}
}
