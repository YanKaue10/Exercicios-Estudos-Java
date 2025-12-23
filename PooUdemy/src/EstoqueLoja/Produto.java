package EstoqueLoja;

public class Produto {
    String nome;
    double preco;
    int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Quantidade adicionada ao estoque!");
        } else {
            System.out.println("Não foi possivel adicionar essa quantidade ao estoque");
        }
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Quantidade removida ao estoque!");
        } else {
            System.out.println("Quantdidade Insuficiente em estoque");
        }
    }

    String exibirInfo() {
        return "Nome: " + nome + " | Preço: " + preco + " | Quantidade: " + quantidade;
    }

    String qtdAtual() {
        return " Quantidade: " + quantidade;
    }
}
