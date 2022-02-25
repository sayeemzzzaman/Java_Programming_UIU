
package gui_theory;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author sayeem
 */
public class GUI_Theory {

   
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Title");
        //frame.setTitle("My Title);
        frame.setSize(300, 400); //width , height
        frame.setResizable(false); //disabling resizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //14 to 17 line must have to write for every frame
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK); //setting the bg color
        
//        Color c = new Color(30 , 125, 162);
//        panel.setBackground(c);

        JButton button = new JButton("CLick!");
        //button.setText("Click!");
        button.setBackground(Color.red); //buttons bg color
        button.setForeground(Color.blue); //button's text color
        
        //frame.add(button); //adding the button directly to frame
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
