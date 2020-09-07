package ejercicio.pkg2;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables
        int dia, mes;

        //Ingreso de datos
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia del mes [numerico]:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes del año [numerico]: "));

        //Proceso de datos y muestro
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                JOptionPane.showMessageDialog(null, "La fecha ingresa es " + dia + "/" + mes + ". La fecha es correcta");
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30) {
                JOptionPane.showMessageDialog(null, "La fecha ingresa es " + dia + "/" + mes + ". La fecha es correcta");
            } else if (dia <= 28 && mes == 2) {
                JOptionPane.showMessageDialog(null, "La fecha ingresa es " + dia + "/" + mes + ". La fecha es correcta");
            } else{
                 JOptionPane.showMessageDialog(null, "La fecha ingresada no es correcta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es correcta");
        }
    }

}
