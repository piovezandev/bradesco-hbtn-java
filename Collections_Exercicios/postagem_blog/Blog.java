import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		Set<Autor> autores = new HashSet<Autor>();
		for (Post post : postagens) {
			autores.add(post.getAutor());
		}
		return autores;
	}

	public Map<Categorias, Integer> obterContagemPorCategoria() {
		Map<Categorias, Integer> map = new HashMap<Categorias, Integer>();

		for (Post post : postagens) {
			Categorias categoria = post.getCategoria();
			map.put(categoria, map.getOrDefault(categoria, 0)+1);
		}
		return map;
	}

	public Set<Post> obterPostsPorCategoria(Categorias categorias) {
		Set<Post> posts = new HashSet<Post>();

		for (Post post : postagens) {
			if(post.getCategoria().equals(categorias)) {
				posts.add(post);
			}
		}
		return posts;
	}

	public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> posts = new HashSet<Post>();

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
			categorias.computeIfAbsent(categoria, k -> new HashSet<>()).add(post);
		}

		return categorias;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Map<Autor, Set<Post>> autores = new HashMap<Autor, Set<Post>>();

		for (Post post : postagens) {
			Autor autor = post.getAutor();
			autores.computeIfAbsent(autor, k -> new HashSet<>()).add(post);
		}

		return autores;
	}

}
