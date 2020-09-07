package ejercicio.pkg1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Variables
        int cantidadEstudiantes, i, aprobados = 0, presentarTP = 0, rendirEscrito = 0, desaprobados = 0;
        double nota;

        //Ingreso de datos
        do {
            cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:"));
            for (i = 1; i <= cantidadEstudiantes; i++) {
                nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i));
                if (nota >= 0 && nota <= 10) {
                    if (nota > 4) {
                        aprobados++;
                    } else if (nota >= 7) {
                        presentarTP++;
                    } else if (nota < 7) {
                        rendirEscrito++;
                    } else if (nota <= 4) {
                        desaprobados++;
                    }
                } else {
                    System.out.println("Nota no valida");
                }
            }
            nota = Double.parseDouble(JOptionPane.showInputDialog("Si desea ingresar más notas ingrese numero positivo"
                    + "\nSi desea salir ingrese un valor negrativo"));
        } while (nota >= 0);

        //Mostrar
        JOptionPane.showMessageDialog(null, "Alumnos aprobados: " + aprobados + "\nAlumnos desaprobados: " + desaprobados
                + "\nDeben presentar TP: " + presentarTP + "\nDeben rendir escrito: " + rendirEscrito);
    }

}
