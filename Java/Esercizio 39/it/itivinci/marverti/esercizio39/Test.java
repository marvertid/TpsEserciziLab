package it.itivinci.marverti.esercizio39;

public class Test {
    public static void main(String[] Args) {
        Treno treno = new Treno();
        treno.addVagoneMerci(new VagoneMerci());
        System.out.println(treno.calcolaPeso());
    }
}
