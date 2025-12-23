package excLogica;

import java.util.Scanner;
/*Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
 *  A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 * 
 */

public class exc011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		double raio = sc.nextDouble(); 
		final double PI = 3.14159; 
		
		double volume = (4/3.0) * PI * (raio* raio* raio); 
		System.out.printf("VOLUME = %.3f\n",volume);
	}

}
