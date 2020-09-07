package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        double distanciaIda, distanciaTotal, cantidadDias, descuento, precioKm = 3.70, totalAbonar;

        //Ingreso de Datos
        distanciaIda = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia en km de ida: "));
        distanciaTotal = distanciaIda * 2;
        cantidadDias = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dias de hospedaje: "));

        //Proceso de Datos
        if (distanciaTotal > 800 && cantidadDias > 7) {
            descuento = (distanciaTotal * precioKm) * 0.30;
            totalAbonar = (distanciaTotal * precioKm) - descuento;
        } else {
            totalAbonar = distanciaTotal * precioKm;
        }
        
        //Muestro
        JOptionPane.showMessageDialog(null, "El total a abonar es $" + totalAbonar);
    }
}
