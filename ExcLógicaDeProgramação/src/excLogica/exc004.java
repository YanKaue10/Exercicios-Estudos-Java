package excLogica;

import java.util.Scanner;

public class exc004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area; 
		final double PI = 3.14159; 
		
		raio = sc.nextDouble();
		area = PI * (raio * raio); 
		System.out.printf("A=%.4f\n" , area);
		
		sc.close();
	}

}
