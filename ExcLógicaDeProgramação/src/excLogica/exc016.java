package excLogica;

import java.util.Scanner;

public class exc016 {
	/*
	 * fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
	 * semana, sendo(1 = domingo, 2 segunda, etc...) Escrever ma tela o dia da
	 * semana correspondente.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default: 
			System.out.println("Valor invalido");
			break; 
		}
		
		sc.close();
	}

}
