package it.itisvinci.esercizio.marverti;

import java.util.Scanner;

public class Transizione extends Thread {
    
    private String causale;
    private double soldi;

    @Override
    public void run() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cosa desidera effettuare: ");
        System.out.println("\t1.Prelievo");
        System.out.println("\t2.Versamento");
        System.out.println("\t3. Uscire");
        int scelta = keyboard.nextInt();
        switch(scelta) {
            case 1:
                System.out.println("Inserire quantita prelievo:");
                this.soldi = keyboard.nextInt();
                
                break;
            case 2:
            default:
        }
        
    }
}
