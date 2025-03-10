package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto(1, "AirTag", "Apple", new BigDecimal("39.90"), "22%");
        Smartphone smartphone = new Smartphone(2, "iPhone 16", "Apple", new BigDecimal("989.90"), "22%", 123456789012345L, 128);
        Televisore televisore = new Televisore(3, "Samsung TV", "Samsung", new BigDecimal("499.90"), "22%", "55 pollici", true);
        Cuffia cuffia = new Cuffia(4, "AirPods", "Apple", new BigDecimal("179.90"), "22%", "Bianco", true);

        System.out.println("--------");
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Marca: " + prodotto.getMarca());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("Iva: " + prodotto.getIva());


        System.out.println("--------");
        System.out.println("Codice: " + smartphone.getCodice());
        System.out.println("Nome: " + smartphone.getNome());
        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("Prezzo: " + smartphone.getPrezzo());
        System.out.println("Iva: " + smartphone.getIva());
        System.out.println("Imei: " + smartphone.getImei());
        System.out.println("Memoria: " + smartphone.getMemoria());

        System.out.println("--------");
        System.out.println("Codice: " + televisore.getCodice());
        System.out.println("Nome: " + televisore.getNome());
        System.out.println("Marca: " + televisore.getMarca());
        System.out.println("Prezzo: " + televisore.getPrezzo());
        System.out.println("Iva: " + televisore.getIva());
        System.out.println("Dimensioni: " + televisore.getDimensioni());
        System.out.println("Smart Tv: " + televisore.getIsSmart());

        System.out.println("--------");
        System.out.println("Codice: " + cuffia.getCodice());
        System.out.println("Nome: " + cuffia.getNome());
        System.out.println("Marca: " + cuffia.getMarca());
        System.out.println("Prezzo: " + cuffia.getPrezzo());
        System.out.println("Iva: " + cuffia.getIva());
        System.out.println("Colore: " + cuffia.getColore());
        System.out.println("Tipo: " + cuffia.getIsWireless());
    }
}
