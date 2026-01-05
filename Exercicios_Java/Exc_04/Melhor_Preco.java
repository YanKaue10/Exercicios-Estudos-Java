import java.util.Scanner;

public class Melhor_Preco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[3];
        System.out.print("Digite o preço de três produtos: ");
        for (int i = 0; i < 3; i++) {
            precos[i] = sc.nextDouble();
        }   
        if (precos[0] > precos [1] && precos [1] > precos [2]) {
            System.out.println("O produto mais barato custa: " + precos[2]);    
        } else if ( precos[0] > precos [2] && precos [2] > precos [1]) {
            System.out.println("O produto mais barato custa: " + precos[1]);    
        } else {
            System.out.println("O produto mais barato custa: " + precos[0]);    
        }
    }

}
