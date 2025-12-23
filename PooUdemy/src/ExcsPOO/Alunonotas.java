package ExcsPOO;

import java.util.Scanner;

public class Alunonotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        System.out.println("Digite o nome do primeiro aluno: ");
        a1.nome = sc.nextLine();

        System.out.println("Digite o nome do segundo aluno: ");
        a2.nome = sc.nextLine();

        System.out.println("Digite as 3 notas do primeiro aluno: ");
        a1.nota1 = sc.nextDouble();
        a1.nota2 = sc.nextDouble();
        a1.nota3 = sc.nextDouble();

        System.out.println("Digite o nota do segundo aluno: ");
        a2.nota1 = sc.nextDouble();
        a2.nota2 = sc.nextDouble();
        a2.nota3 = sc.nextDouble();

        double mediaa1 = a1.calcularMedia();
        double mediaa2 = a2.calcularMedia();

        System.out.println("Aluno: " + a1.nome + " - Média: " + a1.calcularMedia() + " - " + a1.resultado());
        System.out.println("Aluno: " + a2.nome + " - Média: " + a2.calcularMedia() + " - " + a2.resultado());

        sc.close();
    }
}

