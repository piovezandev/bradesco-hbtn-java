import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();


        // implemente o codigo aqui
        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.print("Digite o que achar necessario, digite sair para encerrar: ");
            String conteudo = scanner.nextLine();

            while (!conteudo.equalsIgnoreCase("sair")) {
                writer.write(conteudo + "\n");
                conteudo = scanner.nextLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}