package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero de notas: ");
        int numero = sc.nextInt();

        double[] notas = new double[numero];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite o nome do nota: " + (i + 1) + ":");
            notas[i] = sc.nextDouble();
        }
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        sc.nextLine();
        System.out.println("Notas " + Arrays.toString(notas));
        double media = total / numero;

        System.out.println("Media das notas = " + media);
        if (media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if (media <= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}

