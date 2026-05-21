package exercicio3;
import exercicio3.GerenciadorLog;

public class TesteLog {
    public static void main(String[] args) {
        System.out.println("--- TESTE EXERCÍCIO 3: GERENCIADOR DE LOGS ---\n");

        System.out.println("-> Enviando logs para o CONSOLE:");
        GerenciadorLog.logInfo("O sistema iniciou normalmente.");
        GerenciadorLog.logWarn("Atenção: Espaço de armazenamento menor que 15%.");

        System.out.println("\n-> Mudando destino para ARQUIVO e enviando log...");
        GerenciadorLog.setDestino(GerenciadorLog.DestinoLog.ARQUIVO);

        GerenciadorLog.logError("Conexão recusada pelo servidor de banco de dados.");

        System.out.println("[Verifique o arquivo 'log_exercicio3.txt' gerado na raiz do seu projeto]");
    }
}