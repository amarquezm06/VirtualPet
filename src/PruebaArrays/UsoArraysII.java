package PruebaArrays;

import javax.swing.*;

public class UsoArraysII {
    public static void main(String[] args) {
        String[] paises = new String[8];

        for (int i=0; i<8; i++) {

            paises[i] = JOptionPane.showInputDialog("Ingrese la pais: ");
        }



        for (String elemento: paises) System.out.println("Pais: " + elemento);


    }
}
