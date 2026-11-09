import java.util.Scanner;

/** @author POLITECNICS
 * @version 1.0
 * Calcula el factorial d'un número.
 *
 */

public class Exercici3 {
    /**
     * Mètode principal.
     * @param args paràmetres del programa
     */
    public static void main(String[] args) {
        int numero;
        int factorial = 1;

        System.out.println("Escriu el número del que vols calcular el factorial:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        while (numero >= 1) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println("El factorial de " + numero + "  és: " + factorial);
    }
}
