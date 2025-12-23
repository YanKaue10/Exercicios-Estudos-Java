package excLogica;

import java.util.Scanner;

/*Uma operadora de telefonia cobra 50,00 por um plano basico que da direito a 100 minutos 
 * de telefone. Cada minuto que execer os 100 minutos custa 2,00. Faça um programa que lê 
 *a quantidade de minutos que a pessoa consumiu, e mostre o valor a ser pago.
 */
public class exc015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.0;

		if (minutos <= 100) {
			System.out.println("Valor a pagar: " + conta);
		} else {
			conta += (minutos - 100) * 2.0;// conta recebe conta(50.0) + minutos excedentes
			// os que passaram dos 100, e multiplica por 2, que é os "juros" aplicados.
			System.out.println("Valor total a pagar: " + conta);
		}
	}
}
