package excLogica;

import java.util.Scanner;

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
*/

public class exc002 {

	public static void main(String[] args) {
		
		double n1 = 8;
		double n2 = 9;
		double n3 = 7; 
		
		double n4 = 4;
		double n5 = 5 ;
		double n6 = 6; 
		
		double somagp1 = n1 + n2 + n3; 
		double media = somagp1 /3; 
		double somagp2 = n4 + n5 + n6; 
		double media2 = somagp2 /3; 
		
		double somaMedias = media + media2;
		double mediaDasMedias = somaMedias / 2;
		System.out.println("Média do primeiro grupo (8, 9, 7): " + media);
        System.out.println("Média do segundo grupo (4, 5, 6): " + media2);
        System.out.println("Soma das duas médias: " + somaMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
		
	
	
	} 

}
