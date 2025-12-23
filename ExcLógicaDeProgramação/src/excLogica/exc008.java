package excLogica;

import java.util.Scanner;

/**
 * Escreva um programa que leia o número de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por hora e calcula o salário desse
 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
 * casas decimais.
 * 
 */

public class exc008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nmrFunc;
		int nmrHrsTrabalhadas;
		double valorHrs;
		
		nmrFunc = sc.nextInt();
		nmrHrsTrabalhadas = sc.nextInt();
		valorHrs = sc.nextDouble();
		
		System.out.println("NUMBER = " + nmrFunc);
		double salario = (nmrHrsTrabalhadas * valorHrs); 
		System.out.printf("SALARY = U$ %.2f\n", salario);

	}

}
