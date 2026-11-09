import java.util.Locale;
import java.util.Scanner;

public class Descomptefidelitat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Intrdueix el preu total de la compra (en €) ");
        double preu = scanner.nextDouble();

        double preudespresdescompte;

        if (preu > 150) {
            preudespresdescompte = preu * 0.85;
        } else if (preu >= 100) {
            preudespresdescompte = preu * 0.90;
        }  else {
            preudespresdescompte = preu;
        }

        System.out.print("Tens targeta de fidelitat? (si/no): ");
        String resposta = scanner.next().toLowerCase();

        double preuFinal = preudespresdescompte;
        if (resposta.equals("si") || resposta.equals("si") || resposta.equals("s")) {
            preuFinal = preudespresdescompte - 5.0;
            if (preuFinal < 0) {
                preuFinal = 0.0;
            }
        }

        System.out.printf("El preu final a pagar es: %.2f €%n", preuFinal);
        scanner .close();

    }
}
