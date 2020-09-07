package Formularios;

//Librerias utilizadas
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class form1 extends javax.swing.JFrame {
    
    public form1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        btnTirar = new javax.swing.JButton();
        lblDer = new javax.swing.JLabel();
        lblCentro = new javax.swing.JLabel();
        lblIzq = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Dados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gama\\Documents\\Escuela Da Vinci\\1er cuatrimestre\\Introducción a la programación\\Archivos\\Clase 18\\imagenes y juego de dados\\dadosani.gif")); // NOI18N
        jLabel1.setText("Juego de Dados");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresar apuesta");

        txtCaja.setBackground(new java.awt.Color(102, 102, 102));
        txtCaja.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCaja.setForeground(new java.awt.Color(255, 255, 255));
        txtCaja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnTirar.setBackground(new java.awt.Color(153, 0, 0));
        btnTirar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnTirar.setForeground(new java.awt.Color(255, 255, 255));
        btnTirar.setText("Tirar");
        btnTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarActionPerformed(evt);
            }
        });

        lblDer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblCentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblIzq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMensaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCaja))
                            .addComponent(btnTirar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(116, 116, 116))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnTirar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Variables 
    int dadoUno, dadoDos, dadoTres;
    double apuesta, total;
    Random rnd = new Random();

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Cambiar el color de la forma 
        this.getContentPane().setBackground(Color.BLACK);
        //Cambiar el icono de la forma
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/dadorojo.png")));
    }//GEN-LAST:event_formWindowOpened
    

    private void btnTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarActionPerformed
        //Guardar la apuesta
        apuesta = Double.parseDouble(txtCaja.getText());

        //Creo los random para cada dado
        dadoUno = rnd.nextInt(6) + 1;
        dadoDos = rnd.nextInt(6) + 1;
        dadoTres = rnd.nextInt(6) + 1;

        //Muestro los dados en la pantalla
        lblIzq.setIcon(new ImageIcon(getClass().getResource("/imagenes/dado" + dadoUno + ".png")));
        lblCentro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/dado" + dadoDos + ".png")));
        lblDer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/dado" + dadoTres + ".png")));

        //Categorizo los resultados
        switch (dadoUno + dadoDos + dadoTres) {
            case 3:
            case 18:
                total = apuesta * 3;
                lblMensaje.setText("Triplicaste tu apuesta a $" + total);
                break;
            case 6:
            case 9:
            case 12:
                lblMensaje.setText("Perdiste");
                break;
            default:
                lblMensaje.setText("Tenes un nuevo tiro");
                if (dadoUno == dadoDos && dadoUno == dadoTres) {
                    total = apuesta * 2;                    
                    lblMensaje.setText("Duplicaste tu apuesta a $" + total);
                } else if (dadoUno == 1 && dadoDos + dadoTres > 2 || dadoDos == 1 && dadoUno + dadoTres > 2 || dadoTres == 1 && dadoUno + dadoDos > 2) {
                    total = apuesta + 10;                    
                    lblMensaje.setText("Ganaste +$10, en total $" + total);
                } else if (dadoUno == dadoDos || dadoDos == dadoTres || dadoUno == dadoTres) {
                    total = apuesta;
                    lblMensaje.setText("Se devuelve tu apuesta $" + total);
                }
                break;
        }
    }//GEN-LAST:event_btnTirarActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCentro;
    private javax.swing.JLabel lblDer;
    private javax.swing.JLabel lblIzq;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtCaja;
    // End of variables declaration//GEN-END:variables
}
