import java.util.Random;

public class Produtor extends Thread {
    private Fila fila;

    public Produtor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 1; i <= fila.getCapacidade(); i++) {
                fila.adicionar(random.nextInt(10)); 
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}