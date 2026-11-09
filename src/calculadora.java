import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
        System.out.println("\n---CALCULADORA---");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicació");
        System.out.println("4.Divisió");
        System.out.println("5.Sortir");
        System.out.println("Tria la opció (1-5): ");

        int opcio = llegirEnter(scanner);

        if (opcio == 5) {
            System.out.println("Fin");
            continuar = false;
            continue;
        }

        if (opcio < 1  || opcio > 5) {
            System.out.println("Opció no valida");
            continue;
        }
        //Per poguer llegir els nombres positius
        System.out.println("Introdueix el primer numero positiu: ");
        double a = llegirPositiu(scanner);

        System.out.println("Introdueix el segon numero positiu: ");
        double b = llegirPositiu(scanner);

        double resultat = 0;
        boolean OperacioValida = true;

        switch (opcio) {
            case 1:
                resultat= a + b;
                System.out.println("Resultat: " +a+ " + " +b+ " = " +resultat);
                break;
            case 2:
                resultat= a - b;
                System.out.println("Resultat: " +a+ "-" +b+ " = " +resultat);
                break;
            case 3:
                resultat= a * b;
                System.out.println("Resultat: " +a+ "*" +b+ " = " +resultat);
                break;
            case 4:
                if (b==0) {
                    System.out.println("Error: No es port dividir entre 0");
                    OperacioValida = false;
                } else {
                    resultat= a / b;
                    System.out.println("Resultat: " +a+ "/" +b+ " = " +resultat);
                }
                break;
        }
    }
        scanner.close();
}
// Entradas no validas
private static int llegirEnter(Scanner scanner) {
    while (!scanner.hasNextInt()) {
        System.out.print("Entrada no vàlida. Introdueix un número enter: ");
        scanner.next();
    }
    return scanner.nextInt();
    }
private static double llegirPositiu(Scanner scanner) {
    double num;
    while (true) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada no vàlida. Introdueix un número positiu: ");
            scanner.next();
        }
        num = scanner.nextDouble();
        if (num > 0) {
            break;
        } else {
            System.out.print("El numero ha de ser positiu. Introdueix un nou caràcter: ");
        }
    }
    return num;
    }
}