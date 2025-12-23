package Arrays.excs;

//Escreva um programa Java para somar valores de um array.
public class exc002 {
    public static void main(String[] args) {
        int[] soma = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somasTotal = 0;
        for (int somas : soma) {
            somasTotal += somas;
            System.out.println("The sum is " + somasTotal);
        }

    }
}
