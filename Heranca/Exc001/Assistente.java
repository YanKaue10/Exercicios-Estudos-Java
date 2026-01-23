public class Assistente extends Funcionario {
    int nmrMatricula;

    public Assistente(String nome, double salario) {
        super(nome, salario);

    }
    
    public void exibirDados(){
        super.exibeDados();
        System.out.println("Número de Matrícula: " + nmrMatricula);
        }

    public int getNmrMatricula() {
        return nmrMatricula;
    }

    public void setNmrMatricula(int nmrMatricula) {
        this.nmrMatricula = nmrMatricula;
    }


}
