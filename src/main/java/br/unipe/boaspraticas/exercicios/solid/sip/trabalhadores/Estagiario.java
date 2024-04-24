package br.unipe.boaspraticas.exercicios.solid.sip.trabalhadores;

class Estagiario implements TrabalhadorTemporario, TrabalhadorIntegral {
    public void trabalharEmTempoIntegral() {
        // Implementação do trabalho em tempo integral
        System.out.println("Estagiário trabalhando em tempo integral.");
    }

    public void fazerTrabalhoTemporario() {
        // Implementação do trabalho temporário
        System.out.println("Estagiário fazendo trabalho temporário.");
    }
}
