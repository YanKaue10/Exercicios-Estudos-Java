package Coletions;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<String> alunosAprovados = new HashSet<>();
        alunosAprovados.add("João");
        alunosAprovados.add("Pedro");
        alunosAprovados.add("Jorge");

        for (String alunos : alunosAprovados) {
            System.out.println(alunos);
        }
    }
}
