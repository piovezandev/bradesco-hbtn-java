public class Jornal extends Midia{

	private int quantidadeArtigos;

	public Jornal(String nome, int quantidade) {
		setNome(nome);
		this.quantidadeArtigos = quantidade;
	}

	public int getQuantidadeArtigos() {
		return quantidadeArtigos;
	}

	public void setQuantidadeArtigos(int quantidadeArtigos) {
		this.quantidadeArtigos = quantidadeArtigos;
	}
}
