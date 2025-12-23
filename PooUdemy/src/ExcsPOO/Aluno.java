package ExcsPOO;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    double calcularMedia(){
        return  (nota1+nota2+nota3)/3;
    }
     String resultado(){
        double media = calcularMedia();
        if (media>=7){
            return "Aprovado";
        } else if(media>=5){
            return "Recuperação";
        } else{
            return "Reprovado";
        }
    }
}

