import java.util.Scanner;

public class Nmr_Maior {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nmr = new int[3];

        System.out.print("Digite três números: ");
        for(int i = 0; i < 3; i++){
            nmr[i] = sc.nextInt();
            if (nmr[1] > nmr[0] && nmr[1] > nmr[2]) {
                System.out.println("O maior número é: " + nmr[1]);
            } else if (nmr[2] > nmr[0] && nmr[2] > nmr[1]) {
                System.out.println("O maior número é: " + nmr[2]);
            } else {
                System.out.println("O maior número é: " + nmr[0]);
                
            }
        }

    }


}
