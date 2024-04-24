package br.unipe.boaspraticas.exercicios.oc;

import java.util.List;

public class PriceCalculator {
    public double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice().amount();
        }
        return totalPrice;
    }
}
