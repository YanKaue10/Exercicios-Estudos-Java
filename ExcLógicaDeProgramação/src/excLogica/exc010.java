package excLogica;

import java.util.Scanner;

public class exc010 {
	/*
	 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int codigo1 = sc.nextInt();
		int nmrPeca1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		int codigo2 = sc.nextInt();
		int nmrPeca2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();

		double valorPecas = (valorUnitario1 * nmrPeca1) + (valorUnitario2 * nmrPeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n ", valorPecas);
		sc.close();
	}
	

}
