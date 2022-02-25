/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final183que3;

import java.awt.event.*;
import javax.swing.*;


public class Final183Que3 {

   
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(220,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        JTextField textField1 = new JTextField(12);
        JTextField textField2 = new JTextField(12);
        JButton convert = new JButton("Convert");
        JLabel usd = new JLabel("USD");
        JLabel euro = new JLabel("Euro");
        
        JPanel p1 = new JPanel();
        p1.add(textField1);
        p1.add(usd);
        
        JPanel p2 = new JPanel();
        p2.add(convert);
        
        JPanel p3 = new JPanel();
        p3.add(textField2);
        p3.add(euro);
        
        JPanel main = new JPanel();
        main.add(p1);
        main.add(p2);
        main.add(p3);
        frame.add(main);
        
        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double d = Double.valueOf(textField1.getText()) * 0.88;
                textField2.setText(String.valueOf(d));
            }
        });

        frame.setVisible(true);
        
    }
    
}
