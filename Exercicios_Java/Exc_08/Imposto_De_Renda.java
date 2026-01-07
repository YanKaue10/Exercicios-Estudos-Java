public class Imposto_De_Renda {

    private double salarioBruto;
    private double IR; 
    private double INSS;    
    private double FGTS;
    private double Sindicato; 
    private double salarioLiquido;
    private double HorasTrabalhadas;
    private double ValorPorHora;

    public Imposto_De_Renda(double HorasTrabalhadas, double ValorPorHora) {
        this.HorasTrabalhadas = HorasTrabalhadas;
        this.ValorPorHora = ValorPorHora;
        this.salarioBruto = HorasTrabalhadas * ValorPorHora;
        calcularDescontos();
    }
    public void calcularIR(){
        if(salarioBruto <=900){
            IR = 0; 
        } else if (salarioBruto <= 1.500) {
            IR = salarioBruto * 0.05;
        } else if (salarioBruto <=2.500){
            IR = salarioBruto * 0.10;
        } else {
            IR = salarioBruto * 0.15;
        }
    }

    public void calcularINSS(){
        INSS = salarioBruto * 0.10;
    }
    public void calcularSindicato(){
        Sindicato = salarioBruto * 0.03;
    }

    public void calcularSalarioLiquido(){
        salarioLiquido = salarioBruto - (IR + INSS + Sindicato);
    }
    public void EmpresaFgts(){ 
        FGTS = salarioBruto * 0.11;
    }
    public void calcularDescontos(){
        calcularIR();
        calcularINSS();
        calcularSindicato();
        calcularSalarioLiquido();
        EmpresaFgts();
    }

   public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getIR() {
        return IR;
    }

    public double getINSS() {
        return INSS;
    }

    public double getSindicato() {
        return Sindicato;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public double getFGTS() {
        return FGTS;
    }
    
    
}
