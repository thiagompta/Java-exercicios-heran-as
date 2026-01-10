package br.com.exercicio3;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        int tabuada = 1;
        System.out.println("Tabela de multiplicação do numero: " + numero);
        while(tabuada < 11){
            System.out.println(numero + "x" + tabuada + "=" + numero * tabuada);
            tabuada++;
        }
    }
}
