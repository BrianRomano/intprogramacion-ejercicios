package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables 
        int ventasTarjeta = 0;
        double valor, montoEfectivo = 0, montoTarjeta = 0, ventaMax = 0, total = 0;
        String nombreVendedor, nombreVentaMax = "", tipoPago, salir = "";

        //Proceso
        do {
            //Ingreso de datos
            nombreVendedor = JOptionPane.showInputDialog("Ingrese el nombre del vendedor: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lo que llevara: "));
            tipoPago = JOptionPane.showInputDialog("-Para pago con tarjeta ingrese [T]:\n-Para pago con efectivo ingrese [E]:");

            //Venta mayor
            if (valor >= ventaMax) {
                ventaMax = valor;
                nombreVentaMax = nombreVendedor;
            }

            //Categorizo segun tipo de pago
            if (tipoPago.equalsIgnoreCase("T")) {
                ventasTarjeta++;
                montoTarjeta += valor;
            } else if (tipoPago.equalsIgnoreCase("E")) {
                montoEfectivo += valor;
            }

            //Opcion Salir del bucle
            salir = JOptionPane.showInputDialog("Si desea salir, ingrese: S");
        } while (!salir.equalsIgnoreCase("S"));

        //Proceso de datos ingresados
        total = montoTarjeta + montoEfectivo;

        //Mostrar datos
        JOptionPane.showMessageDialog(null, "Cantidad de ventas con Tarjeta: " + ventasTarjeta + "\nTotal ventas con Tarjeta: $" + montoTarjeta + "\n"
                + "Total ventas en Efectivo: $" + montoEfectivo + "\nTotal monto de Efectivo + Tarjeta: $" + total + "\nVenta Maxima: $" + ventaMax + "\n"
                + "Nombre de vendedor que realizo la venta maxima: " + nombreVentaMax);
    }

}
