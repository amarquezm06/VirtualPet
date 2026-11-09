import java.util.Scanner;

public class aplicacioparaules {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] paraules = introduceStrings(scanner);

        int opcio;
        do {
            opcio = menu(scanner);
            switch (opcio) {
                case 1:
                    System.out.print("Introdueix la paraula a cercar: ");
                    String paraulaCercar = scanner.nextLine();
                    int posicio = buscarPalabra(paraules, paraulaCercar);
                    if (posicio == -1) {
                        System.out.println("La paraula no s'ha trobat.");
                    } else {
                        System.out.println("La paraula '" + paraulaCercar + "' es troba a la posició " + posicio + ".");
                    }
                    break;

                case 2:
                    System.out.print("Introdueix la paraula a reemplaçar: ");
                    String paraula1 = scanner.nextLine();
                    System.out.print("Introdueix la nova paraula: ");
                    String paraula2 = scanner.nextLine();

                    boolean trobada = reemplazarString(paraules, paraula1, paraula2);
                    if (trobada) {
                        System.out.println("Paraula reemplaçada correctament.");
                    } else {
                        System.out.println("La paraula '" + paraula1 + "' no s'ha trobat.");
                    }
                    break;

                case 3:
                    System.out.println("Fin");
                    break;

                default:
                    System.out.println("Opció no vàlida. Tria 1, 2 o 3.");
            }
        } while (opcio != 3);

        scanner.close();
    }

    private static String[] introduceStrings(Scanner scanner) {
        String[] paraules = new String[5];
        System.out.println("Introdueix 5 paraules:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Paraula " + (i + 1) + ": ");
            paraules[i] = scanner.nextLine().trim();
        }
        return paraules;
    }

    private static int menu(Scanner scanner) {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Cercar paraula");
        System.out.println("2. Reemplaçar paraula");
        System.out.println("3. Sortir");
        System.out.print(" Que vols realitzar? (1-3): ");

        int opcio = 0;
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no vàlida. Introdueix un número (1-3): ");
            scanner.next();
        }
        opcio = scanner.nextInt();
        scanner.nextLine();
        return opcio;
    }

    private static int buscarPalabra(String[] paraules, String paraula) {
        for (int i = 1; i < paraules.length; i++) {
            if (paraules[i].equals(paraula)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean reemplazarString(String[] paraules, String paraula1, String paraula2) {
        for (int i = 0; i < paraules.length; i++) {
            if (paraules[i].equals(paraula1)) {
                paraules[i] = paraula2;
                return true;
            }
        }
        return false;
    }
}