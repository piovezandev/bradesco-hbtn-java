package provedores;

public class Sedex implements ProvedorFrete {

	@Override
	public Frete calcularFrete(double peso, double valor) {
		Frete frete = new Frete();
		frete.setTipoProvedorFrete(TipoProvedorFrete.SEDEX);

		if (peso > 1000) {
			frete.setValor(valor * 0.10);
			return frete;
		}
		frete.setValor(valor * 0.05);
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.SEDEX;
	}

}
