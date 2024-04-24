    package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

    import lombok.Getter;

    @Getter
    class Pessoa implements FazSom {
        private String nome;

        public Pessoa(String nome) {
            this.nome = nome;
        }

        @Override
        public void fazerSom() {
            System.out.println("Oi!");
        }
    }
