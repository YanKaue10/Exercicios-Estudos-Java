public class Admnistrativo extends Funcionario {
    String turno;

    public Admnistrativo(String nome, double salario, String turno) {
        super(nome, salario);
        this.turno = turno;

    }

    public double calcularAdicional() {
        if (turno.equalsIgnoreCase("Noturno")) {
            return 500.0;
        } else{
            return 0.0;
        }

    }
        
public void exibirDados(){
    super.exibeDados();
    System.out.println("Turno: " + turno);

      double adicional = calcularAdicional();

      if (adicional > 0 ) {
        System.out.println("Adicional por turno noturno: " + adicional);
        System.out.println("Salário com adicional: " + (salario + adicional));
      } else {
        System.out.println("Sem adicional por turno.");
      } 
}
}
