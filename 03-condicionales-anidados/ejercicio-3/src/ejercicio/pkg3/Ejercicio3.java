package ejercicio.pkg3;

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Variables
        int n1, n2, n3, mayor = 0;

        //Ingreso de Datos 
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));

        //Proceso de Datos
        if (n1 >= n2) {
            if(n1>=n3){
                mayor = n1;
            } else {
                mayor = n3; 
            }
        } else {
            if(n2>=n1){
                if(n2>=n3){
                    mayor = n2; 
                } else{
                    mayor = n3;
                }
            }
        }
        
        //Muestro
        JOptionPane.showMessageDialog(null,"El numero mayor es "+mayor);
    }

}
