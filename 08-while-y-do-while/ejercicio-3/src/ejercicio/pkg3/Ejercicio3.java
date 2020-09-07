package ejercicio.pkg3;

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Variables
        int i, partidos, ganados = 0, empatados = 0, perdidos = 0;
        String resultado;

        //Proceso de datos 
        do {
            partidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de partidos: "));
            for (i = 1; i <= partidos; i++) {
                resultado = JOptionPane.showInputDialog("Indique con las siglas [G]-[E]-[P] el resultado del " + i + "- Partido:");
                if (resultado.equalsIgnoreCase("G")) {
                    ganados++;
                } else if (resultado.equalsIgnoreCase("E")) {
                    empatados++;
                } else if (resultado.equalsIgnoreCase("P")) {
                    perdidos++;
                }
            }
            resultado = JOptionPane.showInputDialog("Si desea salir ingrese *, de lo contrario pulse otra tecla");
        } while (!"*".equals(resultado));

        JOptionPane.showMessageDialog(null, "Ganados: " + ganados + "\nEmpatados: " + empatados + "\nPerdidos: " + perdidos);

    }

}
