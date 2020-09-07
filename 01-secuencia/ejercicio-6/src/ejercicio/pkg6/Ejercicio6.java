package ejercicio.pkg6;
import javax.swing.*; 

public class Ejercicio6 {

    public static void main(String[] args) {
        
        //Variables
        double venta, pago, vuelto; 
        
        //Ingreso Datos
        venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta: ")); 
        pago = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago recibido: ")); 
        
        //Realizo Resta
        vuelto = pago - venta; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"Su vuelto es de $"+vuelto);
    }
    
}
