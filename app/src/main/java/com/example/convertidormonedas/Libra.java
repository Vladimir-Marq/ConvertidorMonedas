package com.example.convertidormonedas;

public class Libra extends Dinero {
    public Libra(String Simbolo, Double Numero) {
        this.setSimbolo(Simbolo);
        this.setNumero(Numero);
    }
    public static Libra valueOf(PesoMexicano pesoMexicano) { //Este metodo devuelve una libra a partir de un peso mexicano
        Double numero = (pesoMexicano.getNumero()*0.036);
        Libra libra = new Libra("$", numero);
        return libra;
    }
    public static Libra valueOf(DolarAmericano dolarAmericano) { //Este metodo devuelve una libra a partir de un dolar
        Double numero = (dolarAmericano.getNumero());
        Libra libra = new Libra("$", numero);
        return libra;
    }
    public static Libra valueOf(DolarCanadiense dolarCanadiense){ //Este metodo devuelve una libra a partir de un dolar canadiense
        Double numero = (dolarCanadiense.getNumero());
        Libra libra = new Libra("$", numero);
        return libra;
    }
}