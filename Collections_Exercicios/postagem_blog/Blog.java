import java.util.*;

public class Blog {

	private List<Post> postagens;

	public Blog() {
		postagens = new ArrayList<>();
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
		Map<Categorias, Integer> map = new TreeMap<>(); // TreeMap ordena pelas chaves naturalmente
		for (Post post : postagens) {
			Categorias categoria = post.getCategoria();
			map.put(categoria, map.getOrDefault(categoria, 0) + 1);
		}
		return map;
	}

	public Set<Post> obterPostsPorCategoria(Categorias categoriaDesejada) {
		Set<Post> posts = new TreeSet<>(Comparator.comparing(Post::getTitulo));
		for (Post post : postagens) {
			if (post.getCategoria().equals(categoriaDesejada)) {
				posts.add(post);
			}
		}
		return posts;
	}

	public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> posts = new TreeSet<>(Comparator.comparing(Post::getTitulo));
		for (Post post : postagens) {
			if (post.getAutor().getNome().equalsIgnoreCase(autor.getNome())) {
				posts.add(post);
			}
		}
		return posts;
	}

	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
		Map<Categorias, Set<Post>> categorias = new HashMap<>();
		for (Post post : postagens) {
			categorias.computeIfAbsent(post.getCategoria(), k ->
					new TreeSet<>(Comparator.comparing(Post::getTitulo))
			).add(post);
		}
		return categorias;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Map<Autor, Set<Post>> autores = new TreeMap<>(Comparator.comparing(Autor::getNome));
		for (Post post : postagens) {
			autores.computeIfAbsent(post.getAutor(), k ->
					new TreeSet<>(Comparator.comparing(Post::getTitulo))
			).add(post);
		}
		return autores;
	}
}
