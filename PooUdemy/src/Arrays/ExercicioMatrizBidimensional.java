package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioMatrizBidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos: ");
        int qtdAlunos = sc.nextInt();
        System.out.println("Quantos notas por aluno: ");
        int qtdNotas = sc.nextInt();

        double[][] notasDaTurmma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurmma.length; i++) {
            for (int j = 0; j < notasDaTurmma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", (i + 1), (j + 1));
                notasDaTurmma[i][j] = sc.nextDouble();
                total += notasDaTurmma[i][j];
            }
            System.out.println("As notas do aluno " + (i + 1) + " : " + Arrays.toString(notasDaTurmma[i]));
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("\nMatriz das notas dos alunos: " + Arrays.deepToString(notasDaTurmma));
        System.out.println("A media é: " + media);
    }
}
