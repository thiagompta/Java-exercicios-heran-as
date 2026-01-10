package br.com.exercicio6;

public class Servico implements Vendavel{

    @Override
    public void precoTotal(double preco, int quantidade, double desconto) {
        double valor = preco - desconto;
        System.out.println("O serviço contratado custou R$: " +preco + " mas com o desconto de R$" + desconto + " ficou no total R$"+valor);
    }
}
