import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura

        System.out.println("Conteúdo do arquivo '"+fileName+"'");

        // efetue a leitura do arquivo

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(fileName));

            String linha = leitor.readLine();

            while(linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
            leitor.close();
            System.out.println("Leitura do arquivo concluída.");
        } catch (IOException  e) {
            System.err.println(e.getMessage());
        }
    }
}