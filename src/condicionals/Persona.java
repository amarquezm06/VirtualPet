package condicionals;

public class Persona {
    public String nom;
    public int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public boolean esMajorEdat() {
        return edat >= 18;
    }

    public String obtenirEtapa() {
        if (edat <= 2) {
            return "Nadó";
        } else if (edat <= 4) {
            return "Infant petit";
        } else if (edat <= 17) {
            return "Nen/a";
        } else if (edat <= 39) {
            return "Adult jove";
        } else if (edat <= 66) {
            return "Adult";
        } else {
            return "Sènior";
        }
    }

    public void mostrarInformacio() {
        System.out.println(nom + " té " + edat + " anys.");
        System.out.println("Etapa: " + obtenirEtapa());

        if (esMajorEdat()) {
            System.out.println("És major d'edat.");
        } else {
            System.out.println("És menor d'edat.");
        }
    }
}

