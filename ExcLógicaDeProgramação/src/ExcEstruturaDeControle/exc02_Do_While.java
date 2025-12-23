package ExcEstruturaDeControle;

import java.util.Scanner;

public class exc02_Do_While {
	/*
	Declara uma string vazia, um loop do vai executar um prompt pedindo uma palavra mágica, e o programa só vai parar quando
	o usuario digitar quando a palavra magica for "amem", definida no while. 
	*/

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String sair = ""; 
		do {
			System.out.println("Voce precisa da palavra magica");
			sair = sc.nextLine();
			
		}while(!sair.equalsIgnoreCase("Amem"));
			
		System.out.println("Acesso liberado!");
		sc.close();
	}

}
