package ejercicio.pkg3;

import javax.swing.*;
import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Variables
        int i, primerRango=0, segundoRango=0, tercerRango=0,cuartoRango=0, numeros;

        //Funcion numeros random
        Random rnd = new Random();

        //Proceso de datos
        for (i = 0; i < 100; i++) {
            numeros = rnd.nextInt(101);
            System.out.println(i+"- numero generado: "+numeros);
            
            if(numeros >= 0 && numeros < 25){
                primerRango++; 
            } else if (numeros >= 25 && numeros < 50){
                segundoRango++;
            }else if(numeros >= 50 && numeros < 75){
                tercerRango++;
            } else if (numeros >= 75 && numeros <= 100){
                cuartoRango++;
            }
        }
        JOptionPane.showMessageDialog(null,"Numeros de 0 a 25: "+primerRango+"\nNumeros de 25 a 50: "+segundoRango+"\nNumeros de 50 a 75: "+tercerRango+"\nNumeros de 75 a 100: "+cuartoRango);
    }

}
