import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your age: ");
        int edad = scanner.nextInt();

        String Categoria = "";

        if (edad < 0) {
            System.out.println("The age cannot be negative");
        } else if (edad <= 2) {
            Categoria = "Baby";
        } else if (edad <=4) {
            Categoria = "Toddler";
        }  else if (edad < 18) {
            Categoria = "kid";
        } else if (edad < 40) {
            Categoria = "Young Adult";
        } else if (edad < 67) {
            Categoria = "Adult";
        } else {
            Categoria = "Senior";
        }

        if (edad >= 0) {
            System.out.println("You are a "+ Categoria +".");
        }

        scanner.close();
    }
}
