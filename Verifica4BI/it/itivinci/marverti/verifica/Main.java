package it.itivinci.marverti.verifica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            RegistratoreDiCassa prodotti = new RegistratoreDiCassa();
            prodotti.inizializza();
            String input = "";
            Scanner keyboard = new Scanner(System.in);
            while(!input.equals("end")) {

                System.out.println("Ciao utente!");
                System.out.println("Inserire il codice del prodotto: ");
                input = keyboard.next();

                if(!input.equals("end")) {
                    int codice = Integer.parseInt(input);
                    int x = prodotti.ricercaArt(codice);
                    if (x != -1) {
                        prodotti.print(x);
                        if (prodotti.isBevanda(x)) {
                            System.out.println("Inserire una bevanda: ");
                            Bevande temp = new Bevande();
                            temp.read();
                            System.out.println("Quante: ");
                            int quantita = keyboard.nextInt();
                            prodotti.addBevanda(temp, quantita);
                        } else {
                            System.out.println("Inserire una pietanza: ");
                            Pietanze temp = new Pietanze();
                            temp.read();
                            System.out.println("Quante: ");
                            int quantita = keyboard.nextInt();
                            prodotti.addPietanza(temp, quantita);
                        }
                    }
                }
            }
            System.out.println("Importo tot: " + prodotti.importoTot());
        }

    }
}