package Coletions;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> usuarios = new java.util.HashMap<>();
        usuarios.put(1, "Pedro");
        usuarios.put(2, "Maria");
        usuarios.put(3, "Rodrigo");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());//imprime todas as chaves
        System.out.println(usuarios.values());//pegar os valores
        System.out.println(usuarios.entrySet());//gera as chaves e os valores ao mesmo tempo
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Rebeca"));
        System.out.println(usuarios.get(3));//mostra o valor do elemento
        System.out.println(usuarios.remove(1, "Pedro"));

        for (String usuario : usuarios.values()) { //for para percorrer o valor
            System.out.println(" → " + usuario);
        }
        for (int key : usuarios.keySet()) {// for para percorrer a chave
            System.out.println(key);
        }
        for (java.util.Map.Entry<Integer, String> Entry : usuarios.entrySet()) { //mostra o valor da chave e o valor
            System.out.println(Entry.getKey() + " - " + Entry.getValue());//

        }

    }
}
