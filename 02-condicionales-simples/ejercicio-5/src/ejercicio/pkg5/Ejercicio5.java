package ejercicio.pkg5;
import javax.swing.*; 

public class Ejercicio5 {

    public static void main(String[] args) {
        
        //Variables
        int correctas = 0; 
        final String rtaCorrecta = "Correcto", rtaIncorrecta = "Incorrecto";
        String rta; 
        
        //Ingreso Datos y Muestro
        rta = JOptionPane.showInputDialog("¿Cual es la raíz cuadrada de 144?");
        if(rta.equals("12")){
            JOptionPane.showConfirmDialog(null, rtaCorrecta);
            correctas++;
        }else{
            JOptionPane.showMessageDialog(null, rtaIncorrecta);
        }
        rta = JOptionPane.showInputDialog("¿Quien fundo Bs As?");
        if(rta.equalsIgnoreCase("Pedro de Mendoza, Mendoza")){
            JOptionPane.showMessageDialog(null, rtaCorrecta);
            correctas++;
        }else{
            JOptionPane.showMessageDialog(null, rtaIncorrecta);
        }
        rta = JOptionPane.showInputDialog("¿Cual es la capital de Francia?");
        if(rta.equalsIgnoreCase("Paris")){
            JOptionPane.showMessageDialog(null, rtaCorrecta);
            correctas++;
        }else{
            JOptionPane.showMessageDialog(null,rtaIncorrecta);
        }
        JOptionPane.showMessageDialog(null,"Cantidad de respuestas correctas: "+correctas+" respuestas correctas");
    }
    
}
