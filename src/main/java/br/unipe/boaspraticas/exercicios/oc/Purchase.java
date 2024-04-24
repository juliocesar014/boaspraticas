package br.unipe.boaspraticas.exercicios.oc;

public class Purchase {
    private double amount;

    public Purchase(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void addToTotalPurchaseAmount(double amount) {
        this.amount += amount;
    }
}

