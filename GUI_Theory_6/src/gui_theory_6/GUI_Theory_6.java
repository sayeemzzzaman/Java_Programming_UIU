/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_theory_6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author sayeem
 */
/*public class GUI_Theory_6 {
    
    JFrame frame;
    JTextField textField;
    
    public GUI_Theory_6(){
        frame = new JFrame("Counter");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Counter"));
        textField = new JTextField(10);
        frame.add(textField);
        textField.setText("0");
        JButton b = new JButton("Count");
        frame.add(b);
        b.addActionListener(new CounterAction());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Theory_6();
    }
    
    public class CounterAction implements ActionListener{ //innerclass method
        public void actionPerformed(ActionEvent e){
            String text  = textField.getText();
            int newVal = Integer.parseInt(text) + 1;
            textField.setText(newVal + "");
            //textField.setText(Integer.parseInt(textField.getText())+ 1 + "");
        }
    }
    
}*/

/*public class GUI_Theory_6 implements ActionListener{
    JFrame frame;
    JTextField textField;
    
    public GUI_Theory_6(){
        frame = new JFrame("Counter");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Counter"));
        textField = new JTextField(10);
        frame.add(textField);
        textField.setText("0");
        JButton b = new JButton("Count");
        frame.add(b);
        b.addActionListener(this); //calling the class reference
        frame.setVisible(true);
    }
    
        public static void main(String[] args) {
            new GUI_Theory_6();
        }
        
        
        public void actionPerformed(ActionEvent e) { //used as a method
            String text = textField.getText();
            int newVal = Integer.parseInt(text) + 1;
            textField.setText(newVal + "");
        }
}*/

public class GUI_Theory_6{
    JFrame frame;
    JTextField textField;
    
    public GUI_Theory_6(){
        frame = new JFrame("Counter");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Counter"));
        textField = new JTextField(10);
        frame.add(textField);
        textField.setText("0");
        JButton b = new JButton("Count");
        frame.add(b);
        b.addActionListener(new ActionListener(){ //action listener directly used using anonymous class
            public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            int newVal = Integer.parseInt(text) + 1;
            textField.setText(newVal + "");
            }
        });
        
        JButton b1 = new JButton("Decrement");
        frame.add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text = textField.getText();
                int v = Integer.parseInt(text) - 1;
                textField.setText(v + "");
            }
        });
        frame.setVisible(true);
    }
    
        public static void main(String[] args) {
            new GUI_Theory_6();
        }
 
}

