package Udemy;

public class Produto {
    static double desconto = 0.25;
    String nome;
    double preco;

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;

    }

    Produto() {

    }

    double comDesconto() {
        return preco * (1 - desconto);
    }

}
