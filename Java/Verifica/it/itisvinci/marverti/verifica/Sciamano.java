package it.itisvinci.marverti.verifica;

public class Sciamano extends Orco{
    public Sciamano() {
        setCodice(2);
    }

    public double velEffettiva(String tipoTerreno) {
        if (tipoTerreno.equals("erba")) {
            return (getVelBase() * 0.30) + getVelBase();
        }
        return getVelBase();
    }



}
