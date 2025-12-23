package PilaresOO.Encapsulamento;

public class Pessoa01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 20);

        /*pessoa2.setNome("Maria Paula"); Não precisaria usar o set pois no construtor pessoa já passa o nome e a idade com parametro, Não precisaria
        usar o set nesse caso. Nem sempre sera necessario.
        System.out.println(pessoa2.getNome());
        */
        
        System.out.println("A pessoa 1 tem : " + pessoa1.getIdade() + "anos de idade ");
        System.out.println("A pessoa 2 tem: " + pessoa2.getIdade());

        pessoa1.setIdade(15);
        System.out.println("Depois de setar a idade a pessoa 1 tem: " + pessoa1.getIdade());

        pessoa2.setIdade(40);
        System.out.println("Depois de setar a idade da pessoa 2 tem: " + pessoa2.getIdade());
    }
}
