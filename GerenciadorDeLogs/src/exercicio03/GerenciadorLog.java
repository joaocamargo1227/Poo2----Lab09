package exercicio3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerenciadorLog {

    public enum DestinoLog { CONSOLE, ARQUIVO }

    private static DestinoLog destinoAtual = DestinoLog.CONSOLE;
    private static final String ARQUIVO_LOG = "log_exercicio3.txt";

    private GerenciadorLog() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada.");
    }

    public static void setDestino(DestinoLog destino) {
        destinoAtual = destino;
    }

    public static void logInfo(String mensagem) {
        escreverLog("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        escreverLog("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        escreverLog("ERROR", mensagem);
    }

    private static void escreverLog(String nivel, String mensagem) {
        String mensagemFormatada = "[" + nivel + "] " + mensagem;

        if (destinoAtual == DestinoLog.CONSOLE) {
            System.out.println(mensagemFormatada);
        } else if (destinoAtual == DestinoLog.ARQUIVO) {
            // Abre o arquivo no modo 'append' (adiciona texto sem apagar o anterior)
            try (PrintWriter out = new PrintWriter(new FileWriter(ARQUIVO_LOG, true))) {
                out.println(mensagemFormatada);
            } catch (IOException e) {
                System.err.println("Erro ao gravar no arquivo de log: " + e.getMessage());
            }
        }
    }
}