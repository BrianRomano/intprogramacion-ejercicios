package ejercicio.pkg7;
import javax.swing.*; 

public class Ejercicio7 {

    public static void main(String[] args) {
        
        //Variables
        double lado, perimetro, area; 
        
        //Ingreso Datos
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado: ")); 
        
        //Realizo Cuentas
        perimetro = lado*4; 
        area = lado*lado; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"El perimetro es "+perimetro+"\nEl area es "+area);
    }
    
}
