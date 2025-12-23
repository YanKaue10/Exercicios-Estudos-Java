package PilaresOO.Herança;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a o numero correspondente ao dia (1 - 7): ");
        int numero = sc.nextInt();
        Dias dia = new Dias(numero);
        dia.mostrarDias();
    }
}
