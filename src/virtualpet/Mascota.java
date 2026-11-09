package virtualpet;

public class Mascota { //dades mascota

    public String nombre;
    public String tipo;
    public int energy;
    public int hygiene;
    public int weight;
    public int mood;

    public Mascota(String nombre, String tipo, int valorInicial) { // constructor amb 3 parametres, poso els atributs i els valors (para el dummy)
        this.nombre = nombre;
        this.tipo = tipo;
        this.energy = valorInicial;
        this.hygiene = valorInicial;
        this.weight = valorInicial;
        this.mood = valorInicial;
    }

    public Mascota(String nombre, String tipo) { // constructor amb 2 parametres per els atributs al atzar de la mascota
        this.nombre = nombre;
        this.tipo = tipo;
        this.energy = azar(40, 60);
        this.hygiene = azar(40, 60);
        this.weight = azar(40, 60);
        this.mood = azar(40, 60);
    }

    // Número aleatorio
    public int azar(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    // Resta quantitat a un atribut sense deixar mai por sota 0
    public int restar(int valor, int cantidad) {
        return Math.max(0, valor - cantidad);
    }

    public void sleep() {
        if (tipo.equals("dog")) {
            energy += 25;
        } else {
            energy += 20;
        }
        mood += 10;
    }

    public void play() {
        energy = restar(energy, 20);
        mood += 20;
        weight = restar(weight, 10);
    }

    public void eat() {
        energy += 10;
        hygiene = restar(hygiene, 15);
        weight += 10;
    }

    public void clean() {
        if (tipo.equals("dog")) {
            energy = restar(energy, 10);
            hygiene += 25;
            mood = restar(mood, 15);
        } else {
            energy = restar(energy, 5);
            hygiene += 25;
            mood += 5;
        }
    }

    // atacar n veces, resta 3 de energy, hygiene y mood a la mascota y al dummy
    // Si la mascota mor es a dir algún atribut arriba a 0, l'atac s'atura al moment.
    public void attack(Mascota dummy, int n) {
        for (int i = 1; i <= n && !this.haMuerto(); i++) {
            this.energy = restar(this.energy, 3);
            this.hygiene = restar(this.hygiene, 3);
            this.mood = restar(this.mood, 3);

            dummy.energy = restar(dummy.energy, 3);
            dummy.hygiene = restar(dummy.hygiene, 3);
            dummy.mood = restar(dummy.mood, 3);
        }
    }

    // Algún atribut <= 0 o > 100?
    public boolean haMuerto() {
        return energy <= 0 || hygiene <= 0 || weight <= 0 || mood <= 0
                || energy > 100 || hygiene > 100 || weight > 100 || mood > 100;
    }

    public String toString() { //dades mascota
        return nombre + " (" + tipo + ") -> Energy: " + energy
                + " | Hygiene: " + hygiene
                + " | Weight: " + weight
                + " | Mood: " + mood;
    }
}
