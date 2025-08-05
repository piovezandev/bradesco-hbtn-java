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
            while (true) {
                String conteudo = scanner.nextLine();

                if (conteudo.equalsIgnoreCase("sair")) {
                    System.out.print("Arquivo foi criado e seu conteúdo foi salvo com sucesso.");
                    break;
                }

                writer.write(conteudo + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}