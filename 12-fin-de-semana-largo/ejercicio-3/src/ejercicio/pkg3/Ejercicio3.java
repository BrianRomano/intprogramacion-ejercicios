package ejercicio.pkg3;
import javax.swing.*; 

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Variables
        String nombre; 
        double sueldoBasico, obraSocial, jubilacion, sueldoNeto; 
        
        //Ingreso Datos
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: "); 
        sueldoBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo basico: ")); 
        
        //Proceso Datos
        jubilacion = sueldoBasico*0.11; 
        obraSocial = sueldoBasico*0.03; 
        sueldoNeto = sueldoBasico-jubilacion-obraSocial; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nSueldo Básico: "+sueldoBasico+"\nJubilación: "+jubilacion+"\nObra Social: "+obraSocial+"\nSueldo Neto: "+sueldoNeto);
    }
    
}
