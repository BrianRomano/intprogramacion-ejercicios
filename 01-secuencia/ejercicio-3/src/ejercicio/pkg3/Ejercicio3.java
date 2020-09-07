package ejercicio.pkg3;
import javax.swing.*; 

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        //Variables
        double precio, total; 
        int cantidad; 
        
        //Ingreso Datos
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo: ")); 
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos: ")); 
        
        //Realiza la cuenta
        total = precio * cantidad; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"El total es $"+ total);
    }
    
}
