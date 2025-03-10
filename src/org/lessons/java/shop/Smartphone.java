package org.lessons.java.shop;

import java.math.BigDecimal;

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
        return this.memoria + " GB";
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + "IMEI: " + this.imei + "\n" + "Memoria: " + this.getMemoria() + "\n";
    }
}
