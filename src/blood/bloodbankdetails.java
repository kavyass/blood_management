/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package blood;

/**
 *
 * @author MANU
 */
public class bloodbankdetails extends javax.swing.JFrame {

    /**
     * Creates new form bloodbankdetails
     */
    public bloodbankdetails() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelreceptionist = new javax.swing.JLabel();
        jLabelmanager = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabelclose = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jLabelback = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BLOOD BANK DETAILS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 0, 560, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Blood bank code");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 230, 240, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Blood  type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 350, 240, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood orders");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 470, 240, 40);

        jLabelreceptionist.setBackground(new java.awt.Color(204, 204, 204));
        jLabelreceptionist.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelreceptionist.setForeground(new java.awt.Color(255, 255, 255));
        jLabelreceptionist.setText("Receptionist details");
        jPanel1.add(jLabelreceptionist);
        jLabelreceptionist.setBounds(90, 620, 240, 40);

        jLabelmanager.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelmanager.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmanager.setText("Blood bank manager details");
        jLabelmanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelmanagerMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelmanager);
        jLabelmanager.setBounds(650, 620, 340, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Blood bank name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(160, 120, 240, 40);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(460, 460, 330, 50);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(460, 240, 330, 50);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(460, 350, 330, 50);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(460, 120, 330, 50);

        jLabelclose.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelclose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelclose.setText("x");
        jLabelclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelclose);
        jLabelclose.setBounds(1030, 10, 40, 40);

        jLabelmin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmin.setText("-");
        jLabelmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelmin);
        jLabelmin.setBounds(990, 20, 30, 30);

        jLabelback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelback.setForeground(new java.awt.Color(255, 255, 255));
        jLabelback.setText("Back");
        jLabelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelback);
        jLabelback.setBounds(490, 680, 50, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MANU\\Documents\\NetBeansProjects\\BLOOD\\src\\blood\\Download Wallpaper blood drops wave HD Background.jpg")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        receptionistdetails rd=new receptionistdetails();
        rd.setVisible(true);
        rd.pack();
        rd.setLocationRelativeTo(null);
        rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelmanagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelmanagerMouseClicked
        // TODO add your handling code here:
         bloodbankmanagerdeatils bd=new bloodbankmanagerdeatils();
        bd.setVisible(true);
        bd.pack();
        bd.setLocationRelativeTo(null);
        bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelmanagerMouseClicked

    private void jLabelcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcloseMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelcloseMouseClicked

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:

    }//GEN-LAST:event_jLabelminMouseClicked

    private void jLabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseClicked
        // TODO add your handling code here:
        MAINPAGE mp=new MAINPAGE();
        mp.setVisible(true);
        mp.pack();
        mp.setLocationRelativeTo(null);
        mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelbackMouseClicked

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
            java.util.logging.Logger.getLogger(bloodbankdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bloodbankdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bloodbankdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bloodbankdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bloodbankdetails().setVisible(true);
            }
        });
    }
private javax.swing.JFrame JFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JLabel jLabelclose;
    private javax.swing.JLabel jLabelmanager;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelreceptionist;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
