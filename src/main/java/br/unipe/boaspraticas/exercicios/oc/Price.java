package br.unipe.boaspraticas.exercicios.oc;

import lombok.Getter;

@Getter
public record Price(double amount) {

    @Override
    public String toString() {
        return "$" + amount;
    }

}
