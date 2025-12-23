package EntendendoPOO;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro bob = new Cachorro();
        bob.tamanho = 50;
        Cachorro rex = new Cachorro();
        rex.tamanho = 15;
        Cachorro scooby = new Cachorro();
        scooby.tamanho = 35;

        bob.latir();
        rex.latir();
        scooby.latir();

    }
}
