package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto(1, "AirTag", "Apple", new BigDecimal("39.90"), "22%");
        Smartphone smartphone = new Smartphone(2, "iPhone 15", "Apple", new BigDecimal("839.90"), "22%",
                123456789012345L, 128);
        Televisore televisore = new Televisore(3, "Samsung TV", "Samsung", new BigDecimal("499.90"), "22%",
                "55 pollici", true);
        Cuffia cuffia = new Cuffia(4, "AirPods", "Apple", new BigDecimal("179.90"), "22%", "Bianco", true);

        smartphone.setNome("Iphone 16");

        smartphone.setPrezzo(new BigDecimal("989.90"));

        smartphone.setMemoria(256);

        System.out.println("--------");
        System.out.println(prodotto.toString());
        System.out.println("--------");
        System.out.println(smartphone.toString());
        System.out.println("--------");
        System.out.println(televisore.toString());
        System.out.println("--------");
        System.out.println(cuffia.toString());
    }
}
