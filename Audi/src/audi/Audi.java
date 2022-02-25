/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audi;

/**
 *
 * @author sayeem
 */
public class Audi extends Car{


    public Audi() {
        this.model = "0";
        this.color = "0";
        this.maxSpeed = 0;
    }
    
    @Override
    public void accelerate(){
        System.out.println("Accelerates!");
    }
    @Override
    public void brake(){
        System.out.println("Brake!");
    }
    
}
