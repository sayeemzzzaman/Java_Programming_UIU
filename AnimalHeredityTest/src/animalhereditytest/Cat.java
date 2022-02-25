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
public class Cat extends Animal {
    private String color;
    
    Cat(String color, double noOfLegs, boolean vegetarian, boolean eats)
    {
        super(noOfLegs,vegetarian,eats);
        this.color = color;
    }
    String getColor()
    {
        return color;
    }
    
}
