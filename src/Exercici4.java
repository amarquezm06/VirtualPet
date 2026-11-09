/** @author POLITECNICS
 * @version 1.0
 * Pintar una diagonal com a continuació:
    ·
   ·
  ·
 ·
·
 */

public class Exercici4 {
    /**
     * Mètode principal.
     * @param args paràmetres del programa
     */
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows -i; j++) {
                System.out.print(" ");
            }
            System.out.println(".");
        }
    }
}