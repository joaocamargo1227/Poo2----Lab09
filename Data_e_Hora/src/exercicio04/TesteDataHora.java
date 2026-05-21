package exercicio4;
import java.time.LocalDate;
import exercicio4.UtilitariosDataHora;

public class TesteDataHora {
    public static void main(String[] args) {
        System.out.println("--- TESTE EXERCÍCIO 4: UTILITÁRIOS DE DATA E HORA ---\n");

        LocalDate dataHoje = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(2026, 12, 31); // Fim do ano corrente

        String dataBrFormatada = UtilitariosDataHora.formatarData(dataHoje, "dd/MM/yyyy");
        System.out.println("Data de hoje formatada (BR): " + dataBrFormatada);

        long diasRestantes = UtilitariosDataHora.calcularDiferencaEmDias(dataHoje, dataFutura);
        System.out.println("Dias restantes até o fim do ano: " + diasRestantes + " dias.");

        int anoParaTeste = 2024;
        boolean bissexto = UtilitariosDataHora.isAnoBissexto(anoParaTeste);
        System.out.println("O ano " + anoParaTeste + " foi bissexto? " + (bissexto ? "Sim" : "Não"));
    }
}