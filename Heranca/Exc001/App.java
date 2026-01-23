public class App {

    public static void main(String[] args) {

       Funcionario func = new Funcionario("João", 2500.0);
         func.exibeDados();

         System.out.println("---------------------");

         Assistente assist = new Assistente("Maria", 2000.0);
         assist.setNmrMatricula(12345);
         assist.exibirDados();
         System.out.println("---------------------");

         Tecnico tec = new Tecnico("Carlos", 3000.0, 1500.0);
         tec.exibirDados();      
        
         System.out.println("---------------------");

            Admnistrativo adm = new Admnistrativo("Ana", 2800.0, "Noturno");
            adm.exibirDados();

         
    }
}
