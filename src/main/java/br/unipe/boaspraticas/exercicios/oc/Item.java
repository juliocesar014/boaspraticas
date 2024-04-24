package br.unipe.boaspraticas.exercicios.oc;

import lombok.Getter;


@Getter
public class Item {
    private final String name;
    private final Price price;

    public Item(String name, Price price) {
        this.name = name;
        this.price = price;
    }

}
