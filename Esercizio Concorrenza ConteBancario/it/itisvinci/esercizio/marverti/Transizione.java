package it.itisvinci.esercizio.marverti;

import java.util.Scanner;
import it.itisvinci.esercizio.marverti.Conto;

public class Transizione extends Thread {
    
    private String causale;
    private Conto conto;

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
                int prelievo = keyboard.nextInt();
                synchronized (conto) {
                    conto.setSaldo(conto.getSaldo() - prelievo);
                }
                System.out.println("Saldo disponibile: " + conto.getSaldo());
                this.interrupt();
                break;
            case 2:
                System.out.println("Inserire causale: ");
                keyboard.nextLine();
                causale = keyboard.nextLine();
                System.out.println("Inserire quantita versamento: ");
                int versamento = keyboard.nextInt();
                synchronized (conto) {
                    conto.setSaldo(conto.getSaldo() + versamento);
                }
                System.out.println("Saldo disponibile: " + conto.getSaldo());
                this.interrupt();
                break;
            default:
                this.interrupt();
        }
        
    }

    public Transizione(String causale, Conto conto) {
        this.causale = causale;
        this.conto = conto;
    }

    public Transizione() {
        causale = "";
        conto = new Conto();
    }
    public String getCausale() {
        return causale;
    }

    public void setCausale(String causale) {
        this.causale = causale;
    }

    public void setConto(Conto conto) {
        this.conto = conto;
    }

    public Conto getConto() {
        return conto;
    }
}
