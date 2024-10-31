package it.itivinci.marverti.verifica;

import java.util.Scanner;

public class Pietanze extends Prodotto{
    private int calorie;

    public Pietanze() {
        setIva(0.10);
        calorie = 0;
    }

    public Pietanze(int codice, double prezzo, String descrizione, int calorie) {
        super(0.10, codice, prezzo, descrizione);
        this.calorie = calorie;
    }

    public void calcPrezzo() {
        setPrezzo((getBaseImp() * getIva()) + getBaseImp());
    }

    public void read() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserire Pietanza: ");
        System.out.println("Codice: ");
        setCodice(keyboard.nextInt());
        System.out.println("Descrizione: ");
        setDescrizione(keyboard.next());
        System.out.println("Base Imponibile: ");
        setBaseImp(keyboard.nextDouble());
        System.out.println("Calorie: ");
        setCalorie(keyboard.nextInt());

    }

    public void print() {
        System.out.println("Codice: " + getCodice());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Base imponibile: " + getBaseImp());
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println("Calorie: " + getCalorie());
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getCalorie() {
        return calorie;
    }
}
