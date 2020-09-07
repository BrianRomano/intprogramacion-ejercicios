package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        double sueldo, aumento = 0.0;
        String categoria;

        //Ingreso de Datos
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo: "));
        categoria = JOptionPane.showInputDialog("Ingrese su categoria [A-B-C-D-E]");

        //Proceso de Datos
        if (categoria.equalsIgnoreCase("A") || categoria.equalsIgnoreCase("C")) {
            aumento = sueldo * 0.15;
        } else if (categoria.equalsIgnoreCase("B") || categoria.equalsIgnoreCase("D")) {
            aumento = sueldo * 0.10;
        } else if (categoria.equalsIgnoreCase("E")) {
            aumento = sueldo * 0.05;
        }else{
            JOptionPane.showMessageDialog(null,"La categoria ingresada no existe");
        }
        
        sueldo = aumento + sueldo;
        
        //Mostrar
        JOptionPane.showMessageDialog(null, "Su aumento sera de $" + aumento + "\nAhora su sueldo es de $" + sueldo);
    }

}
