package ExcEstruturaDeControle;

public class exc04_For {

	public static void main(String[] args) {

		String controle = "*";

		for (String valor = "*"; controle.length() <= 5; controle += "*") {
			System.out.println(valor);
			valor += "*";
		}
		
		for(String v = "*"; !v.equals("******"); v+="*") {
			System.out.println(v);
		}
	}

}
