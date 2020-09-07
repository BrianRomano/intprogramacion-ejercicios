package ejercicio.pkg5;

import javax.swing.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Variables
        String producto;
        int tipoProducto, cantidad = 0;
        double precio = 0, descuento, totalDescuento, total;

        //Ingreso Datos
        producto = JOptionPane.showInputDialog("Ingrese el producto a llevar [A - B]");

        //Proceso Datos
        if (producto.equalsIgnoreCase("A")) {
            tipoProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de producto que llevara:\n1-Otoño\n2-Primavera\n3-Marino"));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a llevar:"));
            switch (tipoProducto) {
                case 1:
                    precio = 1.50;
                    break;
                case 2:
                    precio = 1.55;
                    break;
                case 3:
                    precio = 1.60;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El tipo de producto ingresado no existe");
                    break;
            }
        } else if (producto.equalsIgnoreCase("B")) {
            tipoProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de producto que llevara:\n1-Grande\n2-Mediano\n3-Pequeño"));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a llevar:"));
            switch (tipoProducto) {
                case 1:
                    precio = 2.05;
                    break;
                case 2:
                    precio = 1.60;
                    break;
                case 3:
                    precio = 1.10;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El tipo de producto ingresado no existe");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
        }
        total = precio * cantidad;

        //Proceso descuento y muestro o solo muestro
        if (total > 100) {
            descuento = total * 0.10;
            totalDescuento = total - descuento;
            JOptionPane.showMessageDialog(null, "El precio total es $" + totalDescuento);
        } else {
            JOptionPane.showMessageDialog(null, "El precio total es $" + total);
        }
    }

}
