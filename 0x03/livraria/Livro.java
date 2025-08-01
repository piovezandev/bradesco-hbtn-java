import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

	private String titulo;
	private String autor;
	private double preco;

	public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
		this.setTitulo(titulo);
		this.setAutor(autor); 
		this.setPreco(preco);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws LivroInvalidoException {
		if(titulo.length() < 3) {
			throw new LivroInvalidoException("Titulo de livro invalido");
		}
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws AutorInvalidoException {
		if(autor.split("\\s+").length == 1) {
			throw new AutorInvalidoException("Nome de autor invalido");
		}
		this.autor = autor;
	}

	public double getPreco() throws LivroInvalidoException {
		if(this.preco <= 0) {
			throw new LivroInvalidoException("Preco de livro invalido");
		}
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
