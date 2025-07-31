import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

	private String numeracao;
	private double saldo;
	private double taxaJurosAnual;

	public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}

	public void depositar(double valor) throws OperacaoInvalidaException {
		if (valor <= 0) {
			throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
		}
		this.saldo += valor;
	}

	public void sacar(double valor) throws OperacaoInvalidaException {
		if (valor <= 0) {
			throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
		} else if (this.saldo < valor) {
			throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
		}
		this.saldo -= valor;
	}

	public void aplicarAtualizacaoMensal() {
		double saldo = this.saldo;
		saldo += calcularJurosMensal();
		saldo -= calcularTarifaMensal();
		this.saldo = saldo;
	}

	private double calcularTarifaMensal() {
		double tarifa = this.saldo * 0.10;
		if(tarifa > 10) {
			return 10;
		}
		return tarifa;
	}

	private double calcularJurosMensal() {
		if (this.saldo < 0) {
			return 0;
		}
		double juros = taxaJurosAnual / 12 / 100;
		return this.saldo * juros;
	}

}
