package ExercicioModuloClasseVsMetodo;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.100);
        Comida c2 = new Comida("Feijão", 0.300);
        Pessoa p1 = new Pessoa("Carlos", 99.8);

        System.out.println(p1.apresentar());// Se apresenta e depois come(lá ele)
        p1.comer(c1);
        System.out.println(p1.apresentar());//Se apresenta e depois comer
        p1.comer(c2);
        System.out.println(p1.apresentar());//Se apresenta e depois come

    }

}
