package br.unipe.boaspraticas.exercicios.oc;

import lombok.Getter;

public class Customer {
    @Getter
    private String name;
    private int age;
    private double totalPurchaseAmount;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalPurchaseAmount = 0;
    }

}
