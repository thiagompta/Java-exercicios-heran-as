package br.com.exercicio4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double numero;
        numero = celsius;
        celsius = (celsius * 9 / 5) + 32;
        System.out.println(numero + "°C é em " + celsius + "°F ");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double numero;
        numero = fahrenheit;
        fahrenheit = (fahrenheit - 32) * 5 / 9;
        System.out.println(numero + "°F é em " + fahrenheit + "°C ");
    }
}
