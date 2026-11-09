import java.util.Scanner;

public class Sumvalues {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int start = Math.min(num1, num2);
            int end = Math.max(num1, num2);

            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }

            System.out.println("Sum of values of " + start + " + " + end + " = " + sum);

            scanner.close();
        }
}
