package OO.Composicao;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();

    double getValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

}
