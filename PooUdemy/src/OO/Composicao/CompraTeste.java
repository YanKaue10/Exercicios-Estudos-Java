package OO.Composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.itens.add(new Item("Canetas", 10, 2));
        compra.itens.add(new Item("Canetas", 10, 2));
        System.out.println(compra.itens.size());
        System.out.println(compra.getValorTotal());
    }
}
