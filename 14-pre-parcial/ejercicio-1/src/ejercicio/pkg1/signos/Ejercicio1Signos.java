package ejercicio.pkg1.signos;

import javax.swing.*;

public class Ejercicio1Signos {

    public static void main(String[] args) {

        //Variables
        int dia, mes;

        //Ingreso de Datos
        dia = Integer.parseInt(JOptionPane.showInputDialog("[En formato numerico]- Ingrese el dia de su nacimiento: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("[En formato numerico]- Ingrese el mes de su nacimiento: "));

        //Proceso de Datos
        if (mes == 1 && dia >= 21 && dia <= 31 || mes == 2 && dia >= 1 && dia <= 18) {
            JOptionPane.showMessageDialog(null,"Su signo es Acuario");
        } else if (mes == 2 && dia >= 19 && dia <= 29 || mes == 3 && dia >= 1 && dia <= 20){
             JOptionPane.showMessageDialog(null,"Su signo es Piscis");
        } else if (mes == 3 && dia >= 21 && dia <= 31 || mes == 4 && dia >= 1 && dia <= 20) {
             JOptionPane.showMessageDialog(null,"Su signo es Aries");
        } else if (mes == 4 && dia >= 21 && dia <= 30 || mes == 5 && dia >= 1 && dia <= 21) {
             JOptionPane.showMessageDialog(null,"Su signo es Tauro");
        } else if (mes == 5 && dia >= 22 && dia <= 31 || mes == 6 && dia >= 1 && dia <= 21) {
             JOptionPane.showMessageDialog(null,"Su signo es Geminis");
        } else if (mes == 6 && dia >= 22 && dia <= 30 || mes == 7 && dia >= 1 && dia <= 22) {
             JOptionPane.showMessageDialog(null,"Su signo es Cancer");
        } else if (mes == 7 && dia >= 23 && dia <= 31 || mes == 8 && dia >= 1 && dia <= 23) {
            JOptionPane.showMessageDialog(null,"Su signo es Leo");
        } else if (mes == 8 && dia >= 24 && dia <= 31 || mes == 9 && dia >= 1 && dia <= 23) {
            JOptionPane.showMessageDialog(null,"Su signo es Virgo");
        } else if (mes == 9 && dia >= 24 && dia <= 30 || mes == 10 && dia >= 1 && dia <= 23) {
            JOptionPane.showMessageDialog(null,"Su signo es Libra");
        } else if (mes == 10 && dia >= 24 && dia <= 31 || mes == 11 && dia >= 1 && dia <= 22) {
            JOptionPane.showMessageDialog(null,"Su signo es Escorpio");
        } else if (mes == 11 && dia >= 23 && dia <= 30 || mes == 12 && dia >= 1 && dia <= 21) {
            JOptionPane.showMessageDialog(null,"Su signo es Sagitario");
        } else if (mes == 12 && dia >= 22 && dia <= 31 || mes == 1 && dia >= 1 && dia <= 20) {
             JOptionPane.showMessageDialog(null,"Su signo es Capricornio");
        } else {
             JOptionPane.showMessageDialog(null,"La fecha ingresada no existe");
        }
    }

}
