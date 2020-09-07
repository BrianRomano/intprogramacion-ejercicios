package ejercicio.pkg1;

import java.util.*;
import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int i, k;
        int[][] matriz = new int[3][4];
        Random rnd = new Random();

        //Completar la matriz 
        for (i = 0; i < matriz.length; i++) {
            for (k = 0; k <= matriz.length; k++) {
                matriz[i][k] = rnd.nextInt(100);
            }
        }

        //Mostrar la matriz entera 
        for (i = 0; i < matriz.length; i++) {
            for (k = 0; k <= matriz.length; k++) {
                System.out.println(matriz[i][k] + "");
            }
            System.out.println("--");
        }

        //Mostrar primer fila y primer columna
        for (i = 0; i < 1; i++) {
            for (k = 0; k <= 4; k++) {
                JOptionPane.showMessageDialog(null, "" + matriz[i][k]);
            }
        }
    }
}
