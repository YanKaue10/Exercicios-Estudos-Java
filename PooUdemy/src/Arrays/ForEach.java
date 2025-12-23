package Arrays;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        double [] notasAlunosA = { 7.9, 8, 6.7, 9.7 };
        double total =0;
        for (double notas : notasAlunosA){
            total += notas;
        }
        System.out.println("Notas do aluno A: " + Arrays.toString(notasAlunosA));
        System.out.println("\nMédia das notas do aluno A: " + total / notasAlunosA.length);

        double[] notasAlunosB = { 6.9, 8.9, 5.9, 10 };
        for (double notasB : notasAlunosB){
            total += notasB;
        }
        System.out.println("Notas do aluno B: " + Arrays.toString(notasAlunosB));
        System.out.println("Média das notas do aluno B: " + total / notasAlunosB.length);

    }
}
