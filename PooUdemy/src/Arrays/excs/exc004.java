package Arrays.excs;

//Calcular a média dos elementos do array
//
//Escreva um programa Java para calcular o valor médio dos elementos do array.
public class exc004 {
    public static void main(String[] args) {
        int[] array = {7, 8, 9, 5, 6, 4, 6};
        int total = 0;
        for (int soma : array) {
            total += soma;
        }
        System.out.println("O total é : " + total);
        double media = total / array.length;
        System.out.println("A media é : " + media);
    }
}
