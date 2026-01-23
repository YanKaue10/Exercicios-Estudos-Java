public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double addAumento(double valor) {
        return salario + valor;
    }

    public double ganhoAnual(){
        return salario * 12;
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Ganho Anual: " + ganhoAnual());
        System.out.println("Salário com Aumento: " + addAumento(500.0));
    }

}
