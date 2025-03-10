package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {

    // # Variabili di istanza
    private String dimensioni;
    private boolean isSmart;

    // # Costruttori
    public Televisore(String nome, String marca, BigDecimal prezzo, String dimensioni,
            boolean isSmart) {
        super(nome, marca, prezzo);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    // # Metodi
    public String getDimensioni() {
        return this.dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public String getIsSmart() {
        return this.isSmart ? "Si" : "No";
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return super.toString() + "Dimensioni: " + this.dimensioni + "\n" + "Smart: " + this.getIsSmart() + "\n";
    }
}
