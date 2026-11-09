import java.util.Scanner;

public class posicionesletra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Introduce una letra: ");
        String entradaLetra = scanner.nextLine();

        if (entradaLetra.isEmpty()) {
            System.out.println("No se introdujo ninguna letra.");
            return;
        }
        char letra = entradaLetra.charAt(0);

        int primera = frase.indexOf(letra);
        int ultima = frase.lastIndexOf(letra);

        if (primera == -1) {
            System.out.println("La letra que buscas'" + letra + "' no aparece en la frase.");
        } else {
            System.out.println("Primera posición: " + primera);
            System.out.println("Última posición:  " + ultima);
        }

        scanner.close();
    }
}