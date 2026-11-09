import java.util.Scanner;

public class vowelorconsonant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a letter: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("Please enter exactly one character.");
            } else {
                char letter = input.charAt(0);

                if (!Character.isLetter(letter)) {
                    System.out.println("Please enter a valid letter (a-z or A-Z).");
                } else {

                    char lowerLetter = Character.toLowerCase(letter);

                    if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' ||
                            lowerLetter == 'o' || lowerLetter == 'u') {
                        System.out.println("'" + letter + "' is a vowel.");
                    } else {
                        System.out.println("'" + letter + "' is a consonant.");
                    }
                }
            }

            scanner.close();
        }
}