package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto {

    // # Variabili di istanza
    private long imei;
    private int memoria;

    // # Costruttori
    public Smartphone(String nome, String marca, BigDecimal prezzo, long imei, int memoria) {
        super(nome, marca, prezzo);
        this.imei = imei;
        this.memoria = memoria;
    }

    // # Metodi
    public long getImei() {
        return this.imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    public String getMemoria() {
        return this.memoria + "GB";
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public void setPrezzoScontato() {
        if (memoria <= 32) {
            BigDecimal sconto = this.getPrezzo().multiply(new BigDecimal("0.05")).setScale(2,
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
        return super.toString() + "IMEI: " + this.imei + "\n" + "Memoria: " + this.getMemoria() + "\n";
    }
}
