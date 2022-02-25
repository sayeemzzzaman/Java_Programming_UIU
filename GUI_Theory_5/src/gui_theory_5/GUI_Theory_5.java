/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_theory_5;
import javax.swing.*;
/**
 *
 * @author sayeem
 */
public class GUI_Theory_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            JFrame frame = new JFrame("Null Layout");
            //frame.setTitle("Null Layout);
            frame.setSize(300, 300); //width , height
            frame.setLayout(null); 
           // frame.setResizable(true); //disabling resizing
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JButton button1 = new JButton("Button 1");
            int x = 50;  //changing x will move the component left or right
            int y = 30;  //changing y will move the component up or down
            int width = 160; //changes the width of the component
            int height = 80; //changes the height of the component
            button1.setBounds(x, y, width , height);
            
            JButton button2 = new JButton("Button 2");
            button2.setBounds(x,110, width, height);
                          
            frame.add(button1);
            frame.add(button2);
            
            frame.setVisible(true);
    }
}
    

