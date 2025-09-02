import java.util.List;

public class ManipularArrayNumeros {


	public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numero) {
				return numeros.indexOf(numero);
			}
		}
		return -1;
	}

	public static void adicionarNumero(List<Integer> numeros, int numero) {
		int posicao = buscarPosicaoNumero(numeros, numero);
		if (posicao == -1) {
			numeros.add(numero);
		} else {
			System.out.println("Numero jah contido na lista");
		}

	}

	public static void removerNumero(List<Integer> numeros, int numero) {
		int posicao = buscarPosicaoNumero(numeros, numero);		
		if(posicao != -1) {
			numeros.remove(posicao);
		}else {
			System.out.println("Numero nao encontrado na lista");
		}
	}
	
	public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
		int posicao = buscarPosicaoNumero(numeros, numeroSubstituir);		
		if(posicao != -1) {
			numeros.set(posicao, numeroSubstituto);
		}else {
			numeros.add(numeroSubstituto);
		}
		
	}


}
