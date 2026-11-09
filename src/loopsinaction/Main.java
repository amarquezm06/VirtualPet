package loopsinaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        int numero = sc.nextInt();

        TaulaMultiplicar taula = new TaulaMultiplicar(numero);
        taula.mostrarTaula();

        sc.close();
    }
}
