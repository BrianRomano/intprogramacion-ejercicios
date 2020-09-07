package ejercicio.pkg5;

import javax.swing.*;
import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Variables y Arrays
        int i, k, numGanador = 0, numPerdedor = 0;
        int[] participante = new int[12];
        double distancia = 0, min = 999999, max = 0, promGanador = 0;
        double[] promedio = new double[12];
        double[] salto = new double[5];

        //Iniciar random
        Random rnd = new Random();

        //Proceso de datos
        for (i = 0; i < 12; i++) {
            //Numero de participante
            participante[i] = rnd.nextInt(100);
            for (k = 0; k < 5; k++) {
                //Distancia de salto y promedio
                salto[k] = rnd.nextInt(10);
                if (k == 0) {
                    distancia = 0;
                    distancia += salto[k];
                    promedio[i] = distancia / 5;
                } else {
                    distancia += salto[k];
                    promedio[i] = distancia / 5;
                }

                //Mostrar 
                System.out.println((i + 1) + ".Participante: " + participante[i] + " | Salto " + (k + 1) + ": " + salto[k]
                        + " | Promedio: " + promedio[i]);
            }
        }

        //Recorrer Array 
        for (i = 0; i < participante.length; i++) {
            if (promedio[i] > max) {
                max = promedio[i];
                promGanador = i;
                numGanador = participante[i];
            } else if (promedio[i] < min) {
                min = promedio[i];
                numPerdedor = participante[i];
            }
        }

        //Mostrar
        JOptionPane.showMessageDialog(null, "El ganador es el " + numGanador + " con un promedio de: " + promGanador
                + "\nEl peor fue el " + numPerdedor);
    }
}
