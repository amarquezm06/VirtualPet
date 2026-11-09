import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalTip = 0.0;

        System.out.println("Let's calculate the total tip for the waiter!");

        // Loop for 5 people: you + 4 friends
        for (int i = 1; i <= 5; i++) {
            System.out.print("Person " + i + ", how much will you tip (in euros)? ");
            double tip = scanner.nextDouble();
            totalTip += tip;
        }

        System.out.printf("Total tip for the waiter: %.2f euros%n", totalTip);
        scanner.close();
    }
}
