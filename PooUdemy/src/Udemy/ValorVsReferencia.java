package Udemy;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;
        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 7, 1970);
        Data d2 = d1;

        d1.dia = 19;
        d1.mes = 12;
        d1.ano = 1990;
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 12;
        d.ano = 1970;
    }

}
