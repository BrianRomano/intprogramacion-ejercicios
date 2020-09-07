package ejericio.pkg4;

import javax.swing.*;

public class Ejericio4 {

    public static void main(String[] args) {

        //Variables y Arrays
        int i, masVendido = 0, menosVendido = 0;
        double max = 0, min = 999999, totalNafta = 0, totalDiesel = 0;
        double[] surtidores = new double[4];
        double[] stock = new double[4];

        //Proceso - Ingreso de venta
        for (i = 0; i < surtidores.length; i++) {
            surtidores[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad vendida del surtidor " + i + " :"));
            System.out.println("Surtidor " + i + " - Cantidad vendida: " + surtidores[i]);

            //Contabilizar consumo de Nafta y Diesel
            switch (i) {
                case 0:
                case 1:
                    totalNafta += surtidores[i];
                    break;
                default:
                    totalDiesel += surtidores[i];
            }

            //Contabilizar el stock 
            stock[i] = 5000 - surtidores[i];
        }

        //Mostrar - Stock 
        for (i = 0; i < stock.length; i++) {
            System.out.println("Surtidor " + i + " - Stock: " + stock[i]);
        }

        //Recorrer Array - Surtidores
        for (i = 0; i < surtidores.length; i++) {
            if (surtidores[i] > max) {
                max = surtidores[i];
                masVendido = i;
            } else if (surtidores[i] < min) {
                min = surtidores[i];
                menosVendido = i;
            }
        }

        //Mostrar - Final
        JOptionPane.showMessageDialog(null, "El combustible más vendido es: " + masVendido + "\nEl combustible menos vendido es: " + menosVendido);

        if (totalNafta > totalDiesel) {
            JOptionPane.showMessageDialog(null, "La nafta es más consumida por encima del Diesel");
        } else {
            JOptionPane.showMessageDialog(null, "El diesel es más consumido por encima de la Nafta");
        }
    }
}
