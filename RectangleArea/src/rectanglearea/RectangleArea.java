/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglearea;
import java.util.Scanner;
/**
 *
 * @author sayeem
 */
public class RectangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj1 = new Area();
        
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        
        obj1.setDim(length,breadth);
        System.out.println(obj1.getArea());
        
    }
    
    

    
    
}
