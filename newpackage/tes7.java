/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.newpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author oladele
 */
public class tes7 extends javax.swing.JFrame {

            Date date=new Date();
    /**
     * Creates new form tes7
     */
    public tes7() {
        initComponents();
           this.setVisible(true);
        this.setSize(1020,530);
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

        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DS = new javax.swing.JTextField();
        DES = new javax.swing.JTextField();
        QSOFA = new javax.swing.JTextField();
        CS = new javax.swing.JTextField();
        PN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        QDINNIG = new javax.swing.JTextField();
        QBED = new javax.swing.JTextField();
        QITALIAN = new javax.swing.JTextField();
        SALESID = new javax.swing.JTextField();
        PSOFA = new javax.swing.JTextField();
        PDINNIG = new javax.swing.JTextField();
        PBED = new javax.swing.JTextField();
        TOTAL = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        PITALIAN = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/newpackage/work2.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("SALES ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 60, 70, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("DATE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 50, 50, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ADDRESS:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 130, 70, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("View SALES OREDER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 10, 210, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("CLIENT NAME:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 130, 110, 20);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("DESCRIPTION");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 240, 100, 20);

        DS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSActionPerformed(evt);
            }
        });
        getContentPane().add(DS);
        DS.setBounds(460, 50, 70, 30);
        getContentPane().add(DES);
        DES.setBounds(380, 260, 130, 40);
        getContentPane().add(QSOFA);
        QSOFA.setBounds(250, 270, 50, 30);
        getContentPane().add(CS);
        CS.setBounds(180, 130, 110, 30);
        getContentPane().add(PN);
        PN.setBounds(180, 180, 110, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("PHONE NUMBER:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 180, 120, 20);

        jLabel11.setText("SOFA");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 270, 60, 20);

        jLabel10.setText("KING SIZED BED");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 350, 100, 20);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("PRICE");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 240, 60, 20);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("QUANTITY");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(240, 240, 70, 20);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("ITEM");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(40, 240, 60, 20);

        jLabel19.setText("TOTAL :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 440, 60, 20);

        jLabel20.setText("DINNING TABLE");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(30, 310, 100, 20);
        getContentPane().add(QDINNIG);
        QDINNIG.setBounds(250, 309, 50, 30);
        getContentPane().add(QBED);
        QBED.setBounds(250, 350, 50, 30);
        getContentPane().add(QITALIAN);
        QITALIAN.setBounds(250, 390, 50, 30);
        getContentPane().add(SALESID);
        SALESID.setBounds(140, 60, 70, 30);

        PSOFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSOFAActionPerformed(evt);
            }
        });
        getContentPane().add(PSOFA);
        PSOFA.setBounds(140, 270, 50, 30);
        getContentPane().add(PDINNIG);
        PDINNIG.setBounds(140, 309, 50, 30);
        getContentPane().add(PBED);
        PBED.setBounds(140, 350, 50, 30);
        getContentPane().add(TOTAL);
        TOTAL.setBounds(130, 440, 80, 30);
        getContentPane().add(A);
        A.setBounds(390, 130, 120, 30);

        jLabel21.setText("ITALIAN CHAIR");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(30, 390, 90, 20);

        PITALIAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PITALIANActionPerformed(evt);
            }
        });
        getContentPane().add(PITALIAN);
        PITALIAN.setBounds(140, 390, 50, 30);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("GENERATE INVOICE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 460, 170, 27);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("PRINT INVOICE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 460, 170, 27);

        jTextField1.setColumns(20);
        jTextField1.setRows(5);
        jScrollPane1.setViewportView(jTextField1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(630, 30, 360, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/newpackage/work2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DSActionPerformed

    private void DESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESActionPerformed

    private void PSOFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSOFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PSOFAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling co
                         
        Calendar timer=Calendar.getInstance();
        timer.getTime();
        
        
      SimpleDateFormat DATE=new SimpleDateFormat("dd-MM-YYYY");
        
        
        
     //   Date date=new Date("dd-MM-YYYY");
      // String DATE= date.toString();
    jTextField1.setText("****************************************************************************\n");
jTextField1.setText(jTextField1.getText() +"*               UNO NUMERO INVOICE PRINTOUT                  *\n ");
jTextField1.setText(jTextField1.getText() +"****************************************************************************\n ");


jTextField1.setText(jTextField1.getText()+ "ORDER DATE"+" : "  +DATE+"\n");
jTextField1.setText(jTextField1.getText()+ "SALES ID"+" : "  +SALESID.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");
jTextField1.setText(jTextField1.getText()+ "CLIENTNAME"+" : "  +CS.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");
jTextField1.setText(jTextField1.getText()+ "PHONE NO"+" : "  +PN.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");
jTextField1.setText(jTextField1.getText()+ "CLIENT ADDRESS"+" : "  +A.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");

jTextField1.setText(jTextField1.getText()+ "ITEM ORDERED"+" : "  +"SOFA :"+QSOFA.getText()+"\n");
jTextField1.setText(jTextField1.getText()+ "ITEM PRICE"+" : "  +"SOFA : $"+PSOFA.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");


jTextField1.setText(jTextField1.getText()+ "ITEM ORDERED"+" : "  +"DINNING TABLE :"+QDINNIG.getText()+"\n");
jTextField1.setText(jTextField1.getText()+ "ITEM PRICE"+" : "  +"DINNING TABLE : $"+PDINNIG.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");

jTextField1.setText(jTextField1.getText()+ "ITEM ORDERED"+" : "  +"KING SIZED BED :"+QDINNIG.getText()+"\n");
jTextField1.setText(jTextField1.getText()+ "ITEM PRICE"+" : "  +"KING SIZED BED : $"+PDINNIG.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");

jTextField1.setText(jTextField1.getText()+ "ITEM ORDERED"+" : "  +"ITALIAN CHAIR :"+QITALIAN.getText()+"\n");
jTextField1.setText(jTextField1.getText()+ "ITEM PRICE"+" : "  +"ITALIAN CHAIR : $"+PITALIAN.getText()+"\n");
jTextField1.setText(jTextField1.getText() + "   "+"\n");


jTextField1.setText(jTextField1.getText()+ "TOTAL"+" : "  +TOTAL.getText()+"\n");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
           jTextField1.print(); 
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PITALIANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PITALIANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PITALIANActionPerformed

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
            java.util.logging.Logger.getLogger(tes7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tes7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tes7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tes7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                tes7 ts= new tes7();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField A;
    public javax.swing.JTextField CS;
    public javax.swing.JTextField DES;
    public javax.swing.JTextField DS;
    public javax.swing.JTextField PBED;
    public javax.swing.JTextField PDINNIG;
    public javax.swing.JTextField PITALIAN;
    public javax.swing.JTextField PN;
    public javax.swing.JTextField PSOFA;
    public javax.swing.JTextField QBED;
    public javax.swing.JTextField QDINNIG;
    public javax.swing.JTextField QITALIAN;
    public javax.swing.JTextField QSOFA;
    public javax.swing.JTextField SALESID;
    public javax.swing.JTextField TOTAL;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextField1;
    // End of variables declaration//GEN-END:variables
}