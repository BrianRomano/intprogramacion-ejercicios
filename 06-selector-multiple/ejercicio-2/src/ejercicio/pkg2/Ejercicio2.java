package ejercicio.pkg2;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Variables
        int clave, minutos;
        double costo=0, descuento, total, totalDescuento;
        String zona = "";

        //Ingreso de Datos
        clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clave de la zona a llamar:\n12- América del norte\n15- América central\n18- América del sur\n19- Europa\n23- Asia\n25- África"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de minutos a llamar:"));

        //Selector
        switch (clave) {
            case 12:
                costo = 0.68;
                zona = "América del norte";
                break;
            case 15:
                costo = 0.55;
                zona = "América central";
                break;
            case 18:
                costo = 0.62;
                zona = "América del sur";
                break;
            case 19:
                costo = 0.85;
                zona = "Europa";
                break;
            case 23:
                costo = 0.89;
                zona = "Asia";
                break;
            case 25:
                costo = 0.82;
                zona = "África";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Clave incorrecta");
                break;
        }
        total = costo* minutos; 
        if(total > 15){
            descuento = total* 0.15;
            totalDescuento = total - descuento; 
            JOptionPane.showMessageDialog(null,"La llamada a "+zona+" cuesta $"+totalDescuento);
        }else{
            JOptionPane.showMessageDialog(null,"La llamada a "+zona+"cuesta $"+total);
        }
    }
}
