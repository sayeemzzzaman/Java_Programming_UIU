/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final193que3;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author sayeem
 */
public class Final193Que3 {

   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Application");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JButton b1 = new JButton("header");
        JButton b2 = new JButton("footer");
        JButton b3 = new JButton("contents");
        JButton b4 = new JButton("ads");
        JButton b5 = new JButton("links");
        
        panel.add(b1, BorderLayout.NORTH);
        panel.add(b2, BorderLayout.SOUTH);
        panel.add(b3, BorderLayout.CENTER);
        panel.add(b4, BorderLayout.EAST);
        panel.add(b5, BorderLayout.WEST);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
