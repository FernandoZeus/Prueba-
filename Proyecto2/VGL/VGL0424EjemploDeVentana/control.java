package VGL0424EjemploDeVentana;
import java.awt.Container;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.*;

import javax.swing.*;


//este es una prueba que no he hecho yo, aunque he puesto lo que hace cada cosa.


public class control extends javax.swing.JFrame {
	
	//variables
	
	private javax.swing.JButton btnanadir;
    private javax.swing.JComboBox cmbPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtPelicula;
    
    //constructor
 
    public control() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
 
    	//inicializamos las variables
    	
        cmbPeliculas = new javax.swing.JComboBox();//listado
        jLabel1 = new javax.swing.JLabel();			//label1
        txtPelicula = new javax.swing.JTextField();//campoTexto
        jLabel2 = new javax.swing.JLabel();			//label2
        btnanadir = new javax.swing.JButton();//boton de a�adir
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peliculas");
 
        jLabel1.setText("Peliculas");		//label1 titulo
 
        jLabel2.setText("Escribe el titulo de una pelicula");	//label2 titulo
        
        
 
        btnanadir.setText("A�adir");
        
        //cuando pulsemos el boton de a�adir
        btnanadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanadirActionPerformed(evt);
            }
        });
        
        //configuracion
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        //este metodo sirve para poner la posicion en la que se va a poner en horizontal.
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                	//a�adimos componentes
                    .addComponent(jLabel2)
                    .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)	
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    		//a�adimos componentes
                        .addComponent(cmbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    		//a�adimos componentes
                        .addComponent(jLabel1)
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnanadir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
        //lo mismo que el de arriba pero en vertical.
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnanadir)
                .addContainerGap(29, Short.MAX_VALUE))
        );
 
        //metodo para que coja el tama�o de la ventana en funcion de lo que tengamos
        pack();
    }                       
 
    private void btnanadirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        //Cogemos el texto del campo de texto
        String pelicula=txtPelicula.getText();
         
        //A�adimos la pelicula al combobox
        cmbPeliculas.addItem(pelicula);
         
        //Reiniciamos el campo de texto
        txtPelicula.setText("");
         
    }                                         
 
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new control().setVisible(true);
            }
        });
    }
             
}
    	 
    

