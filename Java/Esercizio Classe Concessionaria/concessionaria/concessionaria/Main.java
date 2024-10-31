package concessionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Automobile macchininaRossa = new Automobile(525, 4, "benzina", "Porche", "GT3-RS", 100, 13.4);
        MotoCiclo motinaRossa = new MotoCiclo(998, 2, "diesel", "Yamaha", "R1", 100, 6.8);
        double costoBenzina = macchininaRossa.costoALKm();
        System.out.println("Costo benzina: " + costoBenzina);
        double costoDiesel = motinaRossa.costoALKm();
        System.out.println("Costo diesel: " + costoDiesel);
        System.out.println("Inserire modello da cercare: ");
        String input = keyboard.next();
        if (input.equals("GT3-RS")) {
            System.out.println("Potenza: " + macchininaRossa.getPotenza());
            System.out.println("Numero ruote motrici: " + macchininaRossa.getnRouteMotrici());
            System.out.println("Tipo Motore: " + macchininaRossa.getTipoMotore());
            System.out.println("Marca: " + macchininaRossa.getMarca());
            System.out.println("Modello: " + macchininaRossa.getModello());
            System.out.println("Velocita Media: " + macchininaRossa.getVelocitaMedia());
            System.out.println("l/100km: " + macchininaRossa.getlPer100km());
        } else if (input.equals("R1")) {
            System.out.println("Potenza: " + motinaRossa.getPotenza());
            System.out.println("Numero ruote motrici: " + motinaRossa.getnRouteMotrici());
            System.out.println("Tipo Motore: " + motinaRossa.getTipoMotore());
            System.out.println("Marca: " + motinaRossa.getMarca());
            System.out.println("Modello: " + motinaRossa.getModello());
            System.out.println("Velocita Media: " + motinaRossa.getVelocitaMedia());
            System.out.println("l/100km: " + motinaRossa.getlPer100km());
        } else {
            System.out.println("Modello non presente nel sistema");
        }
    }
}
