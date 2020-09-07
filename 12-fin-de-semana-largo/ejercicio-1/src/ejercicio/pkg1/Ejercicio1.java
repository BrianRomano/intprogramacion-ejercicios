package ejercicio.pkg1;
import javax.swing.*; 

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Variables
        String nombre; 
        int nacimiento, edadActual, edadProxima; 
        
        //Ingreso Datos
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: "); 
        nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: ")); 
        
        //Proceso Datos
        edadActual = 2020-nacimiento; 
        edadProxima = 2050-nacimiento; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,nombre+" tu edad actual es "+edadActual+" años"+"\nY si sobrevivis al Coronavirus, en el 2050 vas a tener "+edadProxima+" años");
    }
}
