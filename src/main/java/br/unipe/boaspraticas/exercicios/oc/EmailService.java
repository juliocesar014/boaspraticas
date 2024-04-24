package br.unipe.boaspraticas.exercicios.oc;

public class EmailService {
    public void sendEmailReceipt(Customer customer, double amount) {
        // Lógica para enviar um e-mail com o recibo da compra
        System.out.println("Email receipt sent to " + customer.getName() + ". Amount: " + amount);
    }

    public void sendConfirmationEmail() {
        // Lógica para enviar um e-mail de confirmação do carrinho de compras
    }
}