package ejercicio.pkg3;

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Variables
        int categoria, horas, horasExtras;
        double precioHora = 0, precioHoraExtra = 0, descuento, total, totalDescuento;

        //Ingreso de Datos
        categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su categoria [1 - 2 - 3]"));
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de horas trabajadas:"));
        horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras trabajadas"));

        //Selector
        switch (categoria) {
            case 1:
                precioHora = 14;
                precioHoraExtra = 20.50;
                break;
            case 2:
                precioHora = 17;
                precioHoraExtra = 24;
                break;
            case 3:
                precioHora = 21;
                precioHoraExtra = 34;
                break;
            default:
                JOptionPane.showMessageDialog(null, "La categoria ingresada es incorrecta");
                break;
        }

        //Proceso de datos
        if (horasExtras > 30) {
            descuento = precioHoraExtra * 0.7;
            totalDescuento = precioHoraExtra - descuento;
            total = horas * precioHora + horasExtras * totalDescuento;
        } else{
            total = horas * precioHora + horasExtras * precioHoraExtra;
        }
        
        //Muestro datos
        JOptionPane.showMessageDialog(null,"Su sueldo será de $"+total);
    }

}
