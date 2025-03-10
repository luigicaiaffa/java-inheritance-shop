package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {

    // # Variabili di istanza
    private String dimensioni;
    private boolean isSmart;

    // # Costruttori
    public Televisore(int codice, String nome, String marca, BigDecimal prezzo, String iva, String dimensioni,
            boolean isSmart) {
        super(codice, nome, marca, prezzo, iva);
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
}
