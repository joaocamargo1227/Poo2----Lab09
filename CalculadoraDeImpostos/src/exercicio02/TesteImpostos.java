package exercicio02;

import exercicio02.CalculadoraImpostos;

public class TesteImpostos {
    public static void main(String[] args) {
        System.out.println("--- TESTE EXERCÍCIO 2: CALCULADORA DE IMPOSTOS ---");

        double valorTransacao = 2500.00;
        System.out.printf("Valor base da transação: R$ %.2f\n\n", valorTransacao);

        double impostoISS = CalculadoraImpostos.calcularISS(valorTransacao);
        double impostoICMS = CalculadoraImpostos.calcularICMS(valorTransacao);
        double impostoIRRF = CalculadoraImpostos.calcularIRRF(valorTransacao);

        System.out.printf("Valor do ISS (5%%): R$ %.2f\n", impostoISS);
        System.out.printf("Valor do ICMS (18%%): R$ %.2f\n", impostoICMS);
        System.out.printf("Valor do IRRF (27.5%%): R$ %.2f\n", impostoIRRF);
    }
}