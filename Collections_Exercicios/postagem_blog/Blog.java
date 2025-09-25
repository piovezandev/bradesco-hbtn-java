import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

	private List<Post> postagens;
	
	public Blog() {
		postagens = new ArrayList<Post>();
	}

	public void adicionarPostagem(Post post) {
		for (Post postagem : postagens) {
			if (postagem.getAutor().getNome().equalsIgnoreCase(post.getAutor().getNome())
					&& postagem.getTitulo().equalsIgnoreCase(post.getTitulo())) {
				throw new IllegalArgumentException("Postagem jah existente");
			}
		}
		postagens.add(post);
	}

	public Set<Autor> obterTodosAutores() {
		Set<Autor> autores = new TreeSet<>(Comparator.comparing(Autor::getNome));
		for (Post post : postagens) {
			autores.add(post.getAutor());
		}
		return autores;
	}

	public Map<Categorias, Integer> obterContagemPorCategoria() {
	     Map<Categorias, Integer> map = new TreeMap<>(Comparator.comparing(Categorias::getValores).reversed());
	     
	     for (Post post : postagens) {
	    	 Categorias categoria = post.getCategoria();
	    	 map.put(categoria, map.getOrDefault(categoria, 0)+1);
		}	   
		return map;
	}

	public Set<Post> obterPostsPorCategoria(Categorias categorias) {
	    Set<Post> posts = new TreeSet<>(Comparator.comparing(Post::getTitulo));
		for (Post post : postagens) {
			 if(post.getCategoria().equals(categorias)) {
		    	 posts.add(post); 
			 }
		}	   
		return posts;
	}

	public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> posts = new TreeSet<Post>(Comparator.comparing(Post::getTitulo));
		for (Post post : postagens) {
			if(post.getAutor().getNome().equalsIgnoreCase(autor.getNome())) {
				posts.add(post);
			}
		}
		return posts;
	}

	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> categorias = new HashMap<Categorias, Set<Post>>();
        for (Post post : postagens) {
            Categorias categoria = post.getCategoria();
            categorias.computeIfAbsent(categoria, k -> new TreeSet<>(Comparator.comparing(Post::getTitulo))).add(post);
        }

        return categorias;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Map<Autor, Set<Post>> autores = new TreeMap<Autor, Set<Post>>(Comparator.comparing(Autor::getNome));
        for (Post post : postagens) {
            Autor autor = post.getAutor();
            autores.computeIfAbsent(autor, k -> new TreeSet<>(Comparator.comparing(Post::getAutor))).add(post);
        }
        return autores;
	}

}
