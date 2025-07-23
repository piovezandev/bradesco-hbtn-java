public enum TipoMensagem {
	
	AVISO("AVISO"), ERRO("ERRO"), LOG("LOG");
	
	private String tipo;
	
	private TipoMensagem(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	

}
