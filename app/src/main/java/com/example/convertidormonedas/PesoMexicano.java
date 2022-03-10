package com.example.convertidormonedas;

public class PesoMexicano extends Dinero{
    public PesoMexicano(String Simbolo, Double Numero) {
        this.setSimbolo(Simbolo);
        this.setNumero(Numero);
    }
    public static PesoMexicano valueOf(DolarAmericano dolarAmericano){ //Este metodo devuelve un peso mexicano a partir de un dolar
        Double numero = (dolarAmericano.getNumero());
        PesoMexicano pesoMexicano = new PesoMexicano("$", numero);
        return pesoMexicano;
    }
    public static PesoMexicano valueOf(DolarCanadiense dolarCanadiense){ //Este metodo devuelve un peso mexicano a partir de un dolar canadiense
        Double numero = (dolarCanadiense.getNumero());
        PesoMexicano pesoMexicano = new PesoMexicano("$", numero);
        return pesoMexicano;
    }
    public static PesoMexicano valueOf(Libra libra){ //Este metodo devuelve un peso mexicano a partir de un dolar
        Double numero = (libra.getNumero());
        PesoMexicano pesoMexicano = new PesoMexicano("$", numero);
        return pesoMexicano;
    }
}
