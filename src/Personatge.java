import java.util.Scanner;

public class Personatge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de dades
        System.out.print("Raça: ");
        String raca = sc.nextLine();
        System.out.print("Nom: ");
        String nom = sc.nextLine();

        System.out.print("Força: ");
        int forca = sc.nextInt();
        System.out.print("Destresa: ");
        int destresa = sc.nextInt();
        System.out.print("Constitució: ");
        int constitucio = sc.nextInt();
        System.out.print("Inteligencia: ");
        int inteligencia = sc.nextInt();
        System.out.print("Sabiduria: ");
        int sabiduria = sc.nextInt();
        System.out.print("Carisma: ");
        int carisma = sc.nextInt();

        sc.close();

        System.out.println();
        System.out.println("Raça: " + raca);
        System.out.println("Nom: " + nom);
        System.out.println("Força: " + forca);
        System.out.println("Destresa: " + destresa);
        System.out.println("Constitució: " + constitucio);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Sabiduria: " + sabiduria);
        System.out.println("Carisma: " + carisma);

        System.out.println("--------------------------------");
        System.out.printf("| %-28s |%n", raca);
        System.out.printf("| %-28s |%n", nom);
        System.out.println("--------------------------------");
        System.out.printf("| %-17s %10d |%n", "Força", forca);
        System.out.printf("| %-17s %10d |%n", "Destresa", destresa);
        System.out.printf("| %-17s %10d |%n", "Constitució", constitucio);
        System.out.printf("| %-17s %10d |%n", "Inteligencia", inteligencia);
        System.out.printf("| %-17s %10d |%n", "Sabiduria", sabiduria);
        System.out.printf("| %-17s %10d |%n", "Carisma", carisma);
        System.out.println("--------------------------------");
    }
}