package EntendendoPOO;

import java.util.Scanner;

public class ContaTitular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do titular: ");
        String nomeTitular = sc.nextLine();
        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(nomeTitular, saldoInicial);

        int opcao;
        do {
            System.out.println("\n--- Meu Banco ---");
            System.out.println("1-- Depositar");
            System.out.println("2-- Sacar");
            System.out.println("3-- Consultar Saldo");
            System.out.println("0-- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    double depositar = sc.nextDouble();
                    contaBancaria.depositar(depositar);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    contaBancaria.sacar(saldoInicial);
                    break;
                case 3:
                    System.out.println("Digite 3 para consultar o saldo atual da conta");
                    contaBancaria.mostrarSaldo();
                    break;
                case 0:
                    System.out.println("Fim");
                    break;
            }
        }
        while (opcao != 0);
    }
}
