package OO.Composicao;

import java.util.ArrayList;
import java.util.List;

public class CursosTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Lucas");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("JavaScript");

        aluno1.adicionarCurso(curso1); // Aluno 1 foi adicionado no curso1
        aluno2.adicionarCurso(curso2);// aluno 2 foi adicionado no curso 2
        aluno3.adicionarCurso(curso3);// e o aluno 3 foi adicionado no curso 3

        //Criando uma lista de cursos e depois percorrer usando os nomes dos alunos e os nomes dos cursos
        List<Curso> listadeCursos = new ArrayList<>();
        listadeCursos.add(curso1);
        listadeCursos.add(curso2);
        listadeCursos.add(curso3);

        for (Curso curso : listadeCursos) {
            System.out.println("Curso: " + curso.nome);

            for (Aluno aluno : curso.alunos) {
                System.out.println(" - " + aluno.nome);
            }
        }
    }
}
