package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int cartaUno, cartaDos, cartaTres, cartaExtra;

        //Ingreso de datos
        cartaUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la primer carta: "));
        cartaDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la segunda carta: "));
        cartaTres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la tercer carta: "));

        //Proceso de datos y muestro
        if (cartaUno >= 0 && cartaUno <= 9 && cartaDos >= 0 && cartaDos <= 9 && cartaTres >= 0 && cartaTres <= 9) {
            if (cartaUno + cartaDos + cartaTres == 3) {
                JOptionPane.showMessageDialog(null, "Gana la apuesta y $500");
            } else if (cartaUno == 1 && cartaDos == 1 && cartaTres != 1 || cartaUno == 1 && cartaDos != 1 && cartaTres == 1 || cartaUno != 1 && cartaDos == 1 && cartaTres == 1) {
                cartaExtra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la nueva carta: "));
                if (cartaExtra >= 0 && cartaExtra <= 9) {
                    if (cartaExtra == 1) {
                        JOptionPane.showMessageDialog(null, "Gana la apuesta y $150");
                    } else {
                        JOptionPane.showMessageDialog(null, "Gana la apuesta y $20");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
                }
            } else if (cartaUno == cartaDos && cartaDos == cartaTres) {
                JOptionPane.showMessageDialog(null, "Gana la apuesta y $50");
            } else if (cartaUno + cartaDos + cartaTres == 1) {
                JOptionPane.showMessageDialog(null, "Gana la apuesta y $10");
            }else{
                JOptionPane.showMessageDialog(null, "Pierde la apuesta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
        }

    }

}
