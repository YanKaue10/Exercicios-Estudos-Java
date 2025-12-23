package Arrays;

public class InicializandoArrays {
    public static void main(String[] args) {
        int [] arrays = {10,20,30,40,50,60,70,80,90,100,110};

        for(int counter =0; counter < arrays.length; counter++){
            System.out.printf("%5d %4s %4d \n", counter, "=>" , arrays[ counter ]);
        }
    }
}
