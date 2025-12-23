package Arrays;

public class TamanhoArray {
    public static void main(String[] args) {
        int[] arrayUm = {12, 33, 444, 55, 66, 77, 88, 99, 100};
        int[] arrayDois = {14, 231, 332, 432, 553, 645, 712, 84, 93, 100};
        if (arrayUm.length > 8) {
            System.out.println("Array um é maior que 8!");
        } else if (arrayUm.length < 8) {
            System.out.println("O array um é maior que 8!");
        } else {
            System.out.println("Array tem exatamente o tamanho 8");
        }

        if (arrayDois.length > 8) {
            System.out.println("Array dois é maior que 8!");
        } else if (arrayDois.length < 8) {
            System.out.println("Array dois é menor que 8!");
        } else {
            System.out.println("Array tem exatamente o tamanho 8");
        }

        //Mostrando os tamanhos do array
        System.out.println("\nTamanho do array 1 = " + arrayUm.length);
        System.out.println("\nTamanho do array 2 = " + arrayDois.length);

        //Informa no console os elementos nos indices
        System.out.println(arrayUm[8]);
        System.out.println(arrayDois[9]);


    }
}
