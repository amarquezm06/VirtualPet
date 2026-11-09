package GettersSetters;

public class Main {
    public static void main(String[] args) {

        Personatge p = new Personatge("Link");


        System.out.println("=== PERSONATGE ===");
        System.out.println("Nom: " + p.getNom());
        System.out.println("Nivell: " + p.getNivell());
        System.out.println("Vida: " + p.getVida());

        // Canviar el nivell del personatge a 5 utilitzant el seu setter
        p.setNivell(5);

        // Canviar la seva vida a 80 utilitzant el seu setter
        p.setVida(80);


        System.out.println("\n=== DESPRÉS DE MILLORAR ===");
        System.out.println("Nom: " + p.getNom());
        System.out.println("Nivell: " + p.getNivell());
        System.out.println("Vida: " + p.getVida());
    }
}
