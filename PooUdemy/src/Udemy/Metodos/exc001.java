package Udemy.Metodos;

import java.util.Scanner;

//Find Smallest Number Among Three
//
//Write a Java method to find the smallest number among three numbers.
public class exc001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int y = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int z = sc.nextInt();
        System.out.print("The smallest value is " + menorNumero(x, y, z) + "\n");
    }

    public static double menorNumero(int x, int y, int z) {
        int menor = x;
        if (y < menor) {
            menor = y;
        }
        if (z < menor) {
            menor = z;
        }
        return menor;
    }
}
