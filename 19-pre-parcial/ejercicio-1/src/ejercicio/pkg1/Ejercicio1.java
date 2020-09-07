package ejercicio.pkg1;

import java.util.*;
import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int numeroRandom, numeroIngresado, posibilidades = 0;
        Random rnd = new Random();
        numeroRandom = rnd.nextInt(100) + 1;

        do {
            numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 - 100"));

            //Verifico
            if (numeroIngresado > numeroRandom) {
                JOptionPane.showMessageDialog(null, "El número es menor");
            } else {
                JOptionPane.showMessageDialog(null, "El número es mayor");
            }

            posibilidades++;

        } while (numeroIngresado != numeroRandom && posibilidades < 5);

        //Mostrar 
        if (numeroIngresado == numeroRandom) {
            JOptionPane.showMessageDialog(null, "Ganaste, el número era: " + numeroRandom);
        } else {
            JOptionPane.showMessageDialog(null, "Perdiste, el número era: " + numeroRandom);
        }
    }

}
