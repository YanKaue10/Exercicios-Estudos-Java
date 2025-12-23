package PilaresOO.Herança;

public class Dias {
    int dias;

    public Dias(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void mostrarDias() {
        if (this.dias == 1) {
            System.out.println(DiasSemana.SEGUNDA);
        } else if (dias == 2) {
            System.out.println(DiasSemana.TERCA);
        } else if (dias == 3) {
            System.out.println(DiasSemana.QUARTA);
        } else if (dias == 4) {
            System.out.println(DiasSemana.QUINTA);
        } else if (dias == 5) {
            System.out.println(DiasSemana.SEXTA);
        } else if (dias == 6) {
            System.out.println(DiasSemana.DOMINGO);
        } else {
            System.out.println("Dia da semana invalido");
        }

    }
}
