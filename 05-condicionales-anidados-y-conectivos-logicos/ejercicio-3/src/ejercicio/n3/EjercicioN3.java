package ejercicio.n3;

import javax.swing.*;

public class EjercicioN3 {

    public static void main(String[] args) {

        //Variables
        int n1, n2, n3;

        //Ingreso Datos
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));

        //Proceso de datos y muestro
        if (n1 >= n2 && n1 >= n3) {
            if (n2 >= n3) {
                JOptionPane.showMessageDialog(null, n1 + "-" + n2 + "-" + n3);
            } else {
                JOptionPane.showMessageDialog(null, n1 + "-" + n3 + "-" + n2);
            }
        } else {
            if (n2 >= n1 && n2 >= n3) {
                if (n1 >= n3) {
                    JOptionPane.showMessageDialog(null, n2 + "-" + n1 + "-" + n3);
                } else {
                    JOptionPane.showMessageDialog(null, n2 + "-" + n3 + "-" + n1);
                }
            } else {
                if (n3 >= n1 && n3 >= n2) {
                    if (n1 >= n2) {
                        JOptionPane.showMessageDialog(null, n3 + "-" + n1 + "-" + n2);
                    } else {
                        JOptionPane.showMessageDialog(null, n3 + "-" + n2 + "-" + n1);
                    }
                }
            }
        }
    }

}
