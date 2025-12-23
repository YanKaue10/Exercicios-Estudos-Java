package OO.Composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }

    double obterValorTotal() {
        double total = 0.0;
        for (Item i : itens) {
        }
        return total;
    }
}
