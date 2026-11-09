package friend;

//importem el package
import teclat.Teclat;

public class Main {
    public static void main(String[] args) {
        // 1. Demanar les dades mitjançant la classe Teclat
        System.out.print("Introdueix l'edat: ");
        int age = Teclat.llegirInt();

        System.out.print("Introdueix la nota mitjana: ");
        double averageGrade = Teclat.llegirDouble();

        System.out.print("Introdueix el gènere (H - Home / D - Dona / A - Altre): ");
        char gender = Teclat.llegirChar();

        Friend friend1 = new Friend(age, averageGrade, gender);

        // Resultat
        System.out.println("Edat: " + friend1.age + " anys | Nota mitjana: " + friend1.averageGrade + " | Gènere: " + friend1.gender);
    }
}