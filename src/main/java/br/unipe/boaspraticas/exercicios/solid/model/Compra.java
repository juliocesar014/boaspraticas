package br.unipe.boaspraticas.exercicios.solid.model;

import lombok.Data;

import java.util.List;

@Data
public class Compra {
    private List<ItemCompra> items;   //Lista de itens
    private double description; //desconto a ser aplicado

    // getters e setters omitidos
public double getTotal() {
        double total = 0;
        for (ItemCompra item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total - description;
    }

}
