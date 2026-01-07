import java.util.Scanner;

public class Dia_Semana_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();

        String[] diaSemana= {
            "Domingo",
            "Segunda-feira",
            "Terça-feira",
            "Quarta-feira",
            "Quinta-feira",
            "Sexta-feira",
            "Sábado"
        };

        if (dia != 0 && dia < 7) {
            System.out.println(diaSemana[dia - 1]);
        } else {
            System.out.println("Número inválido! Por favor, digite um número entre 1 e 7.");
        }
        sc.close();
    }

}
