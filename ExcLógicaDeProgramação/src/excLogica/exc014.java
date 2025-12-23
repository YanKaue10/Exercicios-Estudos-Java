package excLogica;

import java.util.Scanner;

/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total
 * percorrida (em Km)
 * e o total de combustível gasto (em litros).
 */
public class exc014 {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			float distanciaTotal = sc.nextFloat();
			float totalCombustivel = sc.nextFloat();
			
			double consumoMedio = (distanciaTotal / totalCombustivel);
			System.out.printf( "%.3f km/l%n",consumoMedio);
			
			
		}
}
