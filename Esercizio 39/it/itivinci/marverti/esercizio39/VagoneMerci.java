package it.itivinci.marverti.esercizio39;

public class VagoneMerci extends Vagone {
    private double volumeDiCarico;
    private double pesoMax;
    private double pesoEff;

    public VagoneMerci() {
        super();
        volumeDiCarico = 0;
        pesoMax = 0;
        pesoEff = 0;
    }

    public VagoneMerci(int codice, double pesoAVuoto, String aziendaCostruttrice, int annoDiCostruzione, double volumeDiCarico, double pesoMax, double pesoEff) {
        super(codice, pesoAVuoto, aziendaCostruttrice, annoDiCostruzione);
        this.volumeDiCarico = volumeDiCarico;
        this.pesoMax = pesoMax;
        this.pesoEff = pesoEff; 
    }

    public double pesoVagoneTot() {
        return pesoEff + super.getPesoAVuoto();
    }

    public void print() {
        System.out.println("Volume di carico: " + volumeDiCarico);
        System.out.println("Peso massimo: " + pesoMax);
        System.out.println("Peso Efficacie: " + pesoEff);
        System.out.println("Peso Vagone totale: " + pesoVagoneTot());
    }

    public double getVolumeDiCarico() {
        return volumeDiCarico;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public double getPesoEff() {
        return pesoEff;
    }

    public void setVolumeDiCarico(double volumeDiCarico) {
        this.volumeDiCarico = volumeDiCarico;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public void setPesoEff(double pesoEff) {
        this.pesoEff = pesoEff;
    }
}
