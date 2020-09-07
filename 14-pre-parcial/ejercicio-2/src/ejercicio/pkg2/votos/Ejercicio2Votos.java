package ejercicio.pkg2.votos;

import javax.swing.*;

public class Ejercicio2Votos {

    public static void main(String[] args) {

        //Variables
        String primerPuesto = "", segundoPuesto = "";
        int juan, pedro, maria, primerVoto, segundoVoto;
        double votosJuan, votosPedro, votosMaria, totalVotos;
        boolean segundaVuelta = true;

        //Ingreso de datos
        juan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos para Juan: "));
        pedro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos para Pedro: "));
        maria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos para Maria: "));

        //Proceso el porcentaje de votos
        totalVotos = juan + pedro + maria;
        votosJuan = juan * 100 / totalVotos;
        votosPedro = pedro * 100 / totalVotos;
        votosMaria = maria * 100 / totalVotos;

        //Proceso datos
        if (votosJuan > 50) {
            JOptionPane.showMessageDialog(null, "El mejor compañero del aula es Juan");
        } else if (votosPedro > 50) {
            JOptionPane.showMessageDialog(null, "El mejor compañero del aula es Pedro");
        } else if (votosMaria > 50) {
            JOptionPane.showMessageDialog(null, "El mejor compañero del aula es Maria");
        } else if (votosJuan > votosPedro && votosPedro > votosMaria) { //Primer y segundo puesto
            primerPuesto = "Juan";
            segundoPuesto = "Pedro";
            segundaVuelta = true;
        } else if (votosJuan > votosMaria && votosMaria > votosPedro) { //Primer y segundo puesto
            primerPuesto = "Juan";
            segundoPuesto = "Maria";
            segundaVuelta = true;
        } else if (votosPedro > votosJuan && votosJuan > votosMaria) { //Primer y segundo puesto
            primerPuesto = "Pedro";
            segundoPuesto = "Juan";
            segundaVuelta = true;
        } else if (votosPedro > votosMaria && votosMaria > votosJuan) { //Primer y segundo puesto
            primerPuesto = "Pedro";
            segundoPuesto = "Maria";
            segundaVuelta = true;
        } else if (votosMaria > votosJuan && votosJuan > votosPedro) { //Primer y segundo puesto
            primerPuesto = "Maria";
            segundoPuesto = "Juan";
            segundaVuelta = true;
        } else if (votosMaria > votosPedro && votosPedro > votosJuan) { //Primer y segundo puesto
            primerPuesto = "Maria";
            segundoPuesto = "Pedro";
            segundaVuelta = true;
        } else if (votosJuan == votosPedro && votosPedro == votosMaria) { //Anulación de votos
            JOptionPane.showMessageDialog(null, "La votación se anula");
        } else if (votosJuan > votosPedro && votosPedro == votosMaria || votosPedro > votosJuan && votosJuan == votosMaria || votosMaria > votosJuan && votosJuan == votosPedro) {
            JOptionPane.showMessageDialog(null, "La votación se anula");
        }
        if (segundaVuelta != false) { //Segunda vuelta 

            //Ingreso de votos
            primerVoto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos de" + primerPuesto));
            segundoVoto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de datos de" + segundoPuesto));

            //Proceso votos y muestro
            if (primerVoto > segundoVoto) {
                JOptionPane.showMessageDialog(null, "El ganador es " + primerPuesto);
            } else {
                JOptionPane.showMessageDialog(null, "El ganador es " + segundoPuesto);
            }

        }
    }
}
