package ejercicio.pkg4;

import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Variables
        int carrera, cuatrimestre;
        double promedio;
        String mensaje = "";

        //Ingreso de datos 
        carrera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la carrera elegida:\n1-Economia\n2-Informatica\n3-Agronomia\n4-Contabilidad\n5-Quimica\n6-Sistemas"));
        cuatrimestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su calificiación en el cuatrimestre:"));
        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su  promedio:"));

        //Selector y proceso de datos
        switch (carrera) {
            case 1:
            case 4:
                if (cuatrimestre > 0 && cuatrimestre <= 10 && promedio > 0 && promedio <= 10) {
                    if (cuatrimestre >= 6 && promedio > 9) {
                        mensaje = "Beca aceptada";
                    } else {
                        mensaje = "Beca denegada";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Datos ingresados, no validos");
                }
                break;
            case 2: 
            case 6: 
                if (cuatrimestre > 0 && cuatrimestre <= 10 && promedio > 0 && promedio <= 10) {
                    if (cuatrimestre > 6 && promedio > 9.2) {
                        mensaje = "Beca aceptada";
                    } else {
                        mensaje = "Beca denegada";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Datos ingresados, no validos");
                }
                break;
            case 3: 
            case 5: 
                if (cuatrimestre > 0 && cuatrimestre <= 10 && promedio > 0 && promedio <= 10) {
                    if (cuatrimestre > 5 && promedio > 8.8) {
                        mensaje = "Beca aceptada";
                    } else {
                        mensaje = "Beca denegada";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Datos ingresados, no validos");
                }
                break;
        }
        JOptionPane.showMessageDialog(null,""+mensaje);
    }

}
