package br.com.exercicio5;

public class ProdutoFisico implements Calculavel{
    @Override
    public void calcularPrecoFinal(double preco, double desconto, double taxaAdd) {
        double precoFinal = preco - desconto + taxaAdd;
        System.out.println("Preço final do livro: R$" + precoFinal);
    }
}
