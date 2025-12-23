package Arrays.excs;

import java.util.Arrays;

//Escreva um programa Java para classificar uma matriz numérica e uma matriz de strings.
public class exc001 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] array2 = {"Java", "C++", "Python", "Java Script", "Golang", "Typscripty"};

        System.out.println("Meu array 1: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Meu array 2: " + Arrays.toString(array2));
        Arrays.sort(array2);
    }
}
