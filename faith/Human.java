/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faith;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author ATU FAITH
 */
public class Human extends JFrame implements ActionListener{
    
    JButton restart =new  JButton("Restart"); 
    JButton quit =new  JButton("Am Done"); 
    JLabel won=new JLabel("Hey You Won");
    JFrame jeg= new JFrame();

    ImageIcon human= new ImageIcon(this.getClass().getResource("Human.png"));
  

    public Human(){
        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         jeg.setLocationRelativeTo(null);
        
        won.setBounds(300,300,400,70);
        won.setFont(new Font("serif", Font.BOLD, 50));
        jeg.add(won);
        
        quit.setBounds(100,150,200,40);
        jeg.add(quit);
        
         restart.setBounds(80,150,200,40);
        jeg.add(restart);
        
               restart.addActionListener(this);
                 quit.addActionListener(this);
                 
                
      
    }
 

     public void actionPerformed(ActionEvent e){
         
         if(e.getSource()==restart){
            
             
         }
               if(e.getSource()==quit){
                   System.exit(0);
               }
     }
}


