package br.com.exercicio6;

public class Produto implements  Vendavel{

    @Override
    public void precoTotal(double preco, int quantidade, double desconto) {
        double valor = preco * quantidade - desconto;
        System.out.println("Voce comprou " + quantidade + " a R$"+preco + " e o valor total é R$" + valor);
    }
}
