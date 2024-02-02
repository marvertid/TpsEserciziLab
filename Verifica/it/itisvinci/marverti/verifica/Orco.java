package it.itisvinci.marverti.verifica;

public abstract class Orco {
    private int codice;
    private double velBase;
    private double tempoDiPercorrenza;
    public Orco() {
        velBase = 10;
        tempoDiPercorrenza = 0;
    }

    public Orco(double velBase) {
        this.velBase = velBase;
    }

    public abstract double velEffettiva(String tipoTerreno);
    public void calcTempoDiPercorrenza(double km, double velEffettiva) {
        setTempoDiPercorrenza(getTempoDiPercorrenza() + (60 / velEffettiva * km));
    }

    public double getVelBase() {
        return velBase;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setTempoDiPercorrenza(double tempoDiPercorrenza) {
        this.tempoDiPercorrenza = tempoDiPercorrenza;
    }

    public double getTempoDiPercorrenza() {
        return tempoDiPercorrenza;
    }
}


