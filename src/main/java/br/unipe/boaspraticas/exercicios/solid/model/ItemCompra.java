package br.unipe.boaspraticas.exercicios.solid.model;


import lombok.Data;

@Data
public class ItemCompra {
    private String name;  //NOME da pessoa realizando compra

    private double price; //Preço da compra
    private int quantity;  // Quantidade de itens

}
