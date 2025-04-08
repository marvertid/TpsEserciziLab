package it.vinci.db.data;

public class Mensa {
    private String CF;
    private String data_pasto;
    private String ordinazione;

    public Mensa(String CF, String data_pasto, String ordinazione) {
        this.CF = CF;
        this.data_pasto = data_pasto;
        this.ordinazione = ordinazione;
    }

     public Mensa(String CF, String ordinazione) {
        this.CF = CF;
        this.ordinazione = ordinazione;
    }

    public Mensa(String data_pasto) {
        this.data_pasto = data_pasto;
    }

    public void setOrdinazione(String ordinazione) {
        this.ordinazione = ordinazione;
    }

    public void setData_pasto(String data_pasto) {
        this.data_pasto = data_pasto;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public String getCF() {
        return CF;
    }

    public String getOrdinazione() {
        return ordinazione;
    }

    public String getData_pasto() {
        return data_pasto;
    }
}
