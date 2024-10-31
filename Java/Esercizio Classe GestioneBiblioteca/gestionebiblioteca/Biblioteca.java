package gestionebiblioteca;
import java.util.Arrays;

public class Biblioteca {
    private int dim;
    private Libro[] arrLibri;

    public Biblioteca() {
        dim = 0;
        arrLibri = new Libro[dim];
    }

    public int getDim() {
        return dim;
    }

    public Libro[] getArrLibri() {
        return arrLibri;
    }

    public Biblioteca(int dim) {
        this.dim = dim;
        arrLibri = new Libro[dim];
    }

    public void addLibro(Libro newLibro) {
        Libro[] temp = Arrays.copyOf(arrLibri, dim + 1);
        arrLibri = new Libro[temp.length];
        arrLibri[arrLibri.length - 1] = newLibro;
        dim++;
    }

    public int searchLibro(String titolo) {
        int i;
        for (i = 0; i < arrLibri.length && !(arrLibri[i].getTitolo().equals(titolo)); i++);

        if(i != arrLibri.length) {
            return i;
        }
        return -1;
    }

    public Libro[] searchAllLibro(String titolo) {
        Libro[] temp = new Libro[1];
        int j = 0;
        for(int i = 0; i < arrLibri.length; i++) {
            if(arrLibri[i].getTitolo().equals(titolo)) {
                temp[j++] = arrLibri[i];
            }
        }
        return temp;
    }
    public void stampa() {
        System.out.println("Numero di libri presenti: " + dim);
        for (int i = 0; i < dim; i++) {
            System.out.println("Codice: " + arrLibri[i].getCodice());
            System.out.println("Titolo: " + arrLibri[i].getTitolo());
            System.out.println("Editore: " + arrLibri[i].getEditore());
            System.out.println("Anno pub: " + arrLibri[i].getAnnoPubb());
        }
    }
}
