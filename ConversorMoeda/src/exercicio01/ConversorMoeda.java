package exercicio01;

public class ConversorMoeda {
    private static double taxaDolar = 5.10;
    private static double taxaEuro = 5.50;

    private ConversorMoeda() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada.");
    }

    public static void atualizarTaxas(double novaTaxaDolar, double novaTaxaEuro) {
        taxaDolar = novaTaxaDolar;
        taxaEuro = novaTaxaEuro;
    }

    public static double realParaDolar(double valorReais) {
        return valorReais / taxaDolar;
    }

    public static double dolarParaReal(double valorDolares) {
        return valorDolares * taxaDolar;
    }

    public static double realParaEuro(double valorReais) {
        return valorReais / taxaEuro;
    }

    public static double euroParaReal(double valorEuros) {
        return valorEuros * taxaEuro;
    }

    public static void clear(double v, double v1) {
    }
}