package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {

    // # Variabili di istanza
    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected String iva;

    // # Costruttori
    public Prodotto(int codice, String nome, String marca, BigDecimal prezzo, String iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // # Metodi
    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo.setScale(2,
                RoundingMode.HALF_EVEN);
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo.setScale(2,
                RoundingMode.HALF_EVEN);
    }

    public String getIva() {
        return this.iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
}
