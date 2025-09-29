public class FolhaPagamento {

	public static Double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadorDeSalario) {	
		return calculadorDeSalario.calcular(funcionario.getSalario());
	}
}
