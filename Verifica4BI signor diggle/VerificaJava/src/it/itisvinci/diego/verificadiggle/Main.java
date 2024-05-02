package it.itisvinci.diego.verificadiggle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Sala sala = new Sala();
        List<Bigliettaio> bigliettai = new ArrayList<>();

        System.out.println("Sala prima dei thread: ");
        sala.stampa();

        for (int i = 0; i < 10; i++) {
            bigliettai.add(new Bigliettaio(sala));
        }

        for (Bigliettaio bigliettaio : bigliettai) {
            bigliettaio.start();
        }

        for (Bigliettaio bigliettaio : bigliettai) {
            bigliettaio.join();
        }

        sala.stampa();
    }
}