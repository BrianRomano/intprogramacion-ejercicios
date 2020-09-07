package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int i;
        double sueldo, total = 0;

        //Ingreso y repito ingreso de datos
        for (i = 0; i < 10; i++) {
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo: "));
            total = total + sueldo;
        }
        
        //Muestro
        JOptionPane.showMessageDialog(null,"El sueldo total de todos los empleados es: $"+total);
    }

}
