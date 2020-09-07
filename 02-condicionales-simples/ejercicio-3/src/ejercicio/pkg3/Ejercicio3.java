package ejercicio.pkg3;
import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
    
        //Variable
        int cantidad; 
        double total, excedente; 
        
        //Ingreso Dato
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantiadad de m3 consumidos: ")); 
        
        //Proceso Datos y Muestro
        if(cantidad <= 150){
            total = 15.80;
        }else{
            excedente = (cantidad-150)*1.50; 
            total = 15.80 + excedente; 
        } JOptionPane.showMessageDialog(null,"El total a pagár es $"+total);
        
    }
    
}
