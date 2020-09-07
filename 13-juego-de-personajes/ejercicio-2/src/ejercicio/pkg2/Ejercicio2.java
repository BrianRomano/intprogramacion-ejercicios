package ejercicio.pkg2;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables
        String pregunta1, pregunta2, pregunta3;

        //Ingreso de Datos
        JOptionPane.showMessageDialog(null, "***Elija un personaje***\n-Susana Gimenez\n-Lilita Carrio\n-Diego Maradona\n-Carlos Menem\n-Domingo Sarmiento");

        //Proceso de Datos y Muestro
        pregunta1 = JOptionPane.showInputDialog("Responda [SI o NO]\n¿Esta vivo?");
        if (pregunta1.equalsIgnoreCase("Si")) {
            pregunta2 = JOptionPane.showInputDialog("Responda [SI o NO]\n¿Es mujer?");
            pregunta3 = JOptionPane.showInputDialog("Responda [SI o NO]\n¿Es politico?");
            if (pregunta2.equalsIgnoreCase("Si") && pregunta3.equalsIgnoreCase("Si")) {
                JOptionPane.showMessageDialog(null, "El personaje elegido es Lilita Carrio");
            } else if (pregunta2.equalsIgnoreCase("Si") && pregunta3.equalsIgnoreCase("No")) {
                JOptionPane.showMessageDialog(null, "El personaje elegido es Susana Gimenez");
            } else if (pregunta2.equalsIgnoreCase("No") && pregunta3.equalsIgnoreCase("No")) {
                JOptionPane.showMessageDialog(null, "El personaje elegido es Diego Maradona");
            } else if (pregunta2.equalsIgnoreCase("No") && pregunta3.equalsIgnoreCase("Si")) {
                JOptionPane.showMessageDialog(null, "El personaje elegido es Carlos Menem");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El personaje elegido es Domingo Sarmiento");
        }

    }

}
