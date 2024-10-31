package gestionebiblioteca;

/**
 * Una biblioteca scolastica deve gestire mediante un'applicazione un elenco di libri: per ogni libro è necessario memorizzare il codice, il titolo, l'anno di pubblicazione e l'editore. L'applicazione deve consentire le seguenti operazioni:
 * <br />- aggiunta di un nuovo libro alla biblioteca;
 * <br />- ricerca di un libro a partire dal titolo;
 * <br />- ricerca di tutti i libri di uno specifico autore. <br />
 * Progettare l'applicazione di gestione della biblioteca e implementarla in linguaggio Java.
 */

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro(123, "un bel libro", 2023, "io");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(libro);
        biblioteca.stampa();

    }

}
