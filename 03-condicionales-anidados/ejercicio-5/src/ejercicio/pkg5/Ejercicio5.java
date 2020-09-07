package ejercicio.pkg5;
import javax.swing.*; 

public class Ejercicio5 {

    public static void main(String[] args) {
        
        //Variables
        int totalPreguntas, preguntasCorrectas, nivel;
        
        //Ingreso de Datos
        totalPreguntas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de preguntas: "));
        preguntasCorrectas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de preguntas correctas: ")); 
        
        //Proceso Datos
        nivel = preguntasCorrectas*100/totalPreguntas;
        
        //Proceso y Muestro 
        if(nivel>=90){
            JOptionPane.showMessageDialog(null,"Su nivel es Maximo");
        }else{
            if(nivel>=75){
                JOptionPane.showMessageDialog(null,"Su nivel es Medio");
            }else{
                if(nivel>=50){
                    JOptionPane.showMessageDialog(null,"Su nivel es Regular");
                }else{
                    JOptionPane.showMessageDialog(null,"Esta fuera de nivel");
                }
            }
        }
    }
    
}
