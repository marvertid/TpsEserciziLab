package concessionaria;

import java.util.Scanner;

public class Automobile extends Veicolo {
    public Automobile() {
        super();
        super.setnRouteMotrici(4);
    }

    public Automobile(double potenza, int nRouteMotrici, String tipoMotore, String marca, String modello, double velocitaMedia, double lPer100km) {
        super(potenza, nRouteMotrici, tipoMotore, marca, modello, velocitaMedia, lPer100km);
    }

    public double costoALKm() {
        Scanner keyboard = new Scanner(System.in);
        double costo = 0;
        if (super.getTipoMotore().equals("benzina")) {
            System.out.println("Inserire costo al litro della benzina: ");
            costo = keyboard.nextDouble();

        } else if(super.getTipoMotore().equals("diesel")) {
            System.out.println("Inserire costo al litro della diesel: ");
            costo = keyboard.nextDouble();
        }
        return costo;
    }
}
