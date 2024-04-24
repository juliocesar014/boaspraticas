package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {
        // Usando polimorfismo com a referência da classe base (Pessoa)
        FazSom pessoa = new Pessoa("João");
        pessoa.fazerSom(); // Oi!

        // Usando polimorfismo com a referência da classe derivada (Funcionario)
        FazSom funcionario = new Funcionario("Maria", 4000);
        funcionario.fazerSom(); // Bom dia!
    }
}