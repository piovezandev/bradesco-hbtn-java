import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
		return produtos
				.stream()
				.filter(p -> p.getPreco() >= precoMinimo)
				.collect(Collectors.toList());
	}

	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> listaPedidos) {
		return listaPedidos
				.stream()
                .filter(pedido -> pedido.getProdutos().stream()
                  .anyMatch(produto -> produto.getCategoria().compareTo(CategoriaProduto.ELETRONICO) == 0))
                .collect(Collectors.toList());
	}
}