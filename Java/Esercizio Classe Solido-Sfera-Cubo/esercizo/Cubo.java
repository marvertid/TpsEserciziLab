package esercizo;
public class Cubo extends Solido {
    private double lato;
    public Cubo() {
        super.setPesoSpecifico(0);
        lato = 0;
    }
    public Cubo(double pesoSpecifico, double lato) {
        super.setPesoSpecifico(pesoSpecifico);
        this.lato = lato;
        if (this.lato < 0) {
            this.lato = 0;
        }
    }
    public void setLato(double lato) {
        this.lato = lato;
        if (this.lato < 0) {
            this.lato = 0;
        }
    }
    public double superficie() {
        return 6 * (Math.pow(lato, 2));
    }

    public double peso() {
        return Math.pow(lato, 3) * super.getPesoSpecifico();
    }

    public double volume() {
        return Math.pow(lato, 3);
    }
}
