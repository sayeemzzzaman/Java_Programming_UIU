/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalhereditytest;

/**
 *
 * @author sayeem
 */
public class AnimalHeredityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c1 = new Cat("White",4,true,true);
        System.out.println(c1.getColor());
        System.out.println(c1.getNoOfLegs());
        System.out.println(c1.getVeg());
        System.out.println(c1.getEats());
    }
    
}
