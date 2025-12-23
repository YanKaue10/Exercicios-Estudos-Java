package ExcsPOO;

public class ConstutorProg {
    private String nomeCusro;

    public ConstutorProg(String nome) {
        nomeCusro = nome;
    }
    public String getNome(){
        return "Nome do curso retornado" + nomeCusro;
    }
}
