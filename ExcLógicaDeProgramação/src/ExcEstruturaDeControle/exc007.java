package ExcEstruturaDeControle;

import java.util.Iterator;
import java.util.Scanner;

public class exc007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0; 
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt(); 
		
		 for (int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		 if(contador == 0) {
			 System.out.println("o numero é primo");
		 }else {
			 System.out.println("Numero não é primo");
		 }
		sc.close();
	}

}
