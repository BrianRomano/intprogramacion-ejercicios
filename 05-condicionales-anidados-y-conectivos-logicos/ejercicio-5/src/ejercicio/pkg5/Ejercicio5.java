package ejercicio.pkg5;

import javax.swing.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Variables
        double lado1, lado2, lado3;

        //Ingreso de Datos
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del primer lado: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del segundo lado: "));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del tercer lado: "));

        //Proceso de Datos y Muestro
        if (lado1 < lado3 && lado2 < lado3 && lado1 + lado2 > lado3) {
            if (lado1 == lado2 && lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo equilátero");
            } else if (lado1 != lado2 && lado2 != lado1 && lado3 != lado1) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo escaleno");
            } else if (lado1 == lado2 || lado2 == lado2 || lado1 == lado3) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo isósceles");
            }
        } else if (lado2 < lado1 && lado3 < lado1 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo equilátero");
            } else if (lado1 != lado2 && lado2 != lado1 && lado3 != lado1) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo escaleno");
            } else if (lado1 == lado2 || lado2 == lado2 || lado1 == lado3) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo isósceles");
            }
        } else if (lado3 < lado2 && lado1 < lado2 && lado3 + lado1 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo equilátero");
            } else if (lado1 != lado2 && lado2 != lado1 && lado3 != lado1) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo escaleno");
            } else if (lado1 == lado2 || lado2 == lado2 || lado1 == lado3) {
                JOptionPane.showMessageDialog(null, "Las medidas ingresadas corresponden a un triangulo isósceles");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Las medidas ingresadas no corresponden a un triangulo");
        }
    }

}
