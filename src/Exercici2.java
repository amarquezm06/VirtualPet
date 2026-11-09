import java.util.Scanner;

/** @author POLITECNICS
 * @version 1.0
 * Fa la resta entre 2 números
 */

public class Exercici2 {
    /**
     * Mètode principal.
     * @param args paràmetres del programa
     */
    public static void main(String[] args) {
        int a;
        int b;
        int resta = 0;

        System.out.println("Escriu els números dels que vols calcular la resta");
        Scanner sc = new Scanner(System.in);

        System.out.println("Número 1: ");
        a = sc.nextInt();

        System.out.println("Número 2: ");
        b = sc.nextInt();

        resta = a - b;
        System.out.println("El resultat de la resta és: " + resta);

    }
}
