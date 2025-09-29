import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate) {
		List<Produto> lista = new ArrayList<Produto>();

		for (Produto produto : produtos) {
			if (predicate.test(produto)) {
				lista.add(produto);
			}
		}

		return lista;
	}

}
