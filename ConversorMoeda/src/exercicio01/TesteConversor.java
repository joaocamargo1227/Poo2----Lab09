package exercicio01;

public class TesteConversor {
    public static void main(String[] args) {
        System.out.println("--- TESTE EXERCÍCIO 1: CONVERSOR DE MOEDAS ---");

        double valorEmReais = 500.00;

        System.out.printf("R$ %.2f em Dólares: US$ %.2f\n", valorEmReais, ConversorMoeda.realParaDolar(valorEmReais));
        System.out.printf("R$ %.2f em Euros: € %.2f\n", valorEmReais, ConversorMoeda.realParaEuro(valorEmReais));

        System.out.println("\n-> Atualizando taxas de câmbio...");
        ConversorMoeda.clear(5.40, 5.80);

        System.out.printf("Após atualização - R$ %.2f em Dólares: US$ %.2f\n", valorEmReais, ConversorMoeda.realParaDolar(valorEmReais));
    }
}