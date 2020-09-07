package ejercicio.pkg4;
import javax.swing.*; 

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //Variables
        int matricula, nota1, nota2, nota3; 
        double promedio; 
        
        //Ingreso Datos
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su matricula: ")); 
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer nota: ")); 
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segunda nota: "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tercer nota: "));
        
        //Realiza promedio
        promedio = (nota1+nota2+nota3)/3; 
        
        //Muestro
        JOptionPane.showMessageDialog(null,"Matricula: "+ matricula+"\nSu promedio es: "+promedio);
    }
    
}
