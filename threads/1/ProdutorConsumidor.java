public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Criar e iniciar as threads do produtor e consumidor
        Consumidor consumidor =  new Consumidor(buffer);
        consumidor.start();
        
        Produtor produtor =  new Produtor(buffer);
        produtor.start();
    }
}
