public enum Categorias {
	DEVOPS("DEVOPS"), DESENVOLVIMENTO("DESENVOLVIMENTO"), DATA_SCIENCE("DATA_SCIENCE");
	
	private String valores;
	
	private Categorias(String valores) {
		this.valores = valores;
	}

	public String getValores() {
		return valores;
	}
}
