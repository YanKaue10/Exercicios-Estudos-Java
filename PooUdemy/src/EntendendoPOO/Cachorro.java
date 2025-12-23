package EntendendoPOO;

public class Cachorro {
    String nome;
    int tamanho;

    void latir() {
        if (tamanho > 60) {
            System.out.println("Wowff");
        } else if (tamanho > 14) {
            System.out.println("ruf ruf");
        } else {
            System.out.println("yip");
        }
    }
}
