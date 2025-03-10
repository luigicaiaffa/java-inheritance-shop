package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("AirTag", "Apple", new BigDecimal("39.90"));

        Smartphone smartphone = new Smartphone("Iphone 16", "Apple", new BigDecimal("989.90"),
                123456789012345L, 256);

        Televisore televisore = new Televisore("Samsung TV", "Samsung", new BigDecimal("499.90"),
                "55 pollici", true);

        Cuffia cuffia = new Cuffia("AirPods", "Apple", new BigDecimal("179.90"), "Bianco", true);

        System.out.println("\n");

        System.out.println(prodotto.toString());

        System.out.println(smartphone.toString());

        System.out.println(televisore.toString());

        System.out.println(cuffia.toString());
    }
}
