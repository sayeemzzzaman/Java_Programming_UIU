/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author sayeem
 */
class Bird extends Animal{
    Bird(){
    System.out.println("A bird is created.");
    }
    @Override
    void fly(){
    System.out.println("Flying...");
    }
    void boo(){
    System.out.println("yooooo...");
    }
}
