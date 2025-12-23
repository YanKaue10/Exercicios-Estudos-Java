package ExcEstruturaDeControle;

import java.util.Scanner;

public class exc05_EstruturasDeRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero entre 0 e 10: ");
		int nmr = sc.nextInt();

		if (nmr >= 0 && nmr <= 10 && nmr % 2 ==0) {
			System.out.println("Numero está entre 0 e 10, então é número par");
		}else if(nmr>=0 && nmr <=10 && nmr %2 !=0) {
			System.out.println("Numero está entre 0 e 10 mas não é divisivel por 2(tem resto). Sendo assim, é um numero impar");
		} else {
			System.out.println("Numero não está entre 0 e 10");
		}
		sc.close();
	}

}
