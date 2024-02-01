package it.itivinci.marverti.verifica;

public abstract class Prodotto {
    private double iva;
    private int codice;
    private double prezzo;
    private String descrizione;
    private double baseImp;
    public Prodotto() {
        iva = 0;
        codice = 0;
        prezzo = 0;
        descrizione = "Undefined";
    }
    public Prodotto(double iva, int codice, double prezzo, String descrizione) {
        this.iva = iva;
        this.codice = codice;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public abstract void calcPrezzo();
    public abstract void read();
    public abstract void print();
    public double getIva() {
        return iva;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setBaseImp(double baseImp) {
        this.baseImp = baseImp;
    }

    public double getBaseImp() {
        return baseImp;
    }
}
