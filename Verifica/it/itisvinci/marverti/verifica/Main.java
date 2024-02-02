package it.itisvinci.marverti.verifica;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Orda orda = new Orda();
        String input = "";
        double tempoTot = 0;
        boolean isFull = false;
        while (!input.equals("next") && !isFull) {
            System.out.println("Inserire il codice identificativo dell'Orco: ");
            input = keyboard.next();
            if (!input.equals("next")) {
                int codice = Integer.parseInt(input);
                orda.print(codice);
                orda.inserisciOrco(codice);
                if (orda.getOrdaLength() >= 3) isFull = true;
                System.out.println(isFull);
            } else if (input.equals("next") && orda.getOrdaLength() == 0) {
                System.out.println("Non hai inserito nulla!");
                input = "";
            }
        }
        input = "";
        while (!input.equals("next")) {
            System.out.println("Inserire il tipo di terreno: ");
            input = keyboard.next();
            String tipoTerreno = input;
            if (!input.equals("next"))
            {
                System.out.println("Inserire il numero di km da percorrere: ");
                double km = keyboard.nextDouble();
                tempoTot = orda.calcTempo(tipoTerreno, km);
            }
        }
        System.out.println("Tempo totale di percorrenza: " + tempoTot);
    }
}