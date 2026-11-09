package GettersSetters;

public class Personatge {
    private String nom;
    private int nivell;
    private int vida;

    public Personatge(String nom) {
        this.nom = nom;
        this.nivell = 1;   // Nivell inicial per defecte
        this.vida = 100; // Vida inicial per defecte
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public int getNivell() {
        return this.nivell;
    }

    public int getVida() {
        return this.vida;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    // Repte
    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
    }
}