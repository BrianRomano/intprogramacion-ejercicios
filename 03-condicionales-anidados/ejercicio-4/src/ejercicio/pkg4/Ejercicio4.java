package ejercicio.pkg4;

import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Variables
        int n1, n2, n3;

        //Ingreso de Datos
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));

        //Proceso de Datos y Muestro
        if (n1 <= n2) {
            if (n1 <= n3) {
                if (n2 <= n3) {
                    JOptionPane.showMessageDialog(null, "Orden Descendente:" + n1 + "-" + n2 + "-" + n3);
                } else {
                    JOptionPane.showMessageDialog(null, "Orden Descendente:" + n1 + "-" + n3 + "-" + n2);
                }
            }
        } else {
            if (n2 <= n3) {
                if (n1 <= n3) {
                    JOptionPane.showMessageDialog(null, "Orden Descendente:" + n2 + "-" + n1 + "-" + n3);
                } else {
                    JOptionPane.showMessageDialog(null, "Orden Descendente:" + n2 + "-" + n3 + "-" + n1);
                }
            } else {
                if (n3 <= n1) {
                    if(n2<=n1){
                        JOptionPane.showMessageDialog(null,"Orden Descendente:" + n3 + "-" + n2 + "-" + n1);
                    } else{
                        JOptionPane.showMessageDialog(null,"Orden Descendente:" + n3 + "-" + n1 + "-" + n2);
                    }
                }
            }
        }

    }

}
