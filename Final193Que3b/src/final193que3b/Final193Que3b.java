/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final193que3b;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sayeem
 */
public class Final193Que3b implements ActionListener{

    JButton flip, rotate;
    JTextField text;
    Final193Que3b(){
        JFrame frame = new JFrame("EditMe");
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        frame.setSize(280, 150);
        frame.setLocation(300, 200);
        text = new JTextField(10);
        text.setText(">");
        flip = new JButton("Flip");
        rotate = new JButton("Rotate");
        panel.add(flip);
        panel.add(rotate);
        panel.add(text);
        //panel.setBackground(Color.red);
        flip.addActionListener(this);
        rotate.addActionListener(this);
        flip.setActionCommand("flipAction");
        rotate.setActionCommand("rotateAction");
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("flipAction")){
            text.setText(flipMe(text.getText()));
        }
        //
        if(e.getActionCommand().equals("rotateAction")){
        text.setText(rotateMe(text.getText()));
        }
    }
    static String flipMe(String text) {
        if (text.equals(">")) return "<";
        if (text.equals("<")) return ">";
        return text;
    }

    static String rotateMe(String text){
        if(text.equals(">")) return "v";
        if(text.equals("v")) return "<";
        if(text.equals("<")) return "^";
        if(text.equals("^")) return ">";
        return text;
    }
    public static void main(String[] args) {
        new Final193Que3b();
    }
   
    
    
}
