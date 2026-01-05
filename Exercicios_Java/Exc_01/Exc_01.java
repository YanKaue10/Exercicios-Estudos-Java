import java.util.Scanner;

public class Exc_01 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        String letra;
        System.out.print("Digite uma letra: ");
        letra = sc.nextLine().toLowerCase();
        //letra = letra.toLowerCase();
        switch (letra) {
            
            case "a","e","i","o","u":
            System.out.println("É uma Vogal!");
            break;
            
            default:
                System.out.println("É uma Consoante!");
        }

    }

}
