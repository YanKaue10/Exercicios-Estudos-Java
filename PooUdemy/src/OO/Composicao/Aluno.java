package OO.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    //um metodo para percorrer o nome do curso
    Curso obterNomeCurso(String nomeCurso) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equals(nomeCurso)) {
                return curso;
            }
        }
        return null;
    }

    //Um toString para mostrar no terminal o nome do aluno e o curso
    public String toString() {
        return "Meu nome é: " + nome + " e meus cursos são: " + cursos;
    }
}
