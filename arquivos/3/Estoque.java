import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private String nomeArquivo;
	
	public Estoque(String arquivo) {
		this.nomeArquivo = arquivo;
	}

	public void adicionarProduto(String nome, int quantidade, double preco) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(getNomeArquivo()));

			String linha = bufferedReader.readLine();

			List<Produto> produtos = new ArrayList<Produto>();
			Produto produto = null;
			
			while (linha != null) {
				String[] csv = linha.split(",");
				produto = new Produto(Integer.parseInt(csv[0]), csv[1], Integer.parseInt(csv[2]),
						Double.parseDouble(csv[3]));
				linha = bufferedReader.readLine();
				produtos.add(produto);
			}
			bufferedReader.close();
			
			int lastId = 0;
			
			for (int i = 0; i < produtos.size(); i++) {
				lastId = produtos.get(i).getId();
			}
			
			produto.setId(lastId+1);
			produto.setNome(nome);
			produto.setQuantidade(quantidade);
			produto.setPreco(preco);

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getNomeArquivo(), true));
			
			bufferedWriter.newLine();
			bufferedWriter.write(produto.toCsv());
			
			bufferedWriter.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public void excluirProduto(int idExcluir) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(getNomeArquivo()));

			String linha = bufferedReader.readLine();

			List<Produto> produtos = new ArrayList<Produto>();
			Produto produto = null;
			
			while (linha != null) {
				String[] csv = linha.split(",");
				produto = new Produto(Integer.parseInt(csv[0]), csv[1], Integer.parseInt(csv[2]),
						Double.parseDouble(csv[3]));
				linha = bufferedReader.readLine();
				produtos.add(produto);
			}
			
			bufferedReader.close();
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getNomeArquivo(), false));			

			List<Produto> produtosAtualizada = new ArrayList<Produto>();
			
			for (int i = 0; i < produtos.size(); i++) {
				if(produtos.get(i).getId() != idExcluir) {
					produtosAtualizada.add(produtos.get(i));
				}
			}
			
			for (Produto product : produtosAtualizada) {
				bufferedWriter.write(product.toCsv()+"\n");
			}
			
			bufferedWriter.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public void exibirEstoque() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(getNomeArquivo()));

			String linha = bufferedReader.readLine();

			while (linha != null) {
				String[] csv = linha.split(",");
				Produto produto = new Produto(Integer.parseInt(csv[0]), csv[1], Integer.parseInt(csv[2]),
						Double.parseDouble(csv[3]));
				linha = bufferedReader.readLine();
				System.out.println(produto.toString());
			}

			bufferedReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(getNomeArquivo()));

			String linha = bufferedReader.readLine();

			List<Produto> produtos = new ArrayList<Produto>();
			Produto produto = null;

			while (linha != null) {
				String[] csv = linha.split(",");
				if (csv.length >= 4) {
					produto = new Produto(Integer.parseInt(csv[0]), csv[1], Integer.parseInt(csv[2]),
							Double.parseDouble(csv[3]));
					produtos.add(produto);
				}
				linha = bufferedReader.readLine();

			}

			bufferedReader.close();

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getNomeArquivo(), false));

			List<Produto> produtosAtualizada = new ArrayList<Produto>();

			for (int i = 0; i < produtos.size(); i++) {
				if(produtos.get(i).getId() == idAtualizar) {
					produtos.get(i).setQuantidade(novaQuantidade);
				}
				produtosAtualizada.add(produtos.get(i));
			}

			for (Produto product : produtosAtualizada) {
				bufferedWriter.write(product.toCsv());
				bufferedWriter.newLine();
			}

			bufferedWriter.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

}
