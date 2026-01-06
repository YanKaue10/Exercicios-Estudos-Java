import java.util.Scanner; 

public class Turno_M_V {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o horário de início da sua aula: ");
        int inicio = sc.nextInt();
        System.out.println("Digite o horário de fim da sua aula: ");
        int fim = sc.nextInt();

        if (inicio >= 5 && fim <= 12) {
            System.out.println("M - Matutino");
        } else if (inicio >= 13 && fim <= 18) {
            System.out.println("V - Vespertino");
        } else if (inicio >= 19 && fim <= 24) {
            System.out.println("N - Noturno");
        } else {
            System.out.println("Turno Inválido");
            
        }
        sc.close();
    }

}