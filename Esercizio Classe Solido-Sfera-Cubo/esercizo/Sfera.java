package esercizo;

public class Sfera extends Solido{
    private double raggio;
    
    public Sfera() {
        raggio = 0;
        super.setPesoSpecifico(0);
    }    
    
    public Sfera(double pesoSpecifico, double raggio) {
        super.setPesoSpecifico(pesoSpecifico);
        this.raggio = raggio;
        if (this.raggio < 0) {
            raggio = 0;
        }
    }

    public double getRaggio() {
        return raggio;
    }

    public double superficie() {
        return 4 * Math.PI * Math.pow(raggio, 2);
    }

    public double peso() {
        return 4 / 3 * Math.PI * Math.pow(raggio, 3) * super.getPesoSpecifico();
    }

    public double volume() {
        return 4 / 3 * Math.PI * Math.pow(raggio, 3);
    }
}
