package PruebaArrays;
import java.util.Scanner;
import java.util.Arrays;

public class UsoArraysIII {
    public static void main(String[] args) {

        int [] Arrays_aleatorios =new int [200];

        for (int i = 0; i < Arrays_aleatorios.length; i++) {
            Arrays_aleatorios[i] = (int) (Math.random() * 100);
        }

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero para buscar en el array (0 a 99): ");
        int numeroBuscado = entrada.nextInt();

        boolean encontrado = false;

        for (int elem: Arrays_aleatorios) {
            if (elem == numeroBuscado) {
                encontrado = true;
                break;
            }
        }


        System.out.println("----------------------------------------");
        if (encontrado) {
            System.out.println("¡El valor " + numeroBuscado + " SÍ está en el array!");
        } else {
            System.out.println("El valor " + numeroBuscado + " NO se encuentra en el array.");
        }

        entrada.close();
    }
}

