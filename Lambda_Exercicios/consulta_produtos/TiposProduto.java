public enum TiposProduto {

	COZINHA(""), ELETRONICO(""), BRINQUEDO("");

	private String tipo;
	
	TiposProduto(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
