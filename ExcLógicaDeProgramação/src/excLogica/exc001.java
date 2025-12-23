package excLogica;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class exc001 {
	
	public static void main(String [] args) {
	
	/*int ano;
	int meses; 
	int dias; 
	
	Scanner sc = new Scanner(System.in); 
	 System.out.print("Digite quantos anos de idade voce tem?");
	 ano = sc.nextInt();
	 System.out.println("Digite o mes alem do ano que voce nasceu");
	 meses = sc.nextInt();
	 System.out.println("Digite o dia além do mes em que voce nasceu");
	 dias = sc.nextInt();
	 
	 int soma = (ano * 365) + (meses * 30) + dias;
	 
	 System.out.println("Voce tem " + soma + "  dias de vida" );
	*/
		
	//usando uma solução um pouco melhor usando o LocalDate 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o ano em que voce nasceu: ");
		int ano = sc.nextInt(); 
		System.out.println("Digite o mes em que voce nasceu: ");
		int mes = sc.nextInt(); 
		System.out.println("Digite o dia em que voce nasceu: ");
		int dia = sc.nextInt();
		
		
		LocalDate IdadeAnos = LocalDate.of(ano,mes,dia);
		
		LocalDate  dataAtual = LocalDate.now(); 
		 long diasDeVida = ChronoUnit.DAYS.between(IdadeAnos, dataAtual);
		 System.out.println("Você tem " + diasDeVida + " dias de vida.");
	}
}
