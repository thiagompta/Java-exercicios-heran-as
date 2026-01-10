package br.com.exercicio1;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void ConverterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.40;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);

    }
}
