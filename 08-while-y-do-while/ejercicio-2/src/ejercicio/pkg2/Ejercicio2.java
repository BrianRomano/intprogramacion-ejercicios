package ejercicio.pkg2;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables
        int primerNumero, segundoNumero;
        double promedio;
        String usuario;

        //Ingreso de datos  
        do {
            primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
            segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
            promedio = (primerNumero + segundoNumero) / 2;

            //Mostrar
            JOptionPane.showMessageDialog(null, "El promedio de ambos numeros es: " + promedio);
            usuario = JOptionPane.showInputDialog("-Si desea ingresar nuevos numeros, ingrese [SI]\n-Si desea salir, ingrese [NO]");
        } while (usuario.equalsIgnoreCase("Si"));

    }

}
