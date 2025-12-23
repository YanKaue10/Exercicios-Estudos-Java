package EstoqueLoja;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Digite a quantidade a ser adicionada!");
        int qtdProduto = sc.nextInt();

        System.out.print("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();
        sc.nextLine();

        Produto produto = new Produto(nomeProduto, precoProduto, qtdProduto);

        int opcao;

        do {
            System.out.print("Escolha uma opção: ");
            sc.nextLine();
            System.out.println("\n--- Mercadinho do seu Zé ---");
            System.out.println("1-- Alterar o nome do produto");
            System.out.println("2-- Adicionar quantidade ao estoque");
            System.out.println("3-- Remover quantidade do estoque");
            System.out.println("4-- Alterar o preco do produto ");
            System.out.println("5-- Exibir Informações do produto");
            System.out.println("6-- Mostrar Quantidade atual");
            System.out.println("0-- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o novo nome do produto: ");
                    produto.nome = sc.nextLine();
                    break;
                case 2:
                    System.out.print("Digite a quantidade do produto a ser adicionada!: ");
                    int quantidadeAdicionada = sc.nextInt();
                    produto.adicionarEstoque(quantidadeAdicionada);
                    break;
                case 3:
                    System.out.print("Digite a quantidade do produto a ser removida: ");
                    int quantidadeRemovida = sc.nextInt();
                    produto.removerEstoque(quantidadeRemovida);
                    break;
                case 4:
                    System.out.print("Digite o preco do produto a ser adicionado: ");
                    produto.preco = sc.nextDouble();
                    break;
                case 5:
                    System.out.println(produto.exibirInfo());
                    break;
                case 6:
                    System.out.println(produto.qtdAtual());
                    break;
                case 0:
                    System.out.println("Encerrando o sistema de estoque....");
                default:
                    System.out.println("Opção inválida!");
            }
        }
        while (opcao != 0);
        sc.close();


    }
}

