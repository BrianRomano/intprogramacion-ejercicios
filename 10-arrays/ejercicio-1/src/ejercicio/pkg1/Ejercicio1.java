package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int total = 0, igual36 = 0, mayor50 = 0, i;
        int[] vector = new int[8];

        //Proceso
        for (i = 0; i < 8; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));
            //Mostrar todos los valores ingresados
            System.out.println(i + "- valor: " + vector[i]);
            //Suma total de valores ingresados
            total += vector[i];

            //Categorizo valores
            if (vector[i] == 36) {
                igual36++;
            } else if (vector[i] > 50) {
                mayor50++;
            }
        }

        //Mostrar
        JOptionPane.showMessageDialog(null, "Total: " + total + "\nIgual a 36: " + igual36 + "\nMayores a 50: " + mayor50);
    }

}
