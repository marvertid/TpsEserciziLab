package it.itivinci.marverti.esercizio39;

import java.util.Arrays;

public class Treno {
    private Vagone[] newVagone = new Vagone[0];
    
    public Treno() {
        newVagone = new Vagone[0];
    }

    public void addVagonePasseggeri(VagonePasseggeri vp) {
        Arrays.copyOf(newVagone, newVagone.length + 1);
        newVagone[newVagone.length - 1] = vp;
    }

    public void addVagoneMerci(VagoneMerci vm) {
        Arrays.copyOf(newVagone, newVagone.length + 1);
        newVagone[newVagone.length - 1] = vm;
    }

    public void printTreno() {
        for (int i = 0; i < newVagone.length; i++) {
            System.out.println("Vagone n. " + (i + 1));
            newVagone[i].print();
        }
    }
}
