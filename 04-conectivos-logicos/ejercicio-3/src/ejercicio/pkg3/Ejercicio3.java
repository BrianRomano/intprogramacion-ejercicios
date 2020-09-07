package ejercicio.pkg3;
import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Variables
        double n1, n2, division;
        
        //Ingreso Datos
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: ")); 
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: ")); 
        
        //Proceso Datos
        if(n1>n2 && n2!=0){
            division = n1/n2; 
            JOptionPane.showMessageDialog(null,"La division de ambos numeros da como resultado: "+division);
        }else if(n1<n2){
            JOptionPane.showMessageDialog(null,"El segundo numero ingresado es mayor");
        }else{
            JOptionPane.showMessageDialog(null,"No es posible dividir por cero");
        }
    }
    
}
