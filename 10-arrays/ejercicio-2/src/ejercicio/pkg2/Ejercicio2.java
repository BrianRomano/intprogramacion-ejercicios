package ejercicio.pkg2;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables
        int i;
        double notasA = 0, notasB = 0, promedioA, promedioB;
        double[] cursoA = new double[5];
        double[] cursoB = new double[5];

        //Proceso
        for (i = 0; i < 5; i++) {
            cursoA[i] = Double.parseDouble(JOptionPane.showInputDialog("Curso A - Nota " + (i + 1) + ":"));
            notasA += cursoA[i];
            System.out.println((i + 1) + "- nota - Curso A: " + cursoA[i]);

        }

        for (i = 0; i < 5; i++) {
            cursoB[i] = Double.parseDouble(JOptionPane.showInputDialog("Curso B - Nota " + (i + 1) + ":"));
            notasB += cursoB[i];
            System.out.println((i + 1) + "- nota - Curso B: " + cursoB[i]);
        }

        //Calculo de promedio de ambos cursos
        promedioA = notasA / 5;
        promedioB = notasB / 5;

        //Mostrar mejor promedio
        if (promedioA > promedioB) {
            JOptionPane.showMessageDialog(null, "El mejor promedio es del curso A con: " + promedioA);
        } else {
            JOptionPane.showMessageDialog(null, "El mejor promedio es del curso A con: " + promedioB);
        }

    }

}
