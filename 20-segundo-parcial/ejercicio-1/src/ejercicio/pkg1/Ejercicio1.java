package ejercicio.pkg1;

//Librerias
import javax.swing.*;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables y Arrays
        int i, menor10 = 0, mayor10 = 0, numeroGanador = 0;
        double cartaUno, cartaDos, min = 999999, max = 0, puntajeMayor = 0, puntajeMenor = 0;
        double[] sumaCartas = new double[6];

        //Numero Random
        Random rnd = new Random();

        //Proceso
        for (i = 0; i < 6; i++) {
            cartaUno = rnd.nextInt(12) + 1;
            cartaDos = rnd.nextInt(12) + 1;
            //Condición segun valores obtenidos
            if (cartaUno >= 10) {
                cartaUno += 0.50;
            }
            if (cartaDos >= 10) {
                cartaDos += 0.50;
            }
            //Suma de valores de ambar cartas
            sumaCartas[i] = cartaUno + cartaDos;
            System.out.println((i + 1) + "- Jugador:" + sumaCartas[i]);
        }

        //Recorrer aray
        for (i = 0; i < sumaCartas.length; i++) {
            if (sumaCartas[i] <= 10) {
                menor10++;
            } else {
                mayor10++;
            }
            if (sumaCartas[i] > max) {
                max = sumaCartas[i];
                numeroGanador = i + 1;
                puntajeMayor = sumaCartas[i];
            } else if (sumaCartas[i] < min) {
                min = sumaCartas[i];
                puntajeMenor = sumaCartas[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El ganador es el jugador: " + numeroGanador + "\nPuntaje más alto: " + puntajeMayor + "\nJugadores con puntaje menor a 10:  " + menor10
                + "\nJugadores con puntaje mayor a 10: " + mayor10 + "\nPuntaje más bajo: " + puntajeMenor);
    }
}
