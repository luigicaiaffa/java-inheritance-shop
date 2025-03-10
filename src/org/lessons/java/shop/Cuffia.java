package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffia extends Prodotto {

    // # Variabili di istanza
    private String colore;
    private boolean isWireless;

    // # Costruttori
    public Cuffia(String nome, String marca, BigDecimal prezzo, String colore, boolean isWireless) {
        super(nome, marca, prezzo);
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
    public void setPrezzoScontato() {
        if (!isWireless) {
            BigDecimal sconto = this.getPrezzo().multiply(new BigDecimal("0.07")).setScale(2,
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
        return super.toString() + "Colore: " + this.colore + "\n" + "Tipo: " + this.getIsWireless() + "\n";
    }
}
