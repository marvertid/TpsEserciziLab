package it.itisvinci.diego.verificadiggle;

public class Posto {
    private boolean isOccupato;
    private int nPosto;

    public Posto() {
        isOccupato = false;
        nPosto = 0;
    }

    public Posto(int nPosto) {
        isOccupato = false;
        this.nPosto = nPosto;
    }

    public int getnPosto() {
        return nPosto;
    }
    public void setnPosto(int nPosto) {
        this.nPosto = nPosto;
    }

    public boolean isOccupato() {
        return isOccupato;
    }
    public void setOccupato() {
        isOccupato = true;
    }
}
