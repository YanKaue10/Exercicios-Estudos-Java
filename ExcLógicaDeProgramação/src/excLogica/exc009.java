package excLogica;

import java.util.Scanner;

public class exc009 {
/**
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
 * no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 * informar o total a receber no final do mês, com duas casas decimais.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		nome = sc.next();
		double salario; 
		salario = sc.nextDouble();
		double totalVendas;
		totalVendas = sc.nextDouble();
		
		double totalMes = salario + (totalVendas * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", totalMes);

	}

}
