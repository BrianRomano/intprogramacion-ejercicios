package ejercicio.pkg6;

import javax.swing.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        //Variables
        int i, numero, cantidad, rango, min = 999999, max = 0;

        //Ingreso de datos
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a ingresar: "));

        //Ingreso de datos II 
        for (i = 1; i <= cantidad; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

            //Categorizo por numeros mayores y menores
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }
        //Saco el rango entre numero maximo y minimo
        rango = max - min;

        //Muestro
        JOptionPane.showMessageDialog(null, "Número mayor: " + max + "\nNúmero menor: " + min + "\nRango entre números: " + rango);
    }

}
