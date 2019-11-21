/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.newpackage;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author oladele
 */
public class Search extends ViewSalesOrder implements ActionListener{
    JLabel search1,salesID,result ;
     ResultSet rs ;
    Statement stmt;
    PreparedStatement stat;
    java.sql.Connection con ;
    JButton search,view,generate,g1,g2;
    JTextField sd1,sdd,l1;
    JFrame f1;
    
    public void Search(){
        f1 = new JFrame(" SEARCH");
          f1.setSize(500,350);
  f1. setBackground(Color.BLUE);
        f1.setVisible(true);
            f1.setLayout(null);
             f1.setLocationRelativeTo(null);
              
        
        
        search1=new JLabel("SEARCH FOR SALES ORDER");
        search1.setBounds(180, 10, 200, 30);
        f1.add(search1);
        
        salesID=new JLabel("SALES ID: ");
        salesID.setBounds(180, 70,70, 30);
        f1.add(salesID);
        
       sd1=new JTextField("SALES ID ");
        sd1.setBounds(250, 70, 70, 30);
        f1.add(sd1);
        
        search=new JButton("SEARCH");
        search.setBounds(200, 140, 150, 30);
        f1.add(search);
        
        result=new JLabel("RESULT FOR SALES ID: ");
        result.setBounds(100, 180, 150, 30);
        f1.add(result);
        
         sdd=new JTextField();
        sdd.setBounds(250, 180, 130, 30);
        f1.add(sdd);
        
       sdd.setEditable(false);
      
        l1=new JTextField();
        l1.setBounds(50, 250, 80, 30);
       f1.add(l1);
        
     
    //l1.setEditable(false);
    
     g1=new JButton("VIEW");
        g1.setBounds(150, 250, 100, 30);
        f1.add(g1);
        
         g2=new JButton("GENERATE INVOICE");
        g2.setBounds(280, 250, 150, 30);
        f1.add(g2);
    
    search.addActionListener(this);    
       g2.addActionListener(this); 
        g1.addActionListener(this); 
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "GENERATE INVOICE") {
              SalesOrder sd = new SalesOrder();
        sd.addComponent();
        dispose();
        }
      if (e.getActionCommand() == "VIEW") {

      // vso.jButton2=g1;
                   String sql = ("Select * from SALESORDER ");
        }
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         //   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=netbeans;user=mide;password=1234");   
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/Esuola", "Oladele", "Dele");

         stat = con.prepareStatement("Select * from SALESORDER where TICKETID = ?");
          stat.setString(1, l1.getText());
        
            rs = stat.executeQuery();
          
            if(rs.next ()){
                 
                JOptionPane.showMessageDialog(null,"TICKETID IS VALID");
                System.out.println("e dey work o");
                 ViewSalesOrder vso  =new ViewSalesOrder();
           //      vso.ViewSalesOrder();
                vso.jTextField1.setText( rs.getString("TICKETID"));
                vso.jTextField3.setText(rs.getString("NAME"));
               vso.jTextField4.setText( rs.getString("PHONE"));
               vso.jTextArea1.setText( rs.getString("ADDRESS"));
               vso.TABLE.getColumn(rs.getString("ITEM"));
               vso.TABLE.getColumn( rs.getString("QUANTITY"));
               vso.TABLE.getColumn( rs.getString("PRICE"));
               vso.TABLE.getColumn( rs.getString("DESCRIPTION"));
               
            }
            else {
                JOptionPane.showMessageDialog(null,"Incorrect Details");
                sd1.setText("");
              
                
               
            }
            }
            
            catch (Exception ex){
JOptionPane.showMessageDialog(null,ex);


}  
          
          
          
      
        if (e.getActionCommand() == "SEARCH") {
            String sql = ("Select * from SIGNUPDETAILS  where Username = ? and Password = ?");
        }
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         //   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=netbeans;user=mide;password=1234");   
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/Esuola", "Oladele", "Dele");

         stat = con.prepareStatement("Select * from SALESORDER where TICKETID = ?");
            stat.setString(1, sd1.getText());
        
            rs = stat.executeQuery();
            if(rs.next ()){
                JOptionPane.showMessageDialog(null,"TICKETID IS VALID");
                sdd.setText(""+ rs.getString(1));
                l1.setText(""+ rs.getString(1));
               
            }
            
            else {
                JOptionPane.showMessageDialog(null,"Incorrect Details");
                sd1.setText("");
              
                
               
            }
            }
            
            catch (Exception ex){
JOptionPane.showMessageDialog(null,ex);


}
     }  
                 public static void main(String [] args){
                           Search sc = new Search();
                           sc.Search();
    
}
}
        
        
        
    

