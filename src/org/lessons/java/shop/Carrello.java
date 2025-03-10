package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Benvenuto nel carrello!");
        System.out.println("Quanti prodotti vuoi inserire? ");
        int numProdotti = userInput.nextInt();
        userInput.nextLine();

        Prodotto[] carrello = new Prodotto[numProdotti];

        for (int i = 0; i < numProdotti; i++) {
            System.out.println("Scegli un'opzione tra Cuffie, Smartphone e Televisore per inserire un prodotto");
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

                carrello[i] = new Smartphone(nome, marca, prezzo, imei, memoria);
            }

            else if (scelta.toLowerCase().compareTo("televisore") == 0 || scelta.toLowerCase().compareTo("tv") == 0) {
                System.out.println("Inserisci la grandezza in pollici:");
                String dimensioni = userInput.nextLine();

                System.out.println("Inserisci se è smart o no (true/false):");
                boolean isSmart = userInput.nextBoolean();
                userInput.nextLine();

                carrello[i] = new Televisore(nome, marca, prezzo, dimensioni, isSmart);
            }

            else if (scelta.toLowerCase().compareTo("cuffie") == 0 || scelta.toLowerCase().compareTo("cuffia") == 0) {
                System.out.println("Inserisci il colore:");
                String colore = userInput.nextLine();

                System.out.println("Inserisci se è wireless o no (true/false):");
                boolean isWireless = userInput.nextBoolean();
                userInput.nextLine();

                carrello[i] = new Cuffia(nome, marca, prezzo, colore, isWireless);
            }

            else {
                carrello[i] = new Prodotto(nome, marca, prezzo);
            }

        }

        userInput.close();

        System.out.println("\nIl tuo carrello: \n");
        for (Prodotto prodotto : carrello) {
            System.out.println(prodotto.toString());
        }
    }
}
