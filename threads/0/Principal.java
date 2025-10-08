public class Principal {

    public static void main(String[] args) {
    	Contador contador = new Contador();
    	
    	ThreadContador threadContador1 = new ThreadContador(contador);
    	ThreadContador threadContador2 = new ThreadContador(contador);
    	
    	threadContador1.run();
    	threadContador2.run();
 
    	System.out.println("Valor final do contador: " + contador.getContagem());
    }
}
