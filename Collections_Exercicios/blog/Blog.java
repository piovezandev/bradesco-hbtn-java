import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

	private List<Post> postagens;
	
	public Blog() {
		postagens = new ArrayList<>();
	}
	
	public void adicionarPostagem(Post post) {
		postagens.add(post);
	}

	public Set<String> obterTodosAutores() {
		Set<String> autores = new TreeSet<>();
		for (Post post : postagens) {
			autores.add(post.getAutor());
		}
		return autores;
	}

	public Map<String, Integer> obterContagemPorCategoria() {
	     Map<String, Integer> map = new TreeMap<>();

	     for (Post post : postagens) {
	    	 String categoria = post.getCategoria();
	    	 map.put(categoria, map.getOrDefault(categoria, 0)+1);
		}	   
		return map;
	}

}
