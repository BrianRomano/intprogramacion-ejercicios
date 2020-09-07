package ejercicio.pkg4;

import javax.swing.*;
import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Variables
        int i, k, cantidad, numero, numeroMayor = 0, numeroMenor = 9999999;

        //Funcion numeros Random
        Random rnd = new Random();

        //Ingreso de datos
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros:"));

        //Proceso de datos
        for (i = 1; i <= cantidad; i++) {
            numero = rnd.nextInt(101);
            System.out.println(i + "- Número:" + numero);
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        JOptionPane.showMessageDialog(null, "El numero menor es: " + numeroMenor);
    }
}
