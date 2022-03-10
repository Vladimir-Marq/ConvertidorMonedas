package com.example.convertidormonedas;

public class DolarAmericano extends Dinero{
    public DolarAmericano(String Simbolo, Double Numero) {
        this.setSimbolo(Simbolo);
        this.setNumero(Numero);
    }
    public static DolarAmericano valueOf(PesoMexicano pesoMexicano){ //Este metodo devuelve un dolar a partir de un peso mexicano
        Double numero = (pesoMexicano.getNumero()*0.049);
        DolarAmericano dolarAmericano = new DolarAmericano("$", numero);
        return dolarAmericano;
    }
    public static DolarAmericano valueOf(Libra libra){ //Este metodo devuelve un dolar americano a partir de una libra
        Double numero = (libra.getNumero());
        DolarAmericano dolarAmericano = new DolarAmericano("$", numero);
        return dolarAmericano;
    }
    public static DolarAmericano valueOf(DolarCanadiense dolarCanadiense){ //Este metodo devuelve un dolar americano a partir de un dolar canadiense
        Double numero = (dolarCanadiense.getNumero());
        DolarAmericano dolarAmericano = new DolarAmericano("$", numero);
        return dolarAmericano;
    }
}
