public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Contador contador = new Contador();

		ThreadContador threadContador1 = new ThreadContador(contador);
		ThreadContador threadContador2 = new ThreadContador(contador);

		threadContador1.start();
		threadContador2.start();

		threadContador1.join();
		threadContador2.join();

		System.out.println("Valor final do contador: " + contador.getContagem());
	}
}
