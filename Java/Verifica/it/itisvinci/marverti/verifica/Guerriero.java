package it.itisvinci.marverti.verifica;

public class Guerriero extends Orco {
    public Guerriero() {
        setCodice(1);
    }

    public double velEffettiva(String tipoTerreno) {
        return getVelBase();
    }


}
