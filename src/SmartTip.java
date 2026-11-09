import java.util.Scanner;

public class SmartTip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalTip = 0.0;
        int totalPeople = 5;
        int tippedCount = 0;
        int notTippedCount = 0;

        System.out.println("Let's calculate the total tip (only from those who wants to contribute)!");

        for (int i = 1; i <= totalPeople; i++) {
            System.out.print("Person " + i + ", do you want to tip the waiter? (yes/no): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("How much will you tip? ");
                double tip = scanner.nextDouble();
                totalTip += tip;
                tippedCount++;
            } else if (answer.equalsIgnoreCase("no")) {
                notTippedCount++;
            } else  {
                System.out.println("Invalid input!");
                notTippedCount++;
            }
        }
        double tippedPercent = (tippedCount * 100.0) / totalPeople;
        double notTippedPercent = notTippedCount * 100.0 / totalPeople;

        System.out.println("\n---Resum---");
        System.out.printf("Total tip for the waiter: %.2f euros%n", totalTip);
        System.out.println("People who tipped: " + tippedCount + " ("+ String.format("%.1f", tippedPercent) + "%)");
        System.out.println("People who did not tip: " + notTippedCount + " ("+ String.format("%.1f", notTippedPercent) + "%)");

        scanner.close();
    }
}
