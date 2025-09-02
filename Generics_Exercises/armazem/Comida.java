public class Comida {

	private String nome;
	private double calorias;
	private double preco;
	
	public Comida(String nome, double calorias, double valor) {
		this.nome = nome;
		this.calorias = calorias;
		this.preco = valor;
	}
	
	@Override
	public String toString() {
		return "["+nome+"] "+String.format("%.6f", calorias)+" R$ "+String.format("%.6f", preco);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
