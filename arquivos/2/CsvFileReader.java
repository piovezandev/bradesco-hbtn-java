import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {

	public static void main(String[] args) {
		String fileName = "funcionarios.csv";
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(fileName));

			String linha = leitor.readLine();

            while (linha != null) {
				String[] csv = linha.split(",");
				System.out.print("Funcion�rio:" +csv[0]);
				System.out.print("\nIdade:" +csv[1]);
				System.out.print("\nDepartamento:" +csv[2]);
				System.out.print("\nSalarial:" +csv[3]);
				System.out.println("\n------------------------");
				linha = leitor.readLine();
			}
			leitor.close();
			System.out.println("Leitura do arquivo concluída.");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
