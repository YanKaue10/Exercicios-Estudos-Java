package excLogica;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class exc017 {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o numero: "); 
		int numero = Integer.parseInt(valor); 
		
		if(numero % 2 == 0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
		
	}

}
