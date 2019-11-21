/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class personaldetails extends JFrame  implements ActionListener {
    JLabel FirstNAme,LastName,SIGNUP,USERNAME,password;
    JTextField FS,LS,P,US;
    JButton SAVE;
    java.sql.Connection con ;
    ResultSet rs ;
    Statement stmt;
    PreparedStatement stat;
    JPanel jp,jpp;

    public  personaldetails(){
      try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/Esuola", "Oladele", "Dele");
           // con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=netbeans;user=mide;password=1234");
            stmt = con.createStatement();

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }  
        
        
   setSize(450,300);
   setBackground(Color.BLUE);
   setVisible(true);
   setLayout(null);
   setLocationRelativeTo(null);
            
    SIGNUP=new JLabel("REGISTER");
    SIGNUP.setBounds(170,10,100,50);
    add(SIGNUP);
            
    FirstNAme = new JLabel("FirstName:");
    FirstNAme.setBounds(13,57,70,10);
    add(FirstNAme);
            
FS = new JTextField();
        FS.setBounds(80,55,100,20);
                add(FS);
                
LastName = new JLabel("LastName:");
        LastName.setBounds(230,57,80,10);
            add(LastName);
 
LS = new JTextField();
        LS.setBounds(300,55,100,20);
                add(LS);
                
     
    USERNAME=new JLabel("UserName:");
    USERNAME.setBounds(13,90,100,13);
                add(USERNAME);
     US = new JTextField();
        US.setBounds(80,90,150,20);
                add(US);  
                
                
password = new JLabel ("Password:");
        password.setBounds(13,130,100,13);
                add(password);
                
P = new JTextField();
P.setBounds(80,130,150,20);
add(P);
          

 SAVE=new JButton("SIGNUP");
 SAVE.setBounds(120,190,150,20);
 add(SAVE);
 SAVE.addActionListener(this);   
            }
         public void actionPerformed(ActionEvent e) {
       if (e.getActionCommand() == "SIGNUP") {
            if (!FS.getText().equals("")) {
      try {
                    stat = con.prepareStatement("INSERT INTO SIGNUPDETAILS VALUES(?, ?,?,?)");
                    String firstname = FS.getText();
                    String lastname = LS.getText();
                    String Username = US.getText();
                    String Password = P.getText();
                    
                    stat.setString(1, firstname);
                    stat.setString(2, lastname);
                    stat.setString(3, Username);
                    stat.setString(4, Password);
                    
                     stat.executeUpdate();
                     
                     FS.setText("");
                     LS.setText("");
                     US.setText("");
                     P.setText("");
                     
       JOptionPane.showMessageDialog(jp, "Information has been inserted. Please Login", "Information",  JOptionPane.INFORMATION_MESSAGE);
                {
               login el = new login(); 
               this.dispose();
        }
                } catch (Exception ae) 
                {  
                    
            }
            }
            else
            {
                JOptionPane.showMessageDialog(jpp, "Please fill the details properly.", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        
            }
       
         }
                                     
    public static void main(String[]args){
        personaldetails pd=new personaldetails();
          
    
    }
           
}
