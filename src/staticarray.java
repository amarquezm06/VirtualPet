import java.util.Scanner;

public class staticarray {

    public static void  main(String args[]) {
        int[] arraysAletorio=new int[150];
        for (int i = 0; i < arraysAletorio.length; i++) {
            arraysAletorio[i]= (int)(Math.random()*100);
        }

        System.out.println("GENERATED NUMBERS:");
        for (int numero : arraysAletorio) {
            System.out.println(numero + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a number (0-99): ");
        int numeroBuscado = sc.nextInt();

        boolean encontrado = false;
        for (int numero : arraysAletorio) {
            if (numero == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("NO FOUND NUMBER:" + numeroBuscado);
        }else  {
            System.out.println("YES! THERE IS THE NUMBER:" + numeroBuscado);
        }


    }

}
