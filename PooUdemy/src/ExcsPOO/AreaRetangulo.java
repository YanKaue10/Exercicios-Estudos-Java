package ExcsPOO;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Retangulo r1= new Retangulo();
       Retangulo r2 = new Retangulo();
        System.out.println("Digite o valor da altura e da largura do primeiro retangulo: ");
        r1.largura = sc.nextDouble();
        r1.altura = sc.nextDouble();
        System.out.println("Digite o valor da altura e da largura do segundo retangulo: ");
        r2.largura = sc.nextDouble();
        r2.altura = sc.nextDouble();

        System.out.println("Área do primeiro retângulo: " + r1.area());
        System.out.println("Perímetro do primeiro retângulo: " + r1.perimetro());

        System.out.println("Área do segundo retângulo: " + r2.area());
        System.out.println("Perímetro do segundo retângulo: " + r2.perimetro());

      if (r1.area()>r2.area()){
          System.out.println("A area do primeiro é maior");
      }else if (r2.area()>r1.area()){
          System.out.println("A area do segundo é maior!");
      } else{
          System.out.println("Valores Iguais!!");
      }

    }
}
