/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faith;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;
import java.awt.ComponentOrientation;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;
import javax.swing.border.LineBorder;
import javax.swing.Timer;

public class Player extends FAITH implements ActionListener{
    
    JButton option1;
    JButton option2;
    JButton option3;

    JTextField names;
    JLabel name;
    
    public Player(){
        option1=new JButton("Play Game");
         option1.addActionListener(this);
         option2=new JButton("View Instructions");
         option2.addActionListener(this);
         option3= new JButton("Exit");
         option3.addActionListener(this);
           name=new JLabel("QuickSpark");
           name.setFont(new Font("Serif",Font.ITALIC,24));
         setTitle("QuickSpark");
         setSize(400,350);
         setResizable(false);
         setVisible(true);
          setLocationRelativeTo(null);
      //  names= new JTextField("enter your name");
    }
    StringBuffer nameBuffer = new StringBuffer();
    public void nameCheck(){
        nameBuffer.append(PlayerName);
        
    }
      
    public void addComponent(){
               setLayout(null);
               name.setBounds(60,20,150,30);
               add(name);
               option1.setBounds(40,60,150,40);
               add(option1);
               option2.setBounds(40,120,150,40);
               add(option2);
               option3.setBounds(40,180,150,40);
               add(option3);
              setResizable(false);
              
   
    }
     public void actionPerformed(ActionEvent e){
              
              if(e.getSource()==option1){
               JOptionPane.showInputDialog("your name");
               nameCheck();
               FAITH f=  new FAITH();
               f.FAITH();
               setVisible(false);
}
              else if(e.getSource()==option2){
                    
               JOptionPane.showMessageDialog(this,"1.Select a kingdom"
             + "\n2.Play in  sequence."
              +"\n3.game is played at random" ,
                "Instructions",JOptionPane.INFORMATION_MESSAGE);
                
          }
              else if(e.getSource()==option3){
                        System.exit(0);
                        
                  
              }
              
              
          }
     public static void main(String []args){
         Player p= new Player();
         p.addComponent();
     }
}
