package ExcEstruturaDeControle;

import java.util.Scanner;

public class exc01_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double quantidadeNotas = 0;
		double total = 0;
		double nota = 0;

		while (nota != -1) {
			System.out.println("Digite uma nota entre 0 e 10 (um valor negativo ou maior que 10 para sair): ");
			nota = sc.nextDouble();

			if (nota > 0 && nota <= 10) {
				total = total + nota;
				quantidadeNotas++;
			} else {
				if (nota != -1) {
					System.out.println("Nota inválida! Tente novamente.");
				} else {
					if (quantidadeNotas > 0) {
						double media = total / quantidadeNotas;
						System.out.println("Média das notas: " + media);
					} else {
						System.out.println("Nenhuma nota válida foi inserida.");
					}
				}

			}
		}

	}
}
