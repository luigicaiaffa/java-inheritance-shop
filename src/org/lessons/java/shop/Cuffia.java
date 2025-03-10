package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffia extends Prodotto {

    // # Variabili di istanza
    private String colore;
    private boolean isWireless; 

    // # Costruttori
     public Cuffia(int codice, String nome, String marca, BigDecimal prezzo, String iva, String colore, boolean isWireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    // # Metodi 
    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getIsWireless() {
        return this.isWireless ? "Senza filo" : "Con filo";
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return super.toString() + "Colore: " + this.colore + "\n" + "Tipo: " + this.getIsWireless() + "\n";
    }
}
