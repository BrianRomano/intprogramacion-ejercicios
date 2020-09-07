package ejercicio.pkg2;
import javax.swing.*; 

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Variables
        int n1, n2, n3, suma, multiplicacion; 
        
        //Ingreso de Datos
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));
        
        //Proceso de datos
        if(n1>n2){
            if(n1<n3){
                suma = n1+n2+n3; 
                JOptionPane.showMessageDialog(null,"La suma de los 3 numeros da como resultado "+suma);
            }
        }else{
            multiplicacion = n1*n2*n3;
            JOptionPane.showMessageDialog(null,"La multiplicacion de los 3 numeros da como resultado "+multiplicacion);
        }
    }
}
