/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final192que2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author sayeem
 */
public class Final192Que2 extends JFrame{

    private JTextField both;
    private JButton upCounter , downCounter , reset;
    private Container c;
    public Final192Que2(){
        //setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Counter");
        setBounds(0,0,500,250);
        c = getContentPane();
        c.setLayout(null);
        both = new JTextField("0");
        both.setBounds(200,5,100,50);
        c.add(both);
        upCounter = new JButton("UP");
        upCounter.setBounds(90,60,100,50);
        c.add(upCounter);
        downCounter = new JButton("Down");
        downCounter.setBounds(200,60,100,50);
        c.add(downCounter);
        reset = new JButton("Reset");
        reset.setBounds(310,60,100,50);
        c.add(reset);
        upCounter.addActionListener(new actionHandler());
        downCounter.addActionListener(new actionHandler());
        reset.addActionListener(new actionHandler());
        upCounter.setActionCommand("up");
        downCounter.setActionCommand("down");
        reset.setActionCommand("reset");
        setVisible(true);
        
    }
    class actionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            
            int counter = Integer.valueOf(both.getText());
            if(e.getActionCommand().equals("up")){
                counter++;
                both.setText(counter+ "");
            }
            if(e.getActionCommand().equals("down")){
                counter--;
                both.setText(counter+ "");
            }
            if(e.getActionCommand().equals("reset")){
                both.setText("0");
            }
        }
    }
        public static void main(String[] args) {
            new Final192Que2();
        }

}
