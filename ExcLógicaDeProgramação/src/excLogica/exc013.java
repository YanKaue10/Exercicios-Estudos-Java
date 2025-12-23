package excLogica;

import java.util.Scanner;

public class exc013 {
/*Faça um programa que leia três valores e apresente o maior dos três valores 
 * lidos seguido da mensagem “eh o maior”.
 *  Utilize a fórmula:  
 */
	
//A função Math.abs(x) retorna o valor absoluto de x,
//ou seja, transforma qualquer número negativo em positivo.	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		
		int maiorAB = (a + b + Math.abs(a - b))/2;
		int maiorFinal = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

		System.out.println(maiorFinal + " eh o maior");

	}

}
