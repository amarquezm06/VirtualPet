package condicionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom: ");
        String nom = sc.nextLine();

        System.out.print("Edat: ");
        int edat = sc.nextInt();

        Persona persona = new Persona(nom, edat);
        persona.mostrarInformacio();

        sc.close();
    }
}