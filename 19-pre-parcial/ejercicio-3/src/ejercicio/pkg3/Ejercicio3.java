package ejercicio.pkg3;

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Variables y Arrays
        int i, cantidadOyentes, pP, sP, tP, max = 0, min = 999999, masVotado = 0, menosVotado = 0, mayor20 = 0;
        int[] cancion = new int[10];

        //Ingreso cantidad de oyentes
        cantidadOyentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de oyentes: "));

        //Proceso
        for (i = 0; i < cantidadOyentes; i++) {
            //Ingreso de datos
            pP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de 0 al 9, la primer canción: "));
            sP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de 0 al 9, la segunda canción: "));
            tP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de 0 al 9, la tercer canción: "));

            //Mostrar datos ingresados: 
            System.out.println((i + 1) + "- Oyente, eligio como primer cancion: " + pP);
            System.out.println((i + 1) + "- Oyente, eligio como segunda cancion: " + sP);
            System.out.println((i + 1) + "- Oyente, eligio como tercer cancion: " + tP);

            //Guardar puntos por canción:
            cancion[pP] += 3;
            cancion[sP] += 2;
            cancion[tP] += 1;
        }

        //Recorrer Array
        for (i = 0; i < cancion.length; i++) {
            if (cancion[i] > max) {
                max = cancion[i];
                masVotado = i;
            }
            if (cancion[i] < min) {
                min = cancion[i];
                menosVotado = i;
            }
            if (cancion[i] > 20) {
                mayor20++;
            }
        }

        //Mostrar
        JOptionPane.showMessageDialog(null, "Canción más votada: " + masVotado + "\nCanción menos votada: " + menosVotado + "\nCanción con más de 20 puntos: " + mayor20);
    }

}
