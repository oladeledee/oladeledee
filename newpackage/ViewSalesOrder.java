/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.newpackage;

/**
 *
 * @author oladele
 */
public class ViewSalesOrder extends javax.swing.JFrame {

    /**
     * Creates new form ViewSalesOrder
     */
    public ViewSalesOrder() {
        initComponents();
        this.setVisible(true);
        this.setSize(650,450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("    VIEW SALES ORDER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 150, 15);

        jLabel2.setText("SALES ID :  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 60, 80, 15);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 60, 70, 19);

        jLabel3.setText("ORDER DATE :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 60, 80, 15);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(350, 60, 70, 19);

        jLabel4.setText("CUSTOMER NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 110, 20);

        jLabel5.setText("CUSTOMER PHONE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 140, 120, 15);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 90, 120, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 140, 120, 19);

        jLabel6.setText("CUSTOMERS ADDRESS:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 140, 140, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(430, 120, 163, 78);

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dff",  new Integer(7),  new Integer(2), "sasdfgh"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ITEM", "QUANTITY", "PRICE", "DESCRIPTION "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TABLE);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(30, 240, 453, 403);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 400, 73, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              ViewSalesOrder vso   =new ViewSalesOrder();
//              vso.ViewSalesOrder();
          //    vso.//
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TABLE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}