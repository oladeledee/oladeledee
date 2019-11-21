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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javafx.scene.*;

        
public class menu extends JFrame implements ActionListener {
    
    JButton jb1;
        JButton jb2;
        
        public menu(){
            
            setSize (300,250);
                setLayout(null);
                    setVisible(true);
                      setBackground(Color.BLUE);
                       setLocationRelativeTo(null);
                      
            jb1 = new JButton("CREATE SALES ORDER");
                    jb1.setBounds(27,25,200,30);
                            add(jb1);
                            
                                jb2 = new JButton("VEIW SALES ORDER");
                                        jb2.setBounds(27,88,200,30);
                                                add(jb2);
                                                
                                                jb1.addActionListener(this);
                                                    jb2.addActionListener(this);
                                                    
        }
                         public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == jb1)
        {
             SalesOrder sd = new SalesOrder();
             sd.addComponent();
             dispose();
        }
    }
        public static void main(String[] args){
            menu m = new menu();
        }
}

