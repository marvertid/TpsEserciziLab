package it.itisvinci.marverti.verifica;

import java.util.Arrays;
import java.util.Scanner;

public class Orda {
    private Orco[] orda = new Orco[3];

    public Orda() {
        orda = new Orco[0];
    }

    public void inserisciOrco(int codice) {
            switch (codice) {
                case 1:
                    addGuerriero();
                    break;
                case 2:
                    addSciamano();
                    break;
                case 3:
                    addCavalcatroll();
                    break;
                default:
                    System.out.println("Errore: Orco non trovato!");
                    break;
        }

    }

    public void addGuerriero() {
        Guerriero temp = new Guerriero();
        orda = Arrays.copyOf(orda, orda.length + 1);
        orda[orda.length - 1] = temp;
    }

    public void addSciamano() {
        Sciamano temp = new Sciamano();
        orda = Arrays.copyOf(orda, orda.length + 1);
        orda[orda.length - 1] = temp;
    }

    public void addCavalcatroll() {
        Cavalcatroll temp = new Cavalcatroll();
        orda = Arrays.copyOf(orda, orda.length + 1);
        orda[orda.length - 1] = temp;
    }

    public double calcTempo(String tipoTerreno, double km) {
        double tempo = 0;
        for (int i = 0; i < orda.length; i++) {
            double velEff = orda[i].velEffettiva(tipoTerreno);
            orda[i].calcTempoDiPercorrenza(km, velEff);
            if (tempo < orda[i].getTempoDiPercorrenza()) {
                tempo = orda[i].getTempoDiPercorrenza();
            }
        }

        return tempo;
    }

    public int getOrdaLength() {
        return orda.length;
    }

    public void print(int codice) {
        switch (codice) {
            case 1:
                printGuerriero();
                break;
            case 2:
                printSciamano();
                break;
            case 3:
                printCavalcatroll();
                break;
        }


    }

    public void printGuerriero() {
        Guerriero temp = new Guerriero();
        System.out.println("VelBase: " + temp.getVelBase());
    }
    public void printSciamano() {
        Sciamano temp = new Sciamano();
        System.out.println("VelBase" + temp.getVelBase());
    }
    public void printCavalcatroll() {
         Cavalcatroll temp = new Cavalcatroll();
        System.out.println("VelBase" + temp.getVelBase());
    }
}
