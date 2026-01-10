package br.com.exercicio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(int altura, int largura) {
        int area = altura * largura;
        System.out.println("A area do perimetro é de:" + area);
    }

    @Override
    public void calcularPerimetro(int altura, int largura) {
        int perimetro = 2 * (altura + largura);
        System.out.println("A area do perimetro é de:" + perimetro);

    }
}
