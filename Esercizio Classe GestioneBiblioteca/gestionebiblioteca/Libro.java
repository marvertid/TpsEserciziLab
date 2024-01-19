package gestionebiblioteca;

public class Libro {
    private int codice;
    private String titolo;
    private int annoPubb;
    private String editore;

    public Libro() {
        codice = 0;
        titolo = "Undefined";
        annoPubb = -1;
        editore = "Undefined";
    }

    public Libro(int codice, String titolo, int annoPubb, String editore) {
        this.codice = codice;
        this.titolo = titolo;
        this.annoPubb = annoPubb;
        this.editore = editore;
    }
    public void setAnnoPubb(int annoPubb) {
        this.annoPubb = annoPubb;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getCodice() {
        return codice;
    }

    public int getAnnoPubb() {
        return annoPubb;
    }

    public String getEditore() {
        return editore;
    }

    public String getTitolo() {
        return titolo;
    }
}
