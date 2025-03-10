package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
    public void setPrezzoScontato() {
        if (!isSmart) {
            BigDecimal sconto = this.getPrezzo().multiply(new BigDecimal("0.10")).setScale(2,
                    RoundingMode.HALF_EVEN);
            this.prezzo = this.getPrezzo().subtract(sconto);
        } else {
            BigDecimal sconto = this.getPrezzo().multiply(new BigDecimal("0.02")).setScale(2,
                    RoundingMode.HALF_EVEN);
            this.prezzo = this.getPrezzo().subtract(sconto);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Dimensioni: " + this.dimensioni + "\n" + "Smart: " + this.getIsSmart() + "\n";
    }
}
