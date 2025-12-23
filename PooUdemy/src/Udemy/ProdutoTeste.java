package Udemy;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2000.00);

        var p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 200.00;

        Produto.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.comDesconto();
        double precoFinal2 = p2.comDesconto();

        System.out.println("O desconto do Notebook é de: " + precoFinal1);
        System.out.println("O desconto do celular é de: " + precoFinal2);
    }
}
