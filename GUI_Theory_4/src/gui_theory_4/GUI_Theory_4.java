/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_theory_4;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sayeem
 */
public class GUI_Theory_4 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame("My Title");
            //frame.setTitle("My Title);
            frame.setSize(200, 300); //width , height
            int rows = 4;
            int cols = 3;
            frame.setLayout(new GridLayout(rows, cols)); //we must have to give rows,cols as parameter
            frame.setResizable(true); //disabling resizing


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            


            JButton b1 = new JButton("NORTH");
            JButton b2 = new JButton("SOUTH");
            JButton b3 = new JButton("CENTER");
            JButton b4 = new JButton("EAST");
            JButton b5 = new JButton("WEST");
            JButton m5 = new JButton("M-NORTH");
            JButton m6 = new JButton("M-CENTER");
            JButton m7 = new JButton("M-SOUTH");
            
//            frame.add(b1);
//            frame.add(b2);
//            frame.add(b3);
//            frame.add(b4);
//            frame.add(b5);
//            frame.add(m5);
//            frame.add(m6);
            //frame.add(m7);
            
            for(int label =1; label<=12 ; label++){
                frame.add(new Button(String.valueOf(label)));
            }


            frame.setVisible(true);
    }
    
}
