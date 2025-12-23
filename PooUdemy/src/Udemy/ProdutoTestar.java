package Udemy;

public class ProdutoTestar {

    public static void main(String[] args) {
        //construtor padrao
        Produto2 p1 = new Produto2();
        p1.nome = "Udemy.Carro";
        p1.descricao = "Anda em 4 rodas";
        p1.preco = 2000;
        //construtor com dois parametros
        Produto2 p2 = new Produto2("Iphone");
        //construtor com 3 parametros
        Produto2 p3 = new Produto2("Ventilador", "Usado para espantar mosquitos");
        //construtor com 4 parametros
        Produto2 p4 = new Produto2("Carregador", "Usado para carregar celular", 2000);


        //Objeto P1
        System.out.println("O nome do objeto é: " + p1.nome);
        System.out.println("Descrição: " + p1.descricao);
        System.out.println("Preço: " + p1.preco);

        //Objeto p2
        System.out.println("O nome do objeto é: " + p2.nome);
        //Objeto p3
        System.out.println("Caracteristicas do Objeto é: " + p3.nome + p3.descricao);
        //objeto p4
        System.out.println("Caracteristicas do Objeto é: " + p4.nome + p4.descricao + p4.preco);

    }
}
