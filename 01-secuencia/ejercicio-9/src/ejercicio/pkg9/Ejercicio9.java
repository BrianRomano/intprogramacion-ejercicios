package ejercicio.pkg9;
import javax.swing.*; 

public class Ejercicio9 {

    public static void main(String[] args) {
        
        //Variables
        int m, s, h; 
        
        //Ingreso Datos
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de M:")); 
        s = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de S:")); 
        h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de H:")); 
        
        //Realizo Cuenta
        h = m*s+h; 
        s = h+m; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"H: "+h+"\nS: "+s+"\nM: "+m);
    }
    
}
