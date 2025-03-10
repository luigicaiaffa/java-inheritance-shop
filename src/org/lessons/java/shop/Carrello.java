package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Benvenuto nel carrello!");

        System.out.println("Scegli un'opzione tra Cuffie, Smartphone e Televisore");
        String scelta = userInput.nextLine();

        System.out.println("Inserisci il nome del prodotto:");
        String nome = userInput.nextLine();

        System.out.println("Inserisci la marca del prodotto:");
        String marca = userInput.nextLine();

        System.out.println("Inserisci il prezzo del prodotto:");
        BigDecimal prezzo = userInput.nextBigDecimal();
        userInput.nextLine();

        if (scelta.toLowerCase().compareTo("smartphone") == 0 || scelta.toLowerCase().compareTo("telefono") == 0) {
            System.out.println("Inserisci il codice IMEI:");
            long imei = userInput.nextLong();
            userInput.nextLine();

            System.out.println("Inserisci la memoria in GB:");
            int memoria = userInput.nextInt();
            userInput.nextLine();

            Smartphone smartphone = new Smartphone(nome, marca, prezzo, imei, memoria);
            System.out.println("Il tuo carrello: " + "\n" + smartphone.toString());
        }

        else if (scelta.toLowerCase().compareTo("televisore") == 0 || scelta.toLowerCase().compareTo("tv") == 0) {
            System.out.println("Inserisci la grandezza in pollici:");
            String dimensioni = userInput.nextLine();

            System.out.println("Inserisci se è smart o no (true/false):");
            boolean isSmart = userInput.nextBoolean();

            Televisore televisore = new Televisore(nome, marca, prezzo, dimensioni, isSmart);
            System.out.println("Il tuo carrello: " + "\n" + televisore.toString());
        }

        else if (scelta.toLowerCase().compareTo("cuffie") == 0 || scelta.toLowerCase().compareTo("cuffia") == 0) {
            System.out.println("Inserisci il colore:");
            String colore = userInput.nextLine();

            System.out.println("Inserisci se è wireless o no (true/false):");
            boolean isWireless = userInput.nextBoolean();

            Cuffia cuffia = new Cuffia(nome, marca, prezzo, colore, isWireless);
            System.out.println("Il tuo carrello: " + "\n" + cuffia.toString());
        }

        else {
            Prodotto prodotto = new Prodotto(nome, marca, prezzo);
            System.out.println("Il tuo carrello: " + "\n" + prodotto.toString());
        }

        userInput.close();
    }
}
