/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class TelaAvisos2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaAvisos2
     */
    public TelaAvisos2(int tipo) {
        super("Atenção");
        initComponents();
        setLocationRelativeTo(null);
        if(tipo == 7){
        imgAumentouLimite.setVisible(false);       
        txtvalor.setVisible(false);
        imgNaoAumentouLimite.setVisible(true);
        imgChaveCad.setVisible(false);        
        }
        if(tipo == 9){
        imgAumentouLimite.setVisible(true);       
        txtvalor.setVisible(false);
        imgNaoAumentouLimite.setVisible(false);
        imgChaveCad.setVisible(true);
        }
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            }); 
        }
    public TelaAvisos2(int tipo,String txtValorCerto) {
        super("Atenção");
        initComponents();
        if(tipo == 7){
        imgAumentouLimite.setVisible(false);       
        txtvalor.setVisible(false);
        imgNaoAumentouLimite.setVisible(true);
        imgChaveCad.setVisible(false);
        }
        if(tipo == 9){
        imgAumentouLimite.setVisible(false);       
        txtvalor.setVisible(false);
        imgNaoAumentouLimite.setVisible(false);
        imgChaveCad.setVisible(true);
        }
        if(tipo == 6){
        imgAumentouLimite.setVisible(true);
        int index = txtValorCerto.indexOf(',')+1;
        String aposvirgula = txtValorCerto.substring(index,txtValorCerto.length());
        String valorCerto = txtValorCerto;        
        if(aposvirgula.length() == 1){
            valorCerto = (txtValorCerto+ '0');
        }
        else{
            valorCerto = txtValorCerto;
        }
        txtvalor.setText(valorCerto.substring(0,valorCerto.indexOf(',')+3));
        txtvalor.setVisible(true);
        imgNaoAumentouLimite.setVisible(false);
        imgChaveCad.setVisible(false);
        }
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });  
    }

    public TelaAvisos2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtvalor = new javax.swing.JLabel();
        imgChaveCad = new javax.swing.JLabel();
        imgAumentouLimite = new javax.swing.JLabel();
        imgNaoAumentouLimite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtvalor.setFont(new java.awt.Font("Dialog", 0, 54)); // NOI18N
        txtvalor.setForeground(new java.awt.Color(255, 255, 255));
        txtvalor.setText("00,00");
        getContentPane().add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 167, -1, 60));

        imgChaveCad.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/825423486012620863/1125157461809176707/Group_40.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgChaveCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        imgAumentouLimite.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/825423486012620863/1125149867287789568/Group_35.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgAumentouLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        imgNaoAumentouLimite.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/825423486012620863/1125149867661074582/Group_36.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgNaoAumentouLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaAvisos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAvisos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAvisos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAvisos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAvisos2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgAumentouLimite;
    private javax.swing.JLabel imgChaveCad;
    private javax.swing.JLabel imgNaoAumentouLimite;
    private javax.swing.JLabel txtvalor;
    // End of variables declaration//GEN-END:variables
}
