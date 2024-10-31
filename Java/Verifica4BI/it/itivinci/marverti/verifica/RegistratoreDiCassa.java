package it.itivinci.marverti.verifica;

import java.util.Arrays;

public class RegistratoreDiCassa {
    private Prodotto[] prodotti = new Prodotto[0];
    private Prodotto[] stock = new Prodotto[0];

    public RegistratoreDiCassa() {
        prodotti = new Prodotto[0];
        stock = new Prodotto[20];
    }

    public void inizializza() {


        for (int i = 0; i < stock.length / 2; i++) {
            Bevande tempB = new Bevande(0, 12.2, "Coke", 3.0);
            tempB.calcPrezzo();
            stock[i] = tempB;
            stock[i].setCodice(i);
        }
        for (int i = stock.length / 2; i < stock.length; i++) {
            Pietanze tempP = new Pietanze(0, 12.2, "Pizza", 123);
            tempP.calcPrezzo();
            stock[i] = tempP;
            stock[i].setCodice(i);
        }
    }

    public int ricercaArt(int codice) {
        int i;
        for (i = 0; i < stock.length && stock[i].getCodice() != codice; i++) {
            System.out.println(stock[i].getCodice());
        }
        if (i < stock.length) return i;
        return -1;
    }
    public void addBevanda(Bevande bevanda, int quantita) {
        prodotti = Arrays.copyOf(prodotti, prodotti.length + quantita);
        for (int i = 1; i <= quantita; i++) {
            prodotti[prodotti.length - i] = bevanda;
            prodotti[prodotti.length - i].calcPrezzo();
        }
    }

    public void addPietanza(Pietanze pietanza, int quantita) {
        prodotti = Arrays.copyOf(prodotti, prodotti.length + quantita);
        for (int i = 1; i <= quantita; i++) {
            prodotti[prodotti.length - i] = pietanza;
            prodotti[prodotti.length - i].calcPrezzo();
        }
    }

    public double importoTot() {
        double sum = 0;
        for (int i = 0; i < prodotti.length; i++) {
            sum += prodotti[i].getPrezzo();
        }
        return sum;
    }

    public void print(int x) {
        stock[x].print();
    }

    public boolean isBevanda(int x) {
        if (stock[x] instanceof Bevande) return true;
        return false;
    }
    /*public void addBevande(int quantita) {
        Bevande bevanda = new Bevande();
        for(int i = 0; i < quantita; i++) {
            bevanda.read();
            addBevandaSingola(bevanda);
        }
    }
    public void addPietanze(int quantita) {
        Pietanze pietanza = new Pietanze();
        for(int i = 0; i < quantita; i++) {
            pietanza.read();
            addPietanzaSingola(pietanza);
        }
    }*/
}
