/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ptoyecto.Peliculas;
import ptoyecto.Tipo_A;
import ptoyecto.Tipo_AA;
import ptoyecto.Tipo_B;
import ptoyecto.Tipo_B15;
import ptoyecto.Tipo_C;

/**
 *
 * @author Julio
 */
public class TodasLasPelis extends javax.swing.JFrame {

    /**
     * Creates new form TodasLasPelis
     */
    ArrayList <Peliculas> MisPelis = new ArrayList();
    public TodasLasPelis() throws IOException{
        initComponents();
        this.setLocationRelativeTo(null);
        String Todas = "";
    /*    Peliculas PeliA = new Tipo_A ();
        ArrayList<String> P = new ArrayList(PeliA.MostrarPelis());
        String au="";
        int X = PeliA.getTotal();
        String au1="";
        String au12="";
        System.out.println(P.size());   
        for(int i=0;i<P.size();i++){
            au =P.get(i);
            StringTokenizer tok = new StringTokenizer(au,"/");
            au1 = "Id: "+ tok.nextToken() +"\n" ;
            au1 += "Nombre: "+ tok.nextToken()+"\n";
            au1 += "Tipo: "+ tok.nextToken()+"\n";
            au1 += "Categoria: "+ tok.nextToken()+"\n";
            au1 += "Duracion: "+ tok.nextToken()+"\n";
            au1 += "Año: "+ tok.nextToken()+"\n";
            au1 += "Descripcion: "+ tok.nextToken()+"\n";
            au12 += au1 +"\n"; 
        }*/
        //Todas = au12;
        Peliculas PeliA2 = new Tipo_AA ();
      /*  ArrayList<String> P2 = new ArrayList(PeliA2.MostrarPelis());
        String auAA="";
        String au1AA="";
        String au12AA="";
        int X2 = PeliA2.getTotal();
        System.out.println(P2.size());   
        for(int i=0;i<P2.size();i++){
            auAA =P2.get(i);
            StringTokenizer tokAA = new StringTokenizer(auAA,"/");
            au1AA = "Id: "+ tokAA.nextToken() +"\n" ;
            au1AA += "Nombre: "+ tokAA.nextToken()+"\n";
            au1AA += "Tipo: "+ tokAA.nextToken()+"\n";
            au1AA += "Categoria: "+ tokAA.nextToken()+"\n";
            au1AA += "Duracion: "+ tokAA.nextToken()+"\n";
            au1AA += "Año: "+ tokAA.nextToken()+"\n";
            au1AA += "Descripcion: "+ tokAA.nextToken()+"\n";
            au12AA += au1AA +"\n"; 
        }
        Todas += au12AA;
        Peliculas PeliB = new Tipo_B();
          ArrayList<String> PB= new ArrayList(PeliB.MostrarPelis());
        String aub="";
        int X3 = PeliB.getTotal();
        String au1b="";
        String au12b="";
        System.out.println(PB.size());   
        for(int i=0;i<PB.size();i++){
            aub =PB.get(i);
            StringTokenizer tokb = new StringTokenizer(aub,"/");
            au1b = "Id: "+ tokb.nextToken() +"\n" ;
            au1b += "Nombre: "+ tokb.nextToken()+"\n";
            au1b += "Tipo: "+ tokb.nextToken()+"\n";
            au1b += "Categoria: "+ tokb.nextToken()+"\n";
            au1b += "Duracion: "+ tokb.nextToken()+"\n";
            au1b += "Año: "+ tokb.nextToken()+"\n";
            au1b += "Descripcion: "+ tokb.nextToken()+"\n";
            au12b += au1b +"\n"; 
        }
        Todas += au12b;
         Peliculas PeliA3 = new Tipo_B15 ();
        ArrayList<String> P3 = new ArrayList(PeliA3.MostrarPelis());
        String au3="";
        String au13="";
        String au123="";
        int X4 = PeliA3.getTotal();
        System.out.println(P3.size());   
        for(int i=0;i<P3.size();i++){
            au3 =P3.get(i);
            StringTokenizer tok3 = new StringTokenizer(au3,"/");
            au13 = "Id: "+ tok3.nextToken() +"\n" ;
            au13 += "Nombre: "+ tok3.nextToken()+"\n";
            au13 += "Tipo: "+ tok3.nextToken()+"\n";
            au13 += "Categoria: "+ tok3.nextToken()+"\n";
            au13 += "Duracion: "+ tok3.nextToken()+"\n";
            au13+= "Año: "+ tok3.nextToken()+"\n";
            au13 += "Descripcion: "+ tok3.nextToken()+"\n";
            au123 += au13 +"\n"; 
        }
        Todas +=au123;
         Peliculas Pelic = new Tipo_C ();
        ArrayList<String> Pc = new ArrayList(Pelic.MostrarPelis());
        String auc="";
        String au1c="";
        String au12c="";
        int X5 = Pelic.getTotal();
        System.out.println(Pc.size());   
        for(int i=0;i<Pc.size();i++){
            auc =Pc.get(i);
            StringTokenizer tokc = new StringTokenizer(auc,"/");
            au1c = "Id: "+ tokc.nextToken() +"\n" ;
            au1c += "Nombre: "+ tokc.nextToken()+"\n";
            au1c += "Tipo: "+ tokc.nextToken()+"\n";
            au1c += "Categoria: "+ tokc.nextToken()+"\n";
            au1c += "Duracion: "+ tokc.nextToken()+"\n";
            au1c += "Año: "+ tokc.nextToken()+"\n";
            au1c += "Descripcion: "+ tokc.nextToken()+"\n";
            au12c += au1c +"\n"; 
        }
        int To = ((X2+X3+X4+X5));
        Todas += au12c;
        this.Text.setText(Todas);
        this.Total.setText("Total: "+Integer.toString(To));
        */

    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Total = new java.awt.Label();
        gg1 = new java.awt.Label();
        FondoPelsi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setBackground(new java.awt.Color(0, 0, 153));
        Regresar.setText("Regresar");
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        Text.setEditable(false);
        Text.setBackground(new java.awt.Color(255, 255, 204));
        Text.setColumns(20);
        Text.setLineWrap(true);
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 370, 230));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Total.setAlignment(java.awt.Label.CENTER);
        Total.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 150, 30));

        gg1.setAlignment(java.awt.Label.CENTER);
        gg1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        gg1.setForeground(new java.awt.Color(255, 0, 0));
        gg1.setText("Mis Peliculas");
        jPanel1.add(gg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 70));

        FondoPelsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseño/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(FondoPelsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        new Inicio().setVisible(true);
        this.setVisible(false);
        
       
        
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(TodasLasPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodasLasPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodasLasPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodasLasPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TodasLasPelis().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TodasLasPelis.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoPelsi;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextArea Text;
    private java.awt.Label Total;
    private java.awt.Label gg1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
