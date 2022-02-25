/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_theory_2;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sayeem
 */
public class GUI_Theory_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Title");
            //frame.setTitle("My Title);
            frame.setSize(400, 150); //width , height
            frame.setResizable(false); //disabling resizing
            //frame.setLayout(new FlowLayout()); //Changing layout, for this we don't have to use the main panel
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            JPanel p1 = new JPanel();
            JLabel label = new JLabel("Label1");
            JTextField textField = new JTextField(12); //panel for label & textfield

            p1.add(label);
            p1.add(textField);
            
            JButton b1 = new JButton("Button 1");
            JButton b2 = new JButton("Button 2");
            JButton b3 = new JButton("Button 3");
            JPanel p_button = new JPanel(); //panel for buttons
            p_button.add(b1);
            p_button.add(b2);
            p_button.add(b3);

            JPanel panel = new JPanel(); //main panel
            panel.add(p1);
            panel.add(p_button);
            
            
            //frame.add(p1); //using flowlayout
            //frame.add(p_button); // using flowlayout
            
            frame.add(panel);
            frame.setVisible(true);
    }
    
}
