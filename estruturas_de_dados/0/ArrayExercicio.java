import java.util.Scanner;

public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o número "+(i + 1)+": ");
            numeros[i] = scanner.nextInt();
        }
        // Exibindo os resultados

        System.out.println("\n\n\nConteúdo do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.print("\nSoma de todos os números: "+soma);

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("\nMaior número no array: "+maiorNumero);

        // Fechando o scanner
        scanner.close();
    }
}
