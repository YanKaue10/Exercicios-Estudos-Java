package Udemy;

public class Carro {
    String nome;
    String modelo;
    int ano;
    int velocidade;

    void acelerar(int aceleracao) {
        velocidade += aceleracao;
    }

    void reduzir(int reduzirVelocidade) {
        velocidade -= reduzirVelocidade;
    }

    void buzinar() {
        System.out.println("BIBIBI");
    }

}
