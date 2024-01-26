package it.itivinci.marverti.esercizio39;

public class VagonePasseggeri extends Vagone {
    private String classe;
    private int nPostDisp;
    private int nPostiOcc;
    private double pesoMedio = 65;

    public VagonePasseggeri() {
        super(); //si puo non mettere
        classe = "Undefined";
        nPostDisp = 0;
        nPostiOcc = 0;
    }

    public VagonePasseggeri(int codice, double pesoAVuoto, String aziendaCostruttrice, int annoDiCostruzione, String classe, int nPostDisp, int nPostiOcc) {
        super(codice, pesoAVuoto, aziendaCostruttrice, annoDiCostruzione);
        this.classe = classe;
        this.nPostDisp = nPostDisp;
        this.nPostiOcc = nPostiOcc;
    }

    public double pesoVagoneTot() {
        return (pesoMedio * nPostiOcc) + super.getPesoAVuoto();
    }

    public void print() {
        System.out.println("Classe: " + classe);
        System.out.println("Numero posti disponibili: " + nPostDisp);
        System.out.println("Numero posti occupati: " + nPostiOcc);
        System.out.println("Peso Vagone totale: " + pesoVagoneTot());
    }

    public String getClasse() {
        return classe;
    }

    public int getnPostDisp() {
        return nPostDisp;
    }

    public int getnPostiOcc() {
        return nPostiOcc;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setnPostDisp(int nPostDisp) {
        this.nPostDisp = nPostDisp;
    }

    public void setnPostiOcc(int nPostiOcc) {
        this.nPostiOcc = nPostiOcc;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }



}
