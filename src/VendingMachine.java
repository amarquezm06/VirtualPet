import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Do you want a bottle of water? (y/n): ");
        String waterResponse = scanner.nextLine();

        if (waterResponse.equalsIgnoreCase("y")) {
            System.out.println("Price: $1.00");
        } else if (waterResponse.equalsIgnoreCase("n")) {

            System.out.print("Do you want juice? (y/n): ");
            String juiceResponse = scanner.nextLine();

            if (juiceResponse.equalsIgnoreCase("y")) {
                System.out.println("Price: $1.50");
            } else if (juiceResponse.equalsIgnoreCase("n")) {

                System.out.print("Do you want a soft drink? (y/n): ");
                String softDrinkResponse = scanner.nextLine();

                if (softDrinkResponse.equalsIgnoreCase("y")) {
                    System.out.println("Price: $2.00");
                } else if (softDrinkResponse.equalsIgnoreCase("n")) {
                    System.out.println("Thank you! Have a nice day.");
                } else {
                    System.out.println("Invalid input. Please enter y or n.");
                }
            } else {
                System.out.println("Invalid input. Please enter y or n.");
            }
        } else {
            System.out.println("Invalid input. Please enter y or n.");
        }

        scanner.close();
    }
}
