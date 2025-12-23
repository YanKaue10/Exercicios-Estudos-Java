package Udemy;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaTriangulo X = new AreaTriangulo();
        AreaTriangulo Y = new AreaTriangulo();

        System.out.println("Digite a area do triangulo x: ");
        X.a = sc.nextDouble();
        X.b = sc.nextDouble();
        X.c = sc.nextDouble();
        System.out.println("Digite a area do triangulo y: ");
        Y.a = sc.nextDouble();
        Y.b = sc.nextDouble();
        Y.c = sc.nextDouble();

        double areaX = X.area();
        double areaY = Y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Área do triângulo X é maior");
        } else {
            System.out.println("Área do triângulo Y é maior");
        }

    }
}
