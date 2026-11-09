package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase;
        char letra;
        int primera = -1;
        int ultima = -1;

        System.out.print("Frase: ");
        frase = scanner.nextLine();

        System.out.print("Letra: ");
        letra = scanner.nextLine().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (letra == frase.charAt(i)) {
                if (primera == -1) {
                    primera = i;
                }
                ultima = i;
            }
        }

        if (primera == -1) {
            System.out.println("La letra " + letra + " no aparecee en la frase.");
        } else {
            System.out.println("Primera posición: " + primera);
            System.out.println("Última posición: " + ultima);
        }
    }
}