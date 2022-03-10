package com.example.convertidormonedas;

public class DolarCanadiense extends Dinero{
    public DolarCanadiense(String Simbolo, Double Numero) {
        this.setSimbolo(Simbolo);
        this.setNumero(Numero);
    }
    public static DolarCanadiense valueOf(PesoMexicano pesoMexicano) { //Este metodo devuelve un dolar canadiense a partir de un peso
        Double numero = (pesoMexicano.getNumero()*0.063);
        DolarCanadiense dolarCanadiense = new DolarCanadiense("$", numero);
        return dolarCanadiense;
    }
    public static DolarCanadiense valueOf(DolarAmericano dolarAmericano) { //Este metodo devuelve un dolar canadiense a partir de un dolar americano
        Double numero = (dolarAmericano.getNumero());
        DolarCanadiense dolarCanadiense = new DolarCanadiense("$", numero);
        return dolarCanadiense;
    }
    public static DolarCanadiense valueOf(Libra libra){ //Este metodo devuelve una dolar canadiense a partir de una libra
        Double numero = (libra.getNumero());
        DolarCanadiense dolarCanadiense = new DolarCanadiense("$", numero);
        return dolarCanadiense;
    }


}
