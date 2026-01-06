import java.time.LocalTime;
import java.util.Scanner;

public class Turno_Versao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o horário de início da sua aula (hrs:min): ");
        String inicioStr = sc.nextLine();
        System.out.print("Digite o horário de fim da sua aula (hrs: min): ");      
        String fimStr = sc.nextLine();

        //convertendo a string em localtime
        LocalTime inicioTurno  = LocalTime.parse(inicioStr);
        LocalTime fimTurno     = LocalTime.parse(fimStr);

        //definindo os turnos e horarios
        LocalTime inicioAulaManha = LocalTime.of(7, 0);
        LocalTime fimAulaManha = LocalTime.of(12,0);

        LocalTime inicioAulaTarde = LocalTime.of(13,  0);
        LocalTime fimAulaTarde = LocalTime.of(17, 0);

        LocalTime inicioAulaNoite = LocalTime.of(18, 0);
        LocalTime fimAulaNoite = LocalTime.of(22, 0);

        // verificando os turnos pelos horários

        if (!inicioTurno.isBefore(inicioAulaManha) && !fimAulaManha.isAfter(fimAulaManha)) {
            System.out.println("Seu turno é o Matutino");
        } else if (!inicioTurno.isBefore(inicioAulaTarde) && !fimTurno.isAfter(fimAulaTarde)){
            System.out.println("Seu turno é o Vespertino");
        } else if (!inicioTurno.isBefore(inicioAulaNoite) && !fimTurno.isAfter(fimAulaNoite)){
            System.out.println("Seu turno é o Noturno");
        } else {
            System.out.println("Turno inválido");
        }

    }

}
