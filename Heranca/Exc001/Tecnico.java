public class Tecnico extends Funcionario {

    double bonus;
  

    public Tecnico(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

   
    public double bonusSalarial(double salario){
        return salario + bonus; 
    }

    public double ganhoAnualcomBonus(){
        return ganhoAnual() + bonus;
    }

    public void exibirDados(){
        super.exibeDados();
        System.out.println("Bonus Anual: " + bonus);
        System.out.println("Salário Anual + Bônus: " + ganhoAnualcomBonus());
    }

}
