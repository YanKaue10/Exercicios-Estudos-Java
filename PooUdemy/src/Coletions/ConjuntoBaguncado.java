package Coletions;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O tamanho é " + conjunto.size());
        conjunto.add("Teste2");
        System.out.println("O tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto.remove(1.2));
        System.out.println("O tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));//o resultado será falso porque o valor x já foi removido
        //contains serve para saber se um elemento está ou não dentro do conjunto

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);//fazendo a união dos dois objetos
        conjunto.retainAll(nums);//Apenas o valor que tem repetido
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
        
    }
}
