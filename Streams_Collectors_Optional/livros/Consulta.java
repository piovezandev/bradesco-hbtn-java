import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
		return pedido
		.getProdutos()
		.stream()
		.filter(p -> p.getCategoria().compareTo(CategoriaProduto.LIVRO) == 0)
		.collect(Collectors.toList());
	}

}
