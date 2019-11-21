/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.newpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author oladele
 */
public class SalesOrder extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JButton b1, b2, b3;
    JTextField t1, t2, t3, t4, t5, t6;
    JTextArea area1, area2, area3;
    JComboBox box1;
    JComboBox box2;
    Statement stmt;
    PreparedStatement stat;
    Connection con;
    int n1, n2;

    // String str ="INSERT INTO Ticket()"
    public SalesOrder() {

        {
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                con = DriverManager.getConnection("jdbc:derby://localhost:1527/Esuola", "Oladele", "Dele");

                //      con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=NewBank;user=dele;password=1234");
                stmt = con.createStatement();

            } catch (Exception e) {
                System.out.println("Error : " + e);
            }

            l1 = new JLabel("SALES ORDER");
            l2 = new JLabel("Ticket ID:");
            l3 = new JLabel("Customer Name:");
            l4 = new JLabel("Customer Phone:");
            l5 = new JLabel("Customer Address:");
            l6 = new JLabel("ORDERS DETAILS");
            l7 = new JLabel("Order Description: ");
            l8 = new JLabel("ITEM AVAILABLE:");
            l9 = new JLabel("Customer Email:");
            l10 = new JLabel("QUANTIY: ");
            l11 = new JLabel("Price: ");

               t1 = new JTextField();
            t1.setEditable(false);
             Random rd=new Random();
             int n=rd.nextInt(100000)+1;
             String sg=String.valueOf(n);
             t1.setText(sg);
                     
            t2 = new JTextField(5);
            t3 = new JTextField(19);
            t4 = new JTextField(15);
            t5 = new JTextField(20);
            t6 = new JTextField(20);

            area1 = new JTextArea();

            area3 = new JTextArea();

            box1 = new JComboBox();
            box1.addItem(" ");
            box1.addItem("SOFA-$1000");
            box1.addItem("ITALIAN CHAIR-$1,200");
            box1.addItem("KING SIZED BED-$1,500");
            box1.addItem("STANDARD OFFICE DESK-$2,500");

            b1 = new JButton("Save");
            b2 = new JButton("Exit");
            b3 = new JButton("Insert");

        }

    }

    public void addComponent() {
        setSize(800, 500);
        setVisible(true);
        setTitle("Create New Ticket");
        setLocationRelativeTo(null);
        setLayout(null);
        l1.setBounds(300, 10, 200, 20);
        add(l1);

        l2.setBounds(200, 50, 100, 10);
        add(l2);

    t1.setBounds(310,50,80,20);
          add(t1);
        l3.setBounds(30, 90, 120, 10);
        add(l3);

        t2.setBounds(160, 90, 120, 20);
        add(t2);

        l9.setBounds(400, 90, 120, 10);
        add(l9);

        t3.setBounds(530, 90, 120, 20);
        add(t3);

        l4.setBounds(30, 130, 120, 10);
        add(l4);

        t4.setBounds(160, 130, 120, 20);
        add(t4);

        l5.setBounds(400, 130, 120, 10);
        add(l5);

        area1.setBounds(530, 130, 120, 60);
        add(area1);

        l6.setBounds(300, 210, 120, 10);
        add(l6);

        l7.setBounds(30, 320, 120, 10);
        add(l7);

        area3.setBounds(160, 320, 200, 60);
        add(area3);

        l8.setBounds(30, 280, 120, 10);
        add(l8);

        box1.setBounds(160, 280, 170, 20);
        add(box1);

        l10.setBounds(400, 280, 120, 20);
        add(l10);

        t5.setBounds(470, 280, 40, 20);
        add(t5);

        b3.setBounds(470, 320, 100, 30);
        add(b3);

        l11.setBounds(550, 280, 40, 20);
        add(l11);

        t6.setBounds(600, 280, 90, 20);
        add(t6);

        b1.setBounds(290, 400, 100, 30);
        add(b1);

        b2.setBounds(400, 400, 100, 30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        // String n3;
        int n3;
        String n4;
        if (ae.getActionCommand() == "Exit") {
            System.exit(0);
        }
        if (ae.getActionCommand() == "Insert") {
            n1 = Integer.parseInt(t5.getText());
            n3 = box1.getSelectedIndex();

            if (n3 == 1) {
                n3 = 1000;
                int temp = n1 * n3;
                t6.setText("" + temp);

            }
            if (n3 == 2) {
                n3 = 1200;
                int temp = n1 * n3;
                t6.setText("" + temp);

            }

            if (n3 == 3) {
                n3 = 1500;
                int temp = n1 * n3;
                t6.setText("" + temp);

            }
            if (n3 == 4) {
                n3 = 2500;
                int temp = n1 * n3;
                t6.setText("" + temp);

            }
        }

        if (ae.getActionCommand() == "Save") {
            Pattern Mypattern = Pattern.compile("^[a-z]+[a-z.0-9-]+@[a-z]+(\\.[a-z]+[a-z]+)([/?].*)?$");
            Matcher Mymatcher = Mypattern.matcher(t3.getText());
            Boolean Myboolean = Mymatcher.matches();

            Pattern Mypattern1 = Pattern.compile("^[0-9]+[0-9]");
            Matcher Mymatcher1 = Mypattern1.matcher(t4.getText());
            Boolean Myboolean1 = Mymatcher1.matches();
            if (Myboolean == true) {
                if (Myboolean1 == true) {
                    if (!t1.getText().equals("")) {
                        try {
                            stat = con.prepareStatement("INSERT INTO SALESORDER (TICKETID,NAME, EMAIL, PHONE, ADDRESS,ITEM, QUANTITY, PRICE, DESCRIPTION) VALUES(?,?,?,?,?,?,?,?,?)");
                            String id =t1.getText();
                            String pid = t2.getText();
                            String pname = t3.getText();
                            String pphone = t4.getText();
                            String padd = area1.getText();
                            String pItem = box1.getSelectedItem().toString();
                            String pcity = t5.getText();
                            String pstate = t6.getText();
                            String pzip = area3.getText();
                            
                            stat.setString(1, id);
                            stat.setString(2, pid);
                            stat.setString(3, pname);
                            stat.setString(4, pphone);
                            stat.setString(5, padd);
                            stat.setString(6, pItem);
                            stat.setString(7, pcity);
                            stat.setString(8, pstate);
                            stat.setString(9, pzip);

                            stat.executeUpdate();
                           
                            //t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t4.setText("");
                            area1.setText("");
                            box1.setSelectedItem("");
                            t5.setText("");
                            t6.setText("");
                            area3.setText("");

                            JOptionPane.showMessageDialog(this, "Information has been inserted.", "Information", JOptionPane.INFORMATION_MESSAGE);

                            int n = JOptionPane.showConfirmDialog(this, "Do you want to Make Another Order?", "Information", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (n == JOptionPane.YES_OPTION) {
                              
                                  //t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t4.setText("");
                            area1.setText("");
                            box1.setSelectedItem("");
                            t5.setText("");
                            t6.setText("");
                            area3.setText("");
                                
                               

                            } else {
                                 Search sc = new Search();
                           sc.Search();
    
                                this.dispose();

                            }
                        } catch (Exception e) {

                            String msg = e.getMessage();

                            if (e.getMessage().equals(msg)) {
                                JOptionPane.showMessageDialog(this, "Record already exists.", "Warning Message", JOptionPane.WARNING_MESSAGE);
                               t1.setText("");
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                area1.setText("");
                                t5.setText("");
                                t6.setText("");
                                area3.setText("");
                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please fill the details properly.", "Error Message", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "incorrect phone number");
                    JOptionPane.showMessageDialog(this, "Please fill the details properly.", "Error Message", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(this, " Email-id is incorrect");
                JOptionPane.showMessageDialog(this, "Please fill the details properly.", "Error Message", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public static void main(String[] args) {
        SalesOrder sd = new SalesOrder();
        sd.addComponent();
    }
}
