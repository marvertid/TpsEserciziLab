package concessionaria;

public abstract class MezzoDiTrasporto {
    private double potenza;
    private int nRouteMotrici;
    private String tipoMotore;
    
    public MezzoDiTrasporto() {
        potenza = 0;
        nRouteMotrici = 0;
        tipoMotore = "Undefined";
    }

    public MezzoDiTrasporto(double potenza, int nRouteMotrici, String tipoMotore) {
        this.potenza = potenza;
        this.nRouteMotrici = nRouteMotrici;
        this.tipoMotore = tipoMotore;
    }

    public abstract double potenzaPerRuota();

    public double getPotenza() {
        return potenza;
    }

    public String getTipoMotore() {
        return tipoMotore;
    }

    public int getnRouteMotrici() {
        return nRouteMotrici;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public void setTipoMotore(String tipoMotore) {
        this.tipoMotore = tipoMotore;
    }

    public void setnRouteMotrici(int nRouteMotrici) {
        this.nRouteMotrici = nRouteMotrici;
    }
}
