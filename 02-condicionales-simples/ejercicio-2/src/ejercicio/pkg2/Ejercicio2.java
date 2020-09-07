package ejercicio.pkg2;
import javax.swing.*; 

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Variables
        String categoria; 
        double sueldo, incrementoA, incrementoB; 
        
        //Ingreso Datos
        categoria = JOptionPane.showInputDialog("Ingrese su categoria [A - B]: "); 
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo: ")); 
        
        //Proceso Datos y Muestro
        if(categoria.equalsIgnoreCase("A")){
            incrementoA = sueldo*0.02; 
            sueldo = sueldo + incrementoA; 
            JOptionPane.showMessageDialog(null,"Su sueldo es de $"+sueldo);
        }else{
            incrementoB = sueldo*0.05; 
            sueldo = sueldo+incrementoB; 
            JOptionPane.showMessageDialog(null,"Su sueldo es de $"+sueldo);
        }
    }
    
}
