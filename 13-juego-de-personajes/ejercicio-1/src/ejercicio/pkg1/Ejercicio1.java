package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int categoria, antiguedad;
        double aumento = 0, nuevoSueldo = 0;

        //Ingreso de Datos
        categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su categoria [1-2-3-4]: "));
        antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus años de antiguedad: "));

        //Proceso de Datos
        if (categoria == 1) {
            aumento = (30000 * 0.02) * antiguedad;
            nuevoSueldo = 30000 + aumento;
        } else if (categoria == 2) {
            aumento = (40000 * 0.02) * antiguedad;
            nuevoSueldo = 40000 + aumento;
        } else if (categoria == 3) {
            aumento = (50000 * 0.02) * antiguedad;
            nuevoSueldo = 50000 + aumento;
        } else if (categoria == 4) {
            aumento = (60000 * 0.02) * antiguedad;
            nuevoSueldo = 60000 + aumento;
        } else {
            JOptionPane.showMessageDialog(null, "La categoria ingresada no existe");
        }
        JOptionPane.showMessageDialog(null, "Su aumento sera de $" + aumento + "y su nuevo sueldo de $" + nuevoSueldo);

    }

}
