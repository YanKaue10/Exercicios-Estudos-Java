  import java.util.Scanner;
public class F_Ou_M {
  

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra (F ou M): ");
        String sexo = sc.nextLine().toLowerCase();
        
        if (sexo.equals("f")) {
            System.out.println("F - Feminino");
        } else if (sexo.equals("m")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }   
        sc.close();
    }

}
