package ejercicio.pkg6;
import javax.swing.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        //Variables
        double n1, n2, rta; 
        
        //Ingreso Datos
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer numero: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo numero: "));
        
        //Proceso Datos y Muestro
        if(n2 != 0){
            rta = n1/n2; 
            JOptionPane.showMessageDialog(null,"La division de los numeros anteriormente ingresados es: "+rta);
        }else{
            JOptionPane.showMessageDialog(null,"No es posible dividir por 0");
        }
        
    }
    
}
