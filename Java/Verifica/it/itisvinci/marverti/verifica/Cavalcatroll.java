package it.itisvinci.marverti.verifica;

public class Cavalcatroll extends Orco{

    public Cavalcatroll() {
        setCodice(3);
    }

    public double velEffettiva(String tipoTerreno) {
        if (tipoTerreno.equals("ghiaia")) {
            return getVelBase() - (getVelBase() * 0.20);
        }
        return getVelBase();
    }
}
