package provedores;

public enum TipoProvedorFrete {

	SEDEX("SEDEX"), JADLOG("JADLOG"), LOGGI("LOGGI");
	
	private String valores;
	
	private TipoProvedorFrete(String valores) {
		this.valores = valores;
	}

	public String getValores() {
		return valores;
	}
}
