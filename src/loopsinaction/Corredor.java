package loopsinaction;

public class Corredor {
    public String nom;
    public int avituallamentActual;

    public void mostrarAvituallamentsSuperats() {
        System.out.println();
        System.out.println(nom + " ha passat pels següents avituallaments:");
        //Empieza en 1, repite hasta el avituallamiento actual y suma 1 en cada vuelta
        for (int i = 1; i <= avituallamentActual; i++) {
            System.out.println("Avituallament " + i);
        }
    }
}

