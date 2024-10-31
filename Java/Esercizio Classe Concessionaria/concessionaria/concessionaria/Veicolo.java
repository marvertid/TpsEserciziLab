package concessionaria;


public abstract class Veicolo extends MezzoDiTrasporto {
    private String marca;
    private String modello;
    private double velocitaMedia;
    private double lPer100km;
    
    public Veicolo() {
        super();
        marca = "Undefined";
        modello = "Undefined";
        velocitaMedia = 0;
        lPer100km = 0;
    }

    public Veicolo(double potenza, int nRouteMotrici, String tipoMotore, String marca, String modello, double velocitaMedia, double lPer100km) {
        super(potenza, nRouteMotrici, tipoMotore);
        this.marca = marca;
        this.modello = modello;
        this.velocitaMedia = velocitaMedia;
        this.lPer100km = lPer100km;
    }

    public double potenzaPerRuota() {
        return super.getPotenza() / super.getnRouteMotrici();

    }

    public abstract double costoALKm();

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getVelocitaMedia() {
        return velocitaMedia;
    }

    public double getlPer100km() {
        return lPer100km;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setVelocitaMedia(double velocitaMedia) {
        this.velocitaMedia = velocitaMedia;
    }

    public void setlPer100km(double lPer100km) {
        this.lPer100km = lPer100km;
    }
}
