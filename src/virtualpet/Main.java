package virtualpet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc per llegir pel teclat el que escriu l’usuari

        String tipo = "";
        while (!tipo.equals("gos") && !tipo.equals("gat")) {
            System.out.print("Escull la teva mascota (gos / gat): ");
            tipo = sc.nextLine().trim().toLowerCase();
        }
        System.out.print("Nom de la mascota: ");
        String nombre = sc.nextLine();

        Mascota mascota = new Mascota(nombre, tipo);

        Mascota dummy = new Mascota("Dummy", "dummy", 100);

        int opcion;
        boolean muerto = false;

        do {
            System.out.println();
            System.out.println(mascota);
            System.out.println("1.- Sleep");
            System.out.println("2.- Play");
            System.out.println("3.- Eat");
            System.out.println("4.- Clean");
            System.out.println("5.- Attack");
            System.out.println("0.- Exit");
            System.out.print("Option: ");
            opcion = sc.nextInt();

            switch (opcion) { // truca al métode que correspon a la opció
                case 0:
                    System.out.println("Adeu!");
                    break;
                case 1:
                    mascota.sleep();
                    break;
                case 2:
                    mascota.play();
                    break;
                case 3:
                    mascota.eat();
                    break;
                case 4:
                    mascota.clean();
                    break;
                case 5:
                    System.out.print("Quantes vegades vols atacar? ");
                    int n = sc.nextInt();
                    mascota.attack(dummy, n);
                    System.out.println(dummy);
                    break;
                default:
                    System.out.println("Opció no valida");
            }

            if (opcion != 0 && mascota.haMuerto()) {
                System.out.println();
                System.out.println(mascota);
                System.out.println(mascota.nombre + " ha mort. GAME OVER");
                muerto = true; //sortim del bucle
            }

        } while (opcion != 0 && !muerto); //Repeteix el menú mentre l’usuari no esculleixi (0) i la mascota no hagi mort

        sc.close(); //tancamnt sc
    }
}

