package it.itisvinci.diego.verificadiggle;

import java.util.concurrent.ThreadLocalRandom;

public class Bigliettaio extends Thread {
    private Sala sala;
    public Bigliettaio() {
        sala = new Sala();
    }
    public Bigliettaio(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run() {
        int posto1 = ThreadLocalRandom.current().nextInt(20);
        int posto2 = (posto1 + 1) % 20;
        int i = 0;
        synchronized (sala) {
            while ((sala.getPosto(posto1).isOccupato() || sala.getPosto(posto2).isOccupato()) && i < 20) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                posto1 = (posto1 + 1) % 20;
                posto2 = (posto2 + 1) % 20;
                i++;
            }
            if (i < 20) {
                sala.prenota(posto1);
                sala.prenota(posto2);
            }
        }
        if (i < 20) {
            System.out.println("bigliettaio " + Thread.currentThread().getId() + " ha prenotato il posto: " + posto1);
            System.out.println("bigliettaio " + Thread.currentThread().getId() + " ha prenotato il posto: " + posto2);
        } else {
            System.out.println("bigliettaio " + Thread.currentThread().getId() + " ha FALLITO");
        }

    }
}
