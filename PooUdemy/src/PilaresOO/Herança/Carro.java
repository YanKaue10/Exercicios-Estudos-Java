package PilaresOO.Herança;

public class Carro {
    private String marca;
    private String modelo;

    public Carro() {
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void tipoVeiculo() {
        System.out.println("É um carro ou uma moto ?");
        if (marca.equalsIgnoreCase("honda") && modelo.equalsIgnoreCase("cg")) {
            System.out.println("É uma moto do modelo: " + modelo + " da marca " + marca);
        } else if (marca == "Chevrolet" && modelo == "Camaro") {
            System.out.println("É um carro do modelo : " + modelo + " da marca " + marca);
        } else {
            System.out.println("Veículo desconhecido (" + marca + " " + modelo + ")");
        }
    }

    public void TipoCarro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("O carro é da marca: " + this.marca + " e modelo " + this.modelo + "!");

    }

    public void tipoMoto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("A moto é da marca: " + this.marca + " e modelo " + this.modelo + "!");

    }
}