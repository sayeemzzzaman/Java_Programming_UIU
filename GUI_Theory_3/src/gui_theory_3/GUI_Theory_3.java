/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_theory_3;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sayeem
 */
public class GUI_Theory_3 {

    /**
     * Flow layout adds left to right
     * Border layout divides full frame into 5 parts
     * 
     */
    public static void main(String[] args) {
            JFrame frame = new JFrame("My Title");
            //frame.setTitle("My Title);
            frame.setSize(400, 150); //width , height
            //frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); //right alignment
            frame.setResizable(true); //disabling resizing


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
//            JPanel panel = new JPanel();
//            panel.setLayout(new FlowLayout(FlowLayout.LEFT)); //left alignment 
//            JButton b1 = new JButton("Button 1");
//            JButton b2 = new JButton("Button 2");
//            JButton b3 = new JButton("Button 3");
//            
//            panel.add(b1);
//            panel.add(b2);
//            panel.add(b3);
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            JButton b1 = new JButton("NORTH");
            JButton b2 = new JButton("SOUTH");
            JButton b3 = new JButton("CENTER");
            JButton b4 = new JButton("EAST");
            JButton b5 = new JButton("WEST");

            JButton m5 = new JButton("M-NORTH");
            JButton m6 = new JButton("M-CENTER");
            JButton m7 = new JButton("M-SOUTH");
            panel.add(m5 , BorderLayout.NORTH);
            panel.add(m6 , BorderLayout.CENTER);
            panel.add(m7 , BorderLayout.SOUTH);


            
            frame.add(b1, BorderLayout.NORTH);
            frame.add(b2, BorderLayout.SOUTH);
            frame.add(panel, BorderLayout.CENTER);
            frame.add(b4, BorderLayout.EAST);
            frame.add(b5, BorderLayout.WEST);

            frame.setVisible(true);
    }
    
}
