package ejercicio.pkg2;
import javax.swing.*; 

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Variables
        double precioEntrada, descuento, totalAbonar; 
        int categoria; 
        
        //Ingreso de Datos
        precioEntrada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la entrada: ")); 
        categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la categoria:\n1-Menor\n2-Activo\n3-Jubilado")); 
        
        //Proceso de Datos
        if(categoria==1 || categoria==3){
           descuento = precioEntrada*0.25; 
           totalAbonar= precioEntrada-descuento; 
        }else{
            totalAbonar= precioEntrada; 
        }
        
        //Mostrar
        JOptionPane.showMessageDialog(null,"El total a abonar es $"+totalAbonar);
    }
    
}
