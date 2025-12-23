package Arrays.excs;

import java.util.Arrays;

// Remova um elemento específico do array
//
//Escreva um programa Java para remover um elemento específico de um array.
public class exc006 {
    public static void main(String[] args) {
        int[] remover = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(remover));

        int delet = 4;
        for (int i = delet; i < remover.length - 1; i++) {
            remover[i] = remover[i + 1];
        }
        System.out.println("After removing the 4 element: " + Arrays.toString(remover));
    }
}
