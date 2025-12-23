package Udemy;

public class Produto2 {
    //Atributos
    String nome;
    String descricao;
    double preco;

    //Construtores
    Produto2() {

    }

    Produto2(String nome) {
        this.nome = nome;
    }

    Produto2(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    Produto2(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
