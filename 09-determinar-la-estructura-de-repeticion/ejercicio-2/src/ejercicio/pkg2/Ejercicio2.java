package ejercicio.pkg2;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables
        int i, tiempo;
        double dinero, interes, acumulador, total = 0;

        //Ingreso de datos
        dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dinero a invertir: "));
        interes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes: "));
        tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en meses: "));

        //Proceso
        for (i = 0; i < tiempo; i++) {
            acumulador = ((dinero * interes) / 365) * 30;
            total += acumulador;
        }
        
        //Mostrar
        JOptionPane.showMessageDialog(null, "En " + tiempo + " meses, tendrá una ganancia de $" + total);
    }

}
