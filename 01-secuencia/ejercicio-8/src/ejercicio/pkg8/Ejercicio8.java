package ejercicio.pkg8;
import javax.swing.*; 

public class Ejercicio8 {

    public static void main(String[] args) {
        
        //Variables
        int cantidad; 
        double valorDolar, total; 
        
        //Ingreso Datos
        valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de dolar: ")); 
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: ")); 
        
        //Realiza cuenta
        total = valorDolar * cantidad; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"El total en pesos es $"+total);
    }
    
}
