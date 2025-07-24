package provedores;

public class Loggi implements ProvedorFrete {

	@Override
	public Frete calcularFrete(double peso, double valor) {
		Frete frete = new Frete();
		frete.setTipoProvedorFrete(TipoProvedorFrete.LOGGI);

		if (peso > 5000) {
			frete.setValor(valor * 0.12);
			return frete;
		}
		frete.setValor(valor * 0.04);
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.LOGGI;
	}

}
