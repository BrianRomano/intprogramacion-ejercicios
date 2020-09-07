package ejericio.pkg5;

import javax.swing.*;

public class Ejericio5 {

    public static void main(String[] args) {

        //Variables
        int i, cantidad, cantDesocupados = 0, rangoUno = 0, rangoDos = 0, rangoTres = 0, rangoCuatro = 0;
        double sueldo, totalSueldos = 0, sueldoMaximo = 0;
        String nombre, nombreMaximo = "";

        //Ingreso de datos
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));

        //Ingreso de datos II
        for (i = 1; i <= cantidad; i++) {

            //Ingreso datos del empleado
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo de " + nombre));

            //Se suma el sueldo al conteo total de sueldos
            totalSueldos += sueldo;

            //Se categoriza según sueldo
            if (sueldo <= 0) {
                cantDesocupados++;
            } else if (sueldo > 0 && sueldo <= 500) {
                rangoUno++;
            } else if (sueldo > 500 && sueldo <= 1000) {
                rangoDos++;
            } else if (sueldo > 1000 && sueldo <= 2000) {
                rangoTres++;
            } else if (sueldo > 2000) {
                rangoCuatro++;
            }

            //Se busca el mayor sueldo y su nombre
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
                nombreMaximo = nombre;
            }
        }

        //Muestro
        JOptionPane.showMessageDialog(null, "Cantidad de empleados: " + cantidad + "\nCantidad de desocupados: " + cantDesocupados
                + "\nEmpleados entre $0 y $500: " + rangoUno + "\nEmpleados entre $500 y $1000: " + rangoDos + "\nEmpleados entre $1000 y $2000: "
                + rangoTres + "\nEmpleados mayor a $2000: " + rangoCuatro + "\nEmpleado mejor pago: " + nombreMaximo + ", su sueldo es de $" + sueldoMaximo
                + "\nEl total de sueldos pagos es de $" + totalSueldos);
    }

}
