import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

	public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> todasPessoas) {
		return todasPessoas
				.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo, 
						Collectors.flatMapping(p -> p.getHobbies().stream(), 
								Collectors.toCollection(TreeSet::new))));
	}

}
