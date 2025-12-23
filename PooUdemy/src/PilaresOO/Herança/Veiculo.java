package PilaresOO.Herança;

public class Veiculo extends Carro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("honda", "Camaro");
        carro1.tipoVeiculo();

        Carro carro2 = new Carro("bmw", "cg");
        carro2.tipoVeiculo();

        System.out.println("------------------");

        //testa metodos especificos passando valores diretos
        carro1.TipoCarro("bmw", "x1");
        carro2.TipoCarro("bmw", "x4");
        carro2.tipoMoto("honda", "twin 1100");
        carro2.tipoMoto("honda", "cb650");
    }
}
