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
abstract class Car {
    protected String model,color;
    protected int maxSpeed;
    
    abstract void accelerate();
    abstract void brake();
}
