package ejercicio.pkg3;

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Variables
        int i;
        double[] tiempo = new double[10];
        double ultimoPuesto = 0, segundoPuesto = 999999, primerPuesto = 999999, tiempoTotal = 0, tiempoPromedio;

        //Proceso
        for (i = 0; i < 10; i++) {
            tiempo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tiempo del " + (i + 1) + "- corredor: "));
            System.out.println((i + 1) + "- Corredor, tiempo: " + tiempo[i]);

            //Categorizo
            if (tiempo[i] < primerPuesto) {
                primerPuesto = tiempo[i];
            } else if (tiempo[i] > ultimoPuesto) {
                ultimoPuesto = tiempo[i];
            } else if (tiempo[i] < segundoPuesto && tiempo[i] != primerPuesto) {
                segundoPuesto = tiempo[i];
            }

            //Contar total de tiempo en corredores
            tiempoTotal += tiempo[i];
        }
        tiempoPromedio = tiempoTotal / 10;

        //Mostrar
        JOptionPane.showMessageDialog(null, "1er puesto: " + primerPuesto + "\n2do puesto: " + segundoPuesto + "\n10mo puesto: " + ultimoPuesto
                + "\nTiempo promedio: " + tiempoPromedio);
    }

}
