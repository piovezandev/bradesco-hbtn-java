public enum FormatoVideo {
	
	MPEG("MPEG"), AVI("AVI"), WMV("WMV"), MP4("MP4"), MKV("MKV");
	
	private String formato;
	
	private FormatoVideo(String formato) {
		this.formato = formato;
	}

	public String getTipo() {
		return formato;
	}
}
