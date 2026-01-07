import java.util.Scanner;
public class Folha_De_Pagamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();  
        System.out.print("Digite o valor por hora trabalhada: ");
        double valorPorHora = sc.nextDouble();  

        Imposto_De_Renda folhaPagamento = new Imposto_De_Renda(horasTrabalhadas, valorPorHora); 
        
        folhaPagamento.getSalarioBruto();
        folhaPagamento.getIR();
        folhaPagamento.getINSS();
        folhaPagamento.getSindicato();
        folhaPagamento.getSalarioLiquido();
        folhaPagamento.getFGTS();

        System.out.println("Salário Bruto:  " + folhaPagamento.getSalarioBruto());
        System.out.println("IR: " + folhaPagamento.getIR());
        System.out.println("INSS:  " + folhaPagamento.getINSS()); 
        System.out.println("Sindicato: " + folhaPagamento.getSindicato());
        System.out.println("Salário Líquido: " + folhaPagamento.getSalarioLiquido());
        System.out.println("FGTS:  " + folhaPagamento.getFGTS());  
        sc.close();

    }

}
