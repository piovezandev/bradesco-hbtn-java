public enum CategoriaProduto {

	BRINQUEDO("BRINQUEDO"), LIVRO("LIVRO"), ELETRONICO("ELETRONICO");

	private String categoria;

	CategoriaProduto(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

}
