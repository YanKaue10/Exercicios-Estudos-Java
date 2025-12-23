package Coletions;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Usuario> list = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        list.add(u1);

        list.add(new Usuario("Pedro"));
        list.add(new Usuario("Jorge"));
        list.add(new Usuario("Carlos"));
        System.out.println(list.get(2));

        list.remove(new Usuario("Carlos"));
        list.remove(0);
        System.out.println(list.contains(new Usuario("Carlos")));
        System.out.println(list.contains(new Usuario("Jorge")));
        System.out.println(list.contains(u1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Usuario u : list)
            System.out.println(u);


    }
}
