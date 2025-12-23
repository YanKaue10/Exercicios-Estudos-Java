package Arrays.excs;

// Imprima uma grade de 10x10 traços
//Escreva um programa Java para imprimir a seguinte grade.
public class exc003 {
    public static void main(String[] args) {
        int[][] tracos = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", tracos[i][j]);
            }
            System.out.println();
        }
    }
}
