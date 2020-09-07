package ejercicio.pkg5;

import javax.swing.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Variables
        int  totalEstudiantes, hombres = 0, mujeres = 0;
        double promedio, porcentajeFem, porcentajeMasc, mejorPromedioFem = 0, mejorPromedioMasc = 0;
        String sexo, matricula;

        //Proceso de datos
        do {
            //Ingreso de datos de estudiante
            sexo = JOptionPane.showInputDialog("Ingrese el sexo [M]-[F]: ");
            promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio: "));
            matricula = JOptionPane.showInputDialog("Ingrese el número de matricula: ");

            //Muestro el número de matricula en consola
            System.out.println("Matricula: " + matricula);

            //Proceso la información ingresada
            if (sexo.equalsIgnoreCase("M")) {
                if (promedio > mejorPromedioMasc) {
                    mejorPromedioMasc = promedio;
                }
                hombres++;
            } else if (sexo.equalsIgnoreCase("F")) {
                if (promedio > mejorPromedioFem) {
                    mejorPromedioFem = promedio;
                }
                mujeres++;
            }
            matricula = JOptionPane.showInputDialog("Si desea salir ingrese 0, de lo contrario ingrese otra tecla");
        } while (!"0".equals(matricula));
        
        //Proceso de total de datos
        totalEstudiantes = hombres + mujeres; 
        porcentajeMasc = hombres * 100 / totalEstudiantes; 
        porcentajeFem = mujeres * 100 / totalEstudiantes; 
        
        //Mostrar datos
        JOptionPane.showMessageDialog(null,"Porcentaje femenino: %"+porcentajeFem+"\nPorcentaje masculino: %"+porcentajeMasc+"\n"
                + "Mejor promedio femenino: "+mejorPromedioFem+"\nMejor primedio masculino: "+mejorPromedioMasc);
    }

}
