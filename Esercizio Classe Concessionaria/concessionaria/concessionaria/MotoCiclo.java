package concessionaria;

import java.util.Scanner;

public class MotoCiclo extends Veicolo {
    public MotoCiclo() {
        super();
        super.setnRouteMotrici(2);
    }

    public MotoCiclo(double potenza, int nRouteMotrici, String tipoMotore, String marca, String modello, double velocitaMedia, double lPer100km) {
        super(potenza, nRouteMotrici, tipoMotore, marca, modello, velocitaMedia, lPer100km);
    }

    public double costoALKm() {
        Scanner keyboard = new Scanner(System.in);
        double costo = 0;
        if (super.getTipoMotore().equals("benzina")) {
            System.out.println("Inserire costo al litro della benzina: ");
            costo = keyboard.nextDouble();

        } else if(super.getTipoMotore().equals("diesel")) {
            System.out.println("Inserire costo al litro della benzina: ");
            costo = keyboard.nextDouble();
        }
        return costo;
    }
    
}
