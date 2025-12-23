package PilaresOO.Encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    /* public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }
    */
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de Idade ");
        } else {
            System.out.println("Menor de Idade ");
        }
        this.idade = idade;
    }
}
