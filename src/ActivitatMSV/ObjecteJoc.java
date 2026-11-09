package ActivitatMSV;

public class ObjecteJoc {
    public String nom;
    private int preu;
    int quantitat;

    // Mètodes
    public void mostrarNom() {
        System.out.println("Nom: " + nom);
    }

    private void mostrarPreu() {
        System.out.println("Preu: " + preu);
    }

    void mostrarQuantitat() {
        System.out.println("Quantitat: " + quantitat);
    }
}
