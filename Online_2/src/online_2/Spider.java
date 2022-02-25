/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_2;

/**
 *
 * @author sayeem
 */
public class Spider extends Animal {
    public Spider(){
        super("Spider",8);
    }
    @Override
    public void eat(){
        System.out.println("Spider eats insects.");
    }
}
