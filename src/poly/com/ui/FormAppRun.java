/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package poly.com.ui;

import poly.com.ui.FormLogin;
import java.awt.Color;
import javax.swing.UIManager;
import poly.com.HELPER.jdbcHelper;

/**
 *
 * @author huuho
 */
public class FormAppRun extends javax.swing.JDialog {

    /**
     * Creates new form FormAppRun
     */
    public FormAppRun(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        new Thread() {
            @Override
            public void run() {
                int value = progressBar.getValue();
                String str = progressBar.getString();
                while (true) {
                    if (value < 100) {
                        progressBar.setValue(++value);
                        progressBar.setString(str + value + "%");
                        try {
                            Thread.sleep(15);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        dispose();
                        new FormLogin().setVisible(true);
                        break;
                    }
                }
            }
        }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        UIManager.put("ProgressBar.background", Color.WHITE); 
        UIManager.put("ProgressBar.foreground", Color.BLACK);
        UIManager.put("ProgressBar.selectionBackground", Color.BLACK);  
        UIManager.put("ProgressBar.selectionForeground", Color.WHITE);

        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/logoChao.jpg"))); // NOI18N
        getContentPane().add(lblLogo, java.awt.BorderLayout.CENTER);

        progressBar.setToolTipText("");
        progressBar.setPreferredSize(new java.awt.Dimension(146, 30));
        progressBar.setString("Đang tải ... ");
        progressBar.setStringPainted(true);
        getContentPane().add(progressBar, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(600, 379));
        setLocationRelativeTo(null);
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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAppRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAppRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAppRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAppRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAppRun dialog = new FormAppRun(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLogo;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
