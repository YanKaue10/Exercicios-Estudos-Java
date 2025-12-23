package Coletions;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Pedro"); //lança uma exceção se não conseguir adicionar uma elemento
        fila.add("Jorge");
        fila.offer("Anibal");//retorna false se não conseguir adidionar um elemento e não lança execção
        fila.offer("Ana");

        System.out.println(fila.peek());//Retorna o primeiro elemento da lista e não remove
        System.out.println(fila.element());// Rotorna o primeiro valor e não remove o elemento da fila
        //A diferença é que quando está na fila vazia, o peek retorna null, e no elemente ele joga uma exceção.

        fila.clear(); //limpar a fila
        fila.isEmpty();//checa se a fila está vazia
        fila.poll();//Retorna o primeiro elemento da fila e já remove ele
        //Com o pool ele retorna false
        //Com remove ele lança uma exceção
        
    }
}
