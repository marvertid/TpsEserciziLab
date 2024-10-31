package it.itivinci.marverti.esercizio39;

public abstract class Vagone {
    private int codice;
    private double pesoAVuoto;
    private String aziendaCostruttrice;
    private int annoDiCostruzione;

    public Vagone() {
        codice = 0;
        pesoAVuoto = 0;
        aziendaCostruttrice = "Undefined";
        annoDiCostruzione = 0;
    }

    public Vagone(int codice, double pesoAVuoto, String aziendaCostruttrice, int annoDiCostruzione) {
        this.codice = codice;
        this.pesoAVuoto = pesoAVuoto;
        this.aziendaCostruttrice = aziendaCostruttrice;
        this.annoDiCostruzione = annoDiCostruzione;
    }

    public abstract double pesoVagoneTot();
    public abstract void print();

    public int getAnnoDiCostruzione() {
        return annoDiCostruzione;
    }

    public String getAziendaCostruttrice() {
        return aziendaCostruttrice;
    }

    public int getCodice() {
        return codice;
    }

    public double getPesoAVuoto() {
        return pesoAVuoto;
    }

    public void setAnnoDiCostruzione(int annoDiCostruzione) {
        this.annoDiCostruzione = annoDiCostruzione;
    }

    public void setAziendaCostruttrice(String aziendaCostruttrice) {
        this.aziendaCostruttrice = aziendaCostruttrice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setPesoAVuoto(double pesoAVuoto) {
        this.pesoAVuoto = pesoAVuoto;
    }
}
