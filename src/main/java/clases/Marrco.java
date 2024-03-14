/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author inaki
 */
public class Marrco extends javax.swing.JFrame {

 /**
     * Creates new form Marrco
     */
    public Marrco() {

        //sinFondo();
        initComponents();
        setVisible(true);
        setSize(661, 478);
        setTitle("Lector");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        ImageIcon imagen = new ImageIcon("src/images/fondo.png");
        Image image = imagen.getImage();
        Image newImage = image.getScaledInstance(image.getWidth(rootPane), image.getHeight(rootPane), Image.SCALE_SMOOTH);
        imagen = new ImageIcon(newImage);
        jLabel2.setIcon(imagen);

    }
    String ruta_1 = "";
    String ruta_2 = "";
    int bandera_1 = 0;
    int bandera_2 = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_coin = new javax.swing.JButton();
        BTN_doc3 = new javax.swing.JButton();
        BTN_doc1 = new javax.swing.JButton();
        L_uni = new javax.swing.JLabel();
        L_iss = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_coin.setIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\BT_C.png")); // NOI18N
        BTN_coin.setText("jButton1");
        BTN_coin.setContentAreaFilled(false);
        BTN_coin.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\BT_C2.png")); // NOI18N
        BTN_coin.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\BT_C2.png")); // NOI18N
        BTN_coin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_coinActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_coin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 210, 80));

        BTN_doc3.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        BTN_doc3.setForeground(new java.awt.Color(204, 204, 204));
        BTN_doc3.setIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\Doc_N.png")); // NOI18N
        BTN_doc3.setText("Selecciona un Diccionario");
        BTN_doc3.setContentAreaFilled(false);
        BTN_doc3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_doc3.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\Doc_N_1.png")); // NOI18N
        BTN_doc3.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\Doc_N_1.png")); // NOI18N
        BTN_doc3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_doc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_doc3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_doc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 230, 110));

        BTN_doc1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        BTN_doc1.setForeground(new java.awt.Color(204, 204, 204));
        BTN_doc1.setIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\Doc_N.png")); // NOI18N
        BTN_doc1.setText("Selecciona un Documento");
        BTN_doc1.setContentAreaFilled(false);
        BTN_doc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_doc1.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\Doc_N_1.png")); // NOI18N
        BTN_doc1.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\Doc_N_1.png")); // NOI18N
        BTN_doc1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_doc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_doc1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_doc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 110));

        L_uni.setIcon(new javax.swing.ImageIcon("C:\\Users\\inaki\\OneDrive\\Documentos\\NetBeansProjects\\PU\\src\\images\\unitec.png")); // NOI18N
        getContentPane().add(L_uni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 220, 70));

        L_iss.setBackground(new java.awt.Color(255, 255, 255));
        L_iss.setForeground(new java.awt.Color(255, 255, 255));
        L_iss.setText("Sobera Sotomayor Iñaki ©");
        getContentPane().add(L_iss, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 699, 508));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_coinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_coinActionPerformed

        if (ruta_1 == "" || ruta_2 == "") {

            JOptionPane.showMessageDialog(this, "Te falta seleccionar algun documento, por favor intenta lo de nuevo", "Error de seleccion", 0);

        } else {

            //-----------------------------------Primera Parte------------------------------------------
            List<String> palabras_1 = new ArrayList<>();// Lista para almacenar las palabras de la ruta 1

            try (BufferedReader buff = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(ruta_1)))) {

                String line;
                int numLinea = 0;

                while ((line = buff.readLine()) != null) {
                    numLinea++;
                    String[] lineWords = line.split("\\s+");// Dividir por espacios en blanco
                    for (String word : lineWords) {
                        palabras_1.add(word); // Agregar cada palabra a la lista de palabras
                    }
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "No se encontro la ruta del primer arrchivo", "Error", 3);
            } catch (IOException ex) {
                System.out.println("Error al leer el archivo: ");
            }

            for (String palabra : palabras_1) {
                if (palabra != null) {
                    System.out.println(palabra);
                }
            }
            //-----------------------------------Segunda Parte------------------------------------------
            List<String> palabras_2 = new ArrayList<>();// Lista para almacenar las palabras de la ruta 2
            try (BufferedReader buff2 = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(ruta_2)))) {

                String line;
                int numLinea = 0;

                while ((line = buff2.readLine()) != null) {
                    numLinea++;
                    String[] lineWords = line.split("\\s+");// Dividir por espacios en blanco
                    for (String word : lineWords) {
                        palabras_2.add(word); // Agregar cada palabra a la lista de palabras
                    }
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "No se encontro la ruta del segundo arrchivo", "Error", 3);
            } catch (IOException ex) {
                System.out.println("Error al leer el archivo: ");
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for (String palabra1 : palabras_2) {
                if (palabra1 != null) {
                    System.out.println(palabra1);
                }
            }
            //-----------------------------------tercera parte------------------------------------------

            for (String palabra1 : palabras_1) {
                for (String palabra2 : palabras_2) {
                    if (palabra1.equals(palabra2)) {
                        System.out.println("Palabra comun: " + palabra1);
                    }
                }
            }
            //------------------------------------------------------------------------------------
            
            String rutaEscritorio = System.getProperty("user.home") + "/Desktop/";
            String Archivo = "Coinsidencias.txt";
            String rutaCompletaArchivo = rutaEscritorio + Archivo;
            
            try {
            // Crear un objeto File que represente el archivo
            File archivo = new File(rutaCompletaArchivo);

            // Verificar si el archivo ya existe, si no existe, se crea
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("Archivo creado exitosamente en el escritorio.");
            }

            // Escribir en el archivo
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            // Escribir contenido en el archivo
            bw.write("Hola, este es el contenido del archivo en el escritorio.");
            bw.newLine(); // Cambiar de línea
            bw.write("Puedes agregar más líneas si lo deseas.");

            // Cerrar el BufferedWriter
            bw.close();

            System.out.println("Contenido agregado al archivo en el escritorio.");

        } catch (IOException e) {
            System.err.println("Error al crear o escribir en el archivo en el escritorio: " + e.getMessage());
        }
            
        }
    }//GEN-LAST:event_BTN_coinActionPerformed

    private void BTN_doc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_doc1ActionPerformed

        JFileChooser buscador = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("TXT, PDF", "txt", "pdf");
        buscador.setFileFilter(filtrado);

        int respuesta = buscador.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {

            ruta_1 = buscador.getSelectedFile().getPath();
            ImageIcon paloma = new ImageIcon("src/images/Doc_B.png");
            BTN_doc1.setIcon(paloma);

        }
    }//GEN-LAST:event_BTN_doc1ActionPerformed

    private void BTN_doc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_doc3ActionPerformed
        String ruta = "";

        JFileChooser buscador = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("TXT, PDF", "txt", "pdf");
        buscador.setFileFilter(filtrado);

        int respuesta = buscador.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {

            ruta_2 = buscador.getSelectedFile().getPath();
            ImageIcon paloma = new ImageIcon("src/images/Doc_B.png");
            BTN_doc3.setIcon(paloma);
        }
    }//GEN-LAST:event_BTN_doc3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Marrco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marrco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marrco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marrco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Marrco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_coin;
    private javax.swing.JButton BTN_doc1;
    private javax.swing.JButton BTN_doc3;
    private javax.swing.JLabel L_iss;
    private javax.swing.JLabel L_uni;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
