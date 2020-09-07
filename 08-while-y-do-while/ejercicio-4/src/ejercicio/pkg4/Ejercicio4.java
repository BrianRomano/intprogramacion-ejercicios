package ejercicio.pkg4;

import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Variables
        int facturas = 0;
        double monto = 0, consumo = 0, registroInicial, registroFinal, medidor;
        String nombre, tipoCliente, direccion;

        //Proceso de datos
        do {
            //Ingreso de datos para factura
            nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            tipoCliente = JOptionPane.showInputDialog("Ingrese el tipo de cliente [A]-[B]-[C]-[D]: ");
            direccion = JOptionPane.showInputDialog("Ingrese la dirección: ");
            registroInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el registro inicial: "));
            registroFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el registro final: "));

            //Calculo de registro de medidor
            medidor = registroFinal - registroInicial;

            //Muestro nombre y direccion en consola
            System.out.println("Nombre: " + nombre);
            System.out.println("Dirección: " + direccion);

            //Categorizo por tipo de cliente
            if (tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("C")) {
                if (medidor <= 140) {
                    facturas++;
                    monto += 3.20;
                    consumo += medidor;
                } else if (medidor > 140 && medidor <= 300) {
                    facturas++;
                    monto += 4.0;
                    consumo += medidor;
                } else if (medidor > 300) {
                    facturas++;
                    monto += 4.5;
                    consumo += medidor;
                }
            } else if (tipoCliente.equalsIgnoreCase("B") || tipoCliente.equalsIgnoreCase("D")) {
                if (medidor <= 200) {
                    facturas++;
                    monto += 4.5;
                    consumo += medidor;
                } else if (medidor > 200) {
                    facturas++;
                    monto += 5.3;
                    consumo += medidor;
                }
            }
            nombre = JOptionPane.showInputDialog("-Si desea salir ingrese *\n-Si desea ingresar más datos pulse otra tecla");
        } while (!"*".equals(nombre));

        //Mostrar datos
        JOptionPane.showMessageDialog(null, "Total de facturas: " + facturas + "\nTotal monto facturado: $" + monto + "\nTotal consumo: " + consumo + " Kv/h");
    }

}
