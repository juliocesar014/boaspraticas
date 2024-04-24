package br.unipe.boaspraticas.exercicios.oc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice().toString());
        }
    }

    public void saveToDatabase() {
        // Lógica para salvar o carrinho de compras no banco de dados
    }
}
