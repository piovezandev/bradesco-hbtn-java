import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
		return produtos
		.stream()
		.map(p -> p.getCategoria().compareTo(CategoriaProduto.ELETRONICO) == 0 ?
				new Produto(p.getCodigo(), p.getNome(), p.getCategoria(), p.getPreco() - (p.getPreco() * 0.15))
				: p)
		.collect(Collectors.toList());
	}
}