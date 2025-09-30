public class Cliente {

	private int codigo;
	private String nome;
	private Boolean premium;

	public Cliente(int codigo, String nome, Boolean premium) {
		this.codigo = codigo;
		this.nome = nome;
		this.premium = premium;
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

	public Boolean isPremium() {
		return premium;
	}

	public void setPremium(Boolean premium) {
		this.premium = premium;
	}

}
