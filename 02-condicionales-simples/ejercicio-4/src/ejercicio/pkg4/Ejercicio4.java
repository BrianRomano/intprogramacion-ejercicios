package ejercicio.pkg4;
import javax.swing.*; 

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //Variables
        int tipoVenta;
        double totalVenta, descuento;  
        
        //Ingreso Datos
        totalVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de la venta: ")); 
        tipoVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el metodo de pago:\n1-Contado\n2-Debito/Credito")); 
        
        //Proceso y Muestro
        if(tipoVenta == 1){
            descuento = totalVenta*0.10; 
            totalVenta = totalVenta-descuento; 
        } 
        JOptionPane.showMessageDialog(null,"El total es $: "+totalVenta);
    } 
    
}
