import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro{

	public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
		super(titulo, autor, preco);
	}

	@Override
	public double getPreco() throws LivroInvalidoException {
		double preco = super.getPreco();
		return preco * 1.30;
	}
}
