package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        String categoria;
        double sueldo, aumentoSueldo;

        //Ingreso de Datos
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo: "));
        categoria = JOptionPane.showInputDialog("Ingrese su categoria [A-B-C]:");

        //Proceso Datos
        if (categoria.equalsIgnoreCase("A")) {
            aumentoSueldo = sueldo*0.15;
        }else{
            if(categoria.equalsIgnoreCase("B")){
                aumentoSueldo = sueldo*0.10; 
            }else{
                if(categoria.equalsIgnoreCase("C")){
                    aumentoSueldo = sueldo*0.05;
                }else{
                    aumentoSueldo = 0; 
                    JOptionPane.showMessageDialog(null, "La categoria ingresada no existe");
                }
            } 
        }
        //Muestro
        sueldo = sueldo+aumentoSueldo; 
        JOptionPane.showMessageDialog(null,"Su sueldo será de $"+sueldo);
    }
}
