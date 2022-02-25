/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final191que5;


import java.awt.*;
import javax.swing.*;





/**
 *
 * @author sayeem
 */
public class Final191Que5 {

    Final191Que5()
    {
        JFrame myframe; 
        myframe=new JFrame();
        myframe.setLayout(new BorderLayout());
        myframe.setTitle("Class Test!!!");
        myframe.setSize(200, 200); 
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3)); 
        JLabel cell[] = new JLabel[9];
        
        for(int i=0; i<9; i++){
             
            center.add(cell[i] = new JLabel(String.valueOf(i)));
            cell[i].setFont(new Font("Cambria", 2, 24));

        }
        JPanel top = new JPanel(); 
        top.setLayout(new GridLayout());
        JButton change = new JButton("Change");
        JButton reset = new JButton("Reset");
        top.add(change);
        top.add(reset);
        myframe.add(top, BorderLayout.NORTH); 
        myframe.add(center, BorderLayout.CENTER);
        //Set frame visibility true
        myframe.setVisible(true);
    }
    public static void main(String[] args) { 
        new Final191Que5();
    }
}


