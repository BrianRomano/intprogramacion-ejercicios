package ejercicio.pkg2;
import javax.swing.*; 

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Variables
        double n1, n2, n3, n4, suma, promedio; 
        
        //Ingresan Datos
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: ")); 
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: ")); 
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero: ")); 
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: ")); 
        
        //Realiza suma y promedio
        suma = n1+n2+n3+n4; 
        promedio = suma / 4; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"La suma es: "+ suma +"\nEl promedio de la suma es: "+ promedio);
        
    }
    
}
