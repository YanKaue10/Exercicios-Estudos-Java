public class Salarios {

    private String nomeFuncionario;
    private double salarioAtual;
    private double percentual; 
    private double salarioAntigo;

    public Salarios(String nomeFuncionario, double salarioAtual) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioAtual = salarioAtual;
        this.salarioAntigo = salarioAtual; 
    }

    public void aplicarReajuste(){
        if (salarioAtual < 280) {
            percentual = 20;
        } else if (salarioAtual < 700) {
            percentual = 15;
        } else if ( salarioAtual < 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }
           salarioAtual += salarioAtual * (percentual / 100);
    }

    public double getSalarioAntigo() {
        return salarioAntigo;
    }
    public double getPercentual() {
        return percentual;
    }
    public double getSalarioAtual() {
        return salarioAtual;
    }
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public double getValorDoAumento(){
        return salarioAtual - salarioAntigo;
    }
    public double getNovoSalario(){
        return salarioAtual;
    }
}

