package password;

import java.util.Scanner;

public class passwordTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite a senha: ");
			String senha = sc.nextLine();

			StringBuilder erros = new StringBuilder();
			
			if(senha.length() < 8) {
				erros.append("- A senha deve ter no minimo 8 caracters\n");
			}
			
			boolean temLetraMaiuscula = false;
			for(char c: senha.toCharArray()) {
				if(Character.isUpperCase(c)) {
					temLetraMaiuscula = true;
					break; 
				}
			}
			if(!temLetraMaiuscula) {
				erros.append("A senha deve ter pelo menos uma letra maiuscula\n");
			}
			
			boolean temNumero = false;
			for(char c: senha.toCharArray()) {
				if(Character.isDigit(c)) {
					temNumero = true;
				}
			}
			if(!temNumero) {
				erros.append("A senha deve ter pelo menos um numero\n");
			}
	
			boolean temCaracterEspecial = false; 
			String especial = "!@#$%¨&*()_+{}[]:;'\"<>,.?/~^`|-=\r\n"; 
			for (char c: senha.toCharArray()) {
				if(especial.indexOf(c) != -1) {
					temCaracterEspecial = true; 
					break; 
				}
			}
			if(!temCaracterEspecial) {
				System.out.println("A senha deve conter ao menos um caracter especial\n");
			}
			
			if(erros.length() == 0) {
				System.out.println("Senha aceita");
			} else {
				System.out.println("Senha invalida. Verifique os seguintes erros");
				System.out.println(erros);
			}
			
		}
	}

}
