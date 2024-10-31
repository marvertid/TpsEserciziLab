package it.itisvinci.diego.verificadiggle;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private List<Posto> posti = new ArrayList<>();
    int codiceSala;
    public Sala() {
        for (int i = 1; i <= 20; i++) {
            posti.add(new Posto(i));
        }
        codiceSala = 0;
    }
    public Posto getPosto(int i) {
        return posti.get(i);
    }

    public void prenota(int i) {
        Posto p = posti.get(i);
        p.setOccupato();
    }

    public int getCodiceSala() {
        return codiceSala;
    }

    public void setCodiceSala(int codiceSala) {
        this.codiceSala = codiceSala;
    }

    public void stampa() {
        for (Posto posto : posti) {
            System.out.println("Posto: " + posto.getnPosto() + " Occupato: " + posto.isOccupato());
        }
    }
}
