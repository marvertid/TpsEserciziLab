package it.itisvinci.esercizio.marverti;

/*Costruire un programma che gestisca un conto corrente bancario, effettuando le operazioni di
incremento e decremento del saldo, a fronte dei prelievi e versamenti dell’intestatario del
conto. Le transazioni dell’intestatario, corredate da causale, devono essere implementate come
thread, e deve essere sempre garantita la sincronizzazione, in modo che il saldo del conto
corrente sia sempre corretto.
 */


public class Main {
    public static void main(String[] args) {
        Conto conto = new Conto();
        Transizione t1 = new Transizione("Prova1", conto);
        Transizione t2 = new Transizione("Prova2", conto);
        t1.start();
        t2.start();
    }
}
