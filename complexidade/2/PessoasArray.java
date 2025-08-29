public class PessoasArray {

	private String[] nomes;

	public PessoasArray() {
		nomes = new String[] { "Amanda", "Beatriz", "Carlos", "Daniela", "Eduardo", "Fabio", "Gustavo", "Hingrid",
				"Isabela", "Joao", "Leise", "Maria", "Norberto", "Otavio", "Paulo", "Quirino", "Renata", "Sabata",
				"Tais", "Umberto", "Vanessa", "Xavier" };
	}

	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}

	// implementar o método de buscaBinaria
	public void buscaBinaria(String nome) {
		boolean encontrado = false;
		int inicio = 0;
		int meio = 0;
		int fim = nomes.length -1;

		System.out.println("Procurando o nome: \"" + nome + "\"");
		
		while(inicio <= fim) {
			meio = ((inicio + fim) /2);
			System.out.println("Passando pelo indice:" + meio);
			
			int achou = nome.compareToIgnoreCase(nomes[meio]);
			
			if(achou == 0) {
				System.out.println("Nome " + nome + " encontrado na posição " + meio);
				encontrado = true;
				break;
			} else if (achou <0) {
				fim = meio -1;
			} else {
				inicio = meio +1;
			}
		}		
		if (!encontrado) {
			throw new IllegalArgumentException(" O nome " + nome + " não se encontra no array de nomes");
		}
	}
}
