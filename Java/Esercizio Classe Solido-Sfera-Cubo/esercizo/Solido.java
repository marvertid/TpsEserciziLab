package esercizo;

public abstract class Solido {
    private double pesoSpecifico;
    
    public Solido() {
        pesoSpecifico = 0;
    }
    public Solido(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico; 
    }
    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public void setPesoSpecifico(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
        if (this.pesoSpecifico < 0) {
            this.pesoSpecifico = 0;
        }
    }

    public abstract double superficie();
    public abstract double volume();
    public abstract double peso();

}
