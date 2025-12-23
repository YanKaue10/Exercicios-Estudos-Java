package ExcEstruturaDeControle;

public class exc001 {
	/* Execução do do while
	 * Declaração de variável x com valor inicial 12
	 * O do decrementa o valor de x em 1 enquanto x for maior que 10, caso ainda seja maior, ele volta para o do e decrementa mais um
	 * , caso não seja maior, o loop termina
	 * Após a conclusão do loop, imprime o valor final de x
	 */

	public static void main(String[] args) {
		int x = 12; 
		do {
			x--;
		} while (x > 10);
			System.out.println("O valor de x é : " + x);
	}

}
