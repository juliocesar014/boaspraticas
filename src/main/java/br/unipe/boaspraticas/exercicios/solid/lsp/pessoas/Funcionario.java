package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

import lombok.Getter;

@Getter
class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }


    @Override
    public void fazerSom() {
        System.out.println("Bom dia!");
    }


    public void calcularSalario() {
        // Lógica para calcular o salário do funcionário
    }
}