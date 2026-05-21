package exercicio4;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilitariosDataHora {

    private UtilitariosDataHora() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada.");
    }

    public static String formatarData(LocalDate data, String padrao) {
        if (data == null || padrao == null) {
            return "";
        }
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern(padrao);
        return data.format(formatador);
    }

    public static long calcularDiferencaEmDias(LocalDate dataInicio, LocalDate dataFim) {
        return ChronoUnit.DAYS.between(dataInicio, dataFim);
    }

    public static boolean isAnoBissexto(int ano) {
        return Year.isLeap(ano);
    }
}