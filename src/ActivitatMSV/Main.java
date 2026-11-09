package ActivitatMSV;

public class Main {
    public static void main(String[] args) {
        ObjecteJoc objecte = new ObjecteJoc();

        // Atributs i mètodes públics
        objecte.nom = "Espasa màgica";
        objecte.mostrarNom();

        // Default
        objecte.quantitat = 3;
        objecte.mostrarQuantitat();

        // ERROR DE COMPILACIÓ: 'preu' i 'mostrarPreu()' són private i no es poden accedir des de Main.
        // objecte.preu = 150;
        // objecte.mostrarPreu();
    }
}
