package it.itivinci.marverti.verifica;

import java.util.Scanner;

public class Bevande extends Prodotto {
    private Double tempServizio;
    public Bevande() {
        tempServizio = null;
        setIva(0.22);
    }

    public Bevande(int codice, double prezzo, String descrizione, Double tempServizio) {
        super(0.22, codice, prezzo, descrizione);
        this.tempServizio = tempServizio;
    }

    public void calcPrezzo() {
        setPrezzo((getBaseImp() * getIva()) + getBaseImp());
    }

    public Double getTempServizio() {
        return tempServizio;
    }

    public void setTempServizio(Double tempServizio) {
        this.tempServizio = tempServizio;
    }

    public void read() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserire bevanda: ");
        System.out.println("Codice: ");
        setCodice(keyboard.nextInt());
        System.out.println("Descrizione: ");
        setDescrizione(keyboard.next());
        System.out.println("Base Imponibile: ");
        setBaseImp(keyboard.nextDouble());
        System.out.println("Temperatura: ");
        setTempServizio(keyboard.nextDouble());

    }

    public void print() {
        System.out.println("Codice: " + getCodice());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Base imponibile: " + getBaseImp());
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println("Temperatura di servizio: " + getTempServizio());
    }
}
