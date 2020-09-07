package ejercicio.pkg2;
import javax.swing.*;
import java.util.*; 

public class Ejercicio2 {

    public static void main(String[] args) {
    
        //Variables
        int i, numeros, ceros=0; 
        
        //Funcion numeros random
        Random rnd = new Random(); 
        
        //Proceso de datos
        for(i=0; i<20; i++){
            numeros = rnd.nextInt(101);
            System.out.println("Numero generado: "+numeros);
            //Cantidad de ceros
            if(numeros == 0){
                ceros++; 
            }
        }
        
        JOptionPane.showMessageDialog(null,"Cantidad de ceros: "+ceros);
        
        
        
    }
    
}
