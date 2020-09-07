package ejercicio.pkg1;
import javax.swing.*; 

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Variable
        double calificacion; 
        
        //Ingresar Dato
        calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su calificacion: ")); 
        
        //Proceso Dato y Muestro
        if(calificacion >= 4){
            JOptionPane.showMessageDialog(null,"Se encuentra aprobado");
        }else{
            JOptionPane.showMessageDialog(null,"Se encuentra desaprobado");
        }
    }
    
}
