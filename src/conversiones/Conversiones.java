package conversiones;

import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        String nom1, nom2;
        String cicle1, cicle2;


        nom1 = "Paz Rueda";
        cicle1 = "DAM";
        nom2 = "Francisco Fernández";
        cicle2 = "DAW";
        Scanner sc = new Scanner(System.in);

        System.out.println("LLISTAT ALUMNES");
        System.out.println();
        System.out.printf("%-4s %-30s %-5s\n","CODI","NOM", "CICLE");
        System.out.println("---- ------------------------------ -----");
        System.out.printf("%04d %-30s %-5s\n", 1, nom1, cicle1);
        System.out.printf("%04d %-30s %-5s\n", 2, nom2, cicle2);

    }
}