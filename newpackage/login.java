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

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class login extends JFrame implements ActionListener{
    
    JLabel lbl1,lbl2,lbl3;
    JTextField jtf1;
    JButton jb1;
    JPasswordField jp1;
    java.sql.Connection con ;
    ResultSet rs ;
    Statement stmt;
    PreparedStatement stat;
    JPanel jp,jpp;
                    
            public login()
            {
  
lbl1 = new JLabel("USERID:");
lbl1.setBounds(13,25,70,20);
add(lbl1);
                            
jtf1 = new JTextField();
jtf1.setBounds(65,25,100,20);
add(jtf1);
                                            
lbl2 = new JLabel("PASSWORD:");
lbl2.setBounds(13,60,90,10);
add(lbl2);
                                                                 
jp1 = new JPasswordField();
jp1.setBounds(90,59,100,20);
add(jp1);
                                                                                
jb1 = new JButton("LOGIN");
jb1.setBounds(100,120,100,20);
add(jb1);

setSize(350,200);
setLayout(null);
setResizable(false);
setVisible(true);
setLocationRelativeTo(null);
                                                            
jb1.addActionListener(this);
            }
         public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "LOGIN") {
            String sql = ("Select * from SIGNUPDETAILS  where Username = ? and Password = ?");
        }
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         //   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=netbeans;user=mide;password=1234");   
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/Esuola", "Oladele", "Dele");

         stat = con.prepareStatement("Select * from SIGNUPDETAILS where Username = ? and Password = ?");
            stat.setString(1, jtf1.getText());
            stat.setString(2, jp1.getText());
            rs = stat.executeQuery();
            if(rs.next ()){
                JOptionPane.showMessageDialog(null,"Login Successful");
                
                menu m = new menu();
                this.dispose();
            }
            
            else {
                JOptionPane.showMessageDialog(null,"Incorrect Details");
                jtf1.setText("");
                jp1.setText("");
                
               
            }
            }
            
            catch (Exception ex){
JOptionPane.showMessageDialog(null,ex);


}
         }
                 public static void main(String [] args){
                           login el = new login();
    
}
}
