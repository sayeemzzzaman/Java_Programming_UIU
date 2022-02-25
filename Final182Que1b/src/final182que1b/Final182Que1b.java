/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final182que1b;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sayeem
 */
public class Final182Que1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(150,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton Button_1 = new JButton("Button_1");
        JButton Button_2 = new JButton("Button_2");
        
        Button_1.setBackground(Color.red);
        Button_2.setBackground(Color.blue);

        JPanel panel = new JPanel();
        panel.add(Button_1);
        panel.add(Button_2);
        frame.add(panel);
        
        Button_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Button_1.getBackground().equals(Color.red)){
                    Button_1.setBackground(Color.green);
                }
                else if(Button_1.getBackground().equals(Color.green)){
                    Button_1.setBackground(Color.red);
                }
            }
        });
        
        Button_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Button_2.getBackground().equals(Color.blue)){
                    Button_2.setBackground(Color.cyan);
                }
                else if(Button_2.getBackground().equals(Color.cyan)){
                    Button_2.setBackground(Color.blue);
                }
            }
        });
        
        frame.setVisible(true);
    }
    
}
