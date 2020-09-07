package ejercicio.pkg6;

import javax.swing.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        //Variables
        int totalAlumnos, alumnas = 0, alumnasAptas = 0, alumnos = 0, alumnosAptos = 0;
        double peso, altura, porcentajeAptas, porcentajeAptos;
        String sexo, registro;

        //Proceso de datos
        do {
            //Ingreso datos del estudiante
            sexo = JOptionPane.showInputDialog("Ingrese el sexo del alumno [F]-[M]");
            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del alumno en kg: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del alumno en metros: "));

            //Categorizo 
            if (sexo.equalsIgnoreCase("F")) {
                if (altura >= 1.73 && peso >= 55 && peso <= 83) {
                    alumnasAptas++;
                }
                alumnas++;
            } else if (sexo.equalsIgnoreCase("M")) {
                if (altura >= 1.83 && peso >= 73 && peso <= 105) {
                    alumnosAptos++;
                }
                alumnos++;
            }

            //Muestro en consola cantidad de alumnas y alumnos
            System.out.println("Alumnos: " + alumnos + " - Alumnas: " + alumnas);

            //Consulta de salida o nueva entrada de datos
            registro = JOptionPane.showInputDialog("¿Ingresa otro registro?");
        } while (registro.equalsIgnoreCase("Si"));

        //Proceso datos previamente ingresados
        totalAlumnos = alumnos + alumnas;
        porcentajeAptas = alumnasAptas * 100 / alumnas;
        porcentajeAptos = alumnosAptos * 100 / alumnos;

        //Mostrar datos
        JOptionPane.showMessageDialog(null, "Alumnos: " + alumnos + "\nAlumnos aptos: " + alumnosAptos + "\nPorcentaje de alumnos aptos: %"
                + porcentajeAptos + "\nAlumnas: " + alumnas + "\nAlumnas aptas: " + alumnasAptas + "\nPorcentaje de alumnas aptas: %"
                + porcentajeAptas + "\nTotal de alumnos: " + totalAlumnos);
    }

}
