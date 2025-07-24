public class Numero {

	public static void dividir(int a, int b) {
		try {
			int c = a/b;
		} catch (Exception e) {
			System.out.println("Nao eh possivel dividir por zero");
			System.out.println(a+" / "+b+" = "+0);
		} finally {
			System.out.println(a+" / "+b+" = "+a/b);
		}
	}
}
