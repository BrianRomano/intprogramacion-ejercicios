package ejercicio.pkg2;
import javax.swing.*; 

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Variables
        int varones, mujeres, totalCurso; 
        double promedioVarones, promedioMujeres; 
        
        //Ingreso Datos
        mujeres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de mujeres: ")); 
        varones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de varones: ")); 
        
        //Proceso Datos
        totalCurso = mujeres+varones; 
        promedioMujeres = mujeres*100/totalCurso; 
        promedioVarones = varones*100/totalCurso; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"El porcentaje de mujeres es "+promedioMujeres+"%"+"\nEl porcentaje de varones es "+promedioVarones+"%");
    }
    
}
