import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
		List<Produto> lista = new ArrayList<Produto>();

		for (Produto produto : produtos) {
			if (criterioFiltro.testar(produto)) {
				lista.add(produto);
			}
		}

		return lista;
	}

}
