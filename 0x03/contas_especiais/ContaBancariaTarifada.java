import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

	private int quantidadeTransacoes;

	public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
		super(numeracao, taxaJurosAnual);
	}

	@Override
	public void sacar(double valor) throws OperacaoInvalidaException {
		for (int i = 0; i < quantidadeTransacoes; i++) {
			super.sacar(0.10);
			super.sacar(valor);
		}
		quantidadeTransacoes++;
	}

	@Override
	public void depositar(double valor) throws OperacaoInvalidaException {
		super.depositar(valor - 0.10);
		quantidadeTransacoes++;
	}

	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes;
	}
}
