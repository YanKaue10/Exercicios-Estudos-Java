import java.util.Scanner;

public class Aumento_Salarial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        Salarios funcionSalarios = new Salarios(nome, salario);
        funcionSalarios.aplicarReajuste();

        System.out.println("Funcionário: " + funcionSalarios.getNomeFuncionario());
        System.out.println("Salario antes do reajuste: " + funcionSalarios.getSalarioAntigo());
        System.out.println("Percentual de aumento: " + funcionSalarios.getPercentual() + "%");
        System.out.println("Valor do aumento: R$ " + funcionSalarios.getValorDoAumento());
        System.out.println("Novo salário: R$ " + funcionSalarios.getNovoSalario());
    }


}
