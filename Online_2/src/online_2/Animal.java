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
public abstract class Animal {
    public String name;
    public int legs;
    
    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    abstract void eat();
    public void walk(){
        System.out.println(name + " walk with " + legs + " number of legs");
    }
}
