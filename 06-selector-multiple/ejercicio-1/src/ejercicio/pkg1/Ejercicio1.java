package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int operacion;
        double n1, n2, suma, resta, multiplicacion, division;

        //Ingreso de datos
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        operacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de operación que desea realizar:\n1-Suma\n2-Resta\n3-Multiplicación\n4-División"));

        //Selector
        switch (operacion) {
            case 1:
                suma = n1 + n2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
                break;
            case 2:
                resta = n1 + n2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
                break;
            case 3:
                multiplicacion = n1 * n2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + multiplicacion);
                break;
            case 4:
                if (n2 != 0) {
                    division = n1 / n2;
                    JOptionPane.showMessageDialog(null, "El resultado de la division es: " + division);
                } else {
                    JOptionPane.showMessageDialog(null, "Operación incorrecta");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación incorrecta");
                break;
        }

    }

}
