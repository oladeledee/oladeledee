/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.newpackage;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author oladele
 */
public class SIGNUP  extends JFrame{
  
JButton option1;
JButton option2;
JButton option3;
JLabel name,name1,name2;
JTextArea Result;
public SIGNUP (){
    option1 = new JButton("LOG IN");
    option1.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
        login el= new login();
     }
});
option2=new JButton("SIGN UP");
      option2.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e){  
        
       personaldetails pd=new personaldetails();
      
                    }
}
              );
option3=new JButton("Exit");
option3.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
   
    System.exit(0);
}
});

name1=new JLabel("Welcome");
name1.setFont(new Font("Serif",Font.ITALIC,27));


name2=new JLabel("TO");
name2.setFont(new Font("Serif",Font.ITALIC,15));

name=new JLabel("Numero Uno Interiors");
name.setFont(new Font("Serif",Font.ITALIC,27));

setTitle("ORDERING AND INVOICING ");
setSize(400,250);
setResizable(false);
setVisible(true);
 setLocationRelativeTo(null);
}
public void addcomponent(){
    setLayout(new GridBagLayout());
    GridBagConstraints c= new GridBagConstraints();
    c.gridx=0;
    c.gridy=0;
    c.weighty=0.1;
    c.anchor=c.CENTER;
    add(name1,c);
    
    c.gridx=0;
    c.gridy=1;
    c.weighty=0.1;
    c.anchor=c.CENTER;
    add(name2,c);
    
     c.gridx=0;
    c.gridy=2;
    c.weighty=0.1;
    c.anchor=c.CENTER;
    add(name,c);
    
    c.gridx=0;
    c.gridy=3;
    c.fill=c.HORIZONTAL;
    add(option1,c);
    
      c.gridx=0;
    c.gridy=4;
    c.fill=c.HORIZONTAL;
    add(option2,c);
    
      c.gridx=0;
    c.gridy=5;
    c.fill=c.HORIZONTAL;
    add(option3,c);
    
    
}

     
public static void main (String[]args){
SIGNUP SN=new SIGNUP();
SN.addcomponent();

}
}
   
 

