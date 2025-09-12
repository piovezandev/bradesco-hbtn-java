public class Post<T> implements Comparable<T>{

	private Autor autor;
	private String titulo;
	private String corpo;
	private Categorias categoria;

	public Post(Autor autor1, String titulo, String corpo, Categorias devops) {
		this.autor = autor1;
		this.titulo = titulo;
		this.corpo = corpo;
		this.categoria = devops;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return  titulo;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
