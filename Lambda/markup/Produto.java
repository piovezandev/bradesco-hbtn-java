
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	private String nome;
	private double preco;
	private Double percentualMarkup;
	Supplier<Double> precoComMarkup;
	Consumer<Double> atualizarMarkup;

	public Produto(double preco, String nome) {
		this.preco = preco;
		this.nome = nome;
		setPercentualMarkup(10);
		precoComMarkup = () -> preco + (preco * (percentualMarkup / 100));
		atualizarMarkup =  novoValor -> this.percentualMarkup = novoValor;;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPercentualMarkup() {
		return percentualMarkup;
	}

	public void setPercentualMarkup(double percentualMarkup) {
		this.percentualMarkup = percentualMarkup;
	}
}
