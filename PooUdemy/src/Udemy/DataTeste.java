package Udemy;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 13;
        d1.mes = 12;
        d1.ano = 2019;
        Data d2 = new Data(13, 01, 2005);
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
