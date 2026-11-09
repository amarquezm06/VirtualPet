package PruebaArrays;

import java.util.Arrays;

public class UsoArrays {
    public static void main(String[] args) {

        int [] miArray = new int [5];

        miArray[0] = 1273;
        miArray[1] = 2587;
        miArray[2] = 38;
        miArray[3] = 278;
        miArray[4] = 28;

        for(int i=0;i<miArray.length;i++){
            System.out.println("La posicion de mi Arrays es " + i + " y su valor es " + miArray[i]);
        }
    }
}
