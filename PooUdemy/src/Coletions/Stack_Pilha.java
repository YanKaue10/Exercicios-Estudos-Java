package Coletions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_Pilha {
    public static void main(String[] args) {
        //o ultimo que entrou é o primeiro a sair (LIFO)
        Deque<String> livros = new ArrayDeque<>();
        
        livros.add("O mundo de sofia");
        livros.push("O universo");
        livros.add("O  ego é seu inimigo");
        livros.push("O médico e o monstro");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.remove());
    }
}
