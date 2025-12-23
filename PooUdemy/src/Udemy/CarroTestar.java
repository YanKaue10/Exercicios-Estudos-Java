package Udemy;

public class CarroTestar {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.nome = "X1";
        carro.ano = 1980;
        carro.modelo = "BMW";
        carro.velocidade = 130;

        carro.acelerar(10);
        System.out.println("Acelerou em: " + carro.velocidade);

        carro.reduzir(40);
        System.out.println("Reduzir velocidade: " + carro.velocidade);
        carro.buzinar();
    }
}
