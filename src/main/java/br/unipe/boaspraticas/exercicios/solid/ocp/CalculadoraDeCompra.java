package br.unipe.boaspraticas.exercicios.solid.ocp;

import br.unipe.boaspraticas.exercicios.solid.model.Compra;


// Classe responsável por calcular o valor total de uma compra
public class CalculadoraDeCompra {

    private final Desconto desconto;

    public CalculadoraDeCompra(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularTotal(Compra compra) {
        double total = compra.getI().stream()
                .mapToDouble(item -> item.getPu() * item.getQtd())
                .sum();

        return desconto.aplicarDesconto(total);
    }
}


