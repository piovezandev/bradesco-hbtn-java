mport org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;


public class ProcessamentoDePagamentos {

    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            logger.info("Iniciando o processamento do pagamento {}", i);

            try {
                Thread.sleep(1000);
                int result = random.nextInt(3);

                switch (result) {
                    case 0:
                        logger.info("Pagamento {} processado com sucesso.", i);
                        break;
                    case 1:
                        logger.error("Erro ao processar o pagamento {}: Falha na operação.", i);
                        break;
                    case 2:
                        logger.warn("Pagamento {} está pendente. Aguardando confirmação.", i);
                        break;
                }

            } catch (InterruptedException e) {
                logger.error("Ocorreu um erro na solitação de pagamento {}: {}", i, e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        logger.info("Concluido");
    }
}