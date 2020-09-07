package ejercicio.pkg2;

import javax.swing.*;
import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables y Arrays
        int i;
        double bebidaMax = 0, bebidaCaMax = 0, max = 0, maxCA = 0, totalConsumidoSA = 0, totalConsumidoCA = 0;
        double[] litrosConsumidos = new double[5];

        //Proceso
        Random rnd = new Random();
        for (i = 0; i < 5; i++) {
            litrosConsumidos[i] = rnd.nextInt(1000);
            System.out.println(i + ": " + litrosConsumidos[i]);

            //Contabilizar litros consumidos s/Alcohol y c/Alcohol
            switch (i) {
                case 0:
                case 1:
                    totalConsumidoSA += litrosConsumidos[i];
                    break;
                default:
                    totalConsumidoCA += litrosConsumidos[i];
                    break;
            }
        }

        //Proceso 2 - La bebida más consumida
        for (i = 0; i < 5; i++) {
            //Bebida más consumida
            if (litrosConsumidos[i] > max) {
                max = litrosConsumidos[i];
                bebidaMax = i;
            }
            //Bebida con alcohol más consumida
            switch (i) {
                case 2:
                case 3:
                case 4:
                    if (litrosConsumidos[i] > maxCA) {
                        maxCA = litrosConsumidos[i];
                        bebidaCaMax = i;
                    }
                    break;
            }
        }

        //Mostrar
        JOptionPane.showMessageDialog(null, "Bebida más consumida: " + bebidaMax + "\nBebida con alcohol más consumida: " + bebidaCaMax + "\n"
                + "Total litros sin alcohol consumidos: " + totalConsumidoSA + "\nTotal litros con alcohol consumidos: " + totalConsumidoCA);

    }
}
