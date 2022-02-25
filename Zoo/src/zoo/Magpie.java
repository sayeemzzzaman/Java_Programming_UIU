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
class Magpie extends Bird{
    Magpie(){
    System.out.println("A magpie is created.");
    }
    @Override
    void fly(){
    System.out.println("Magpie is flying...");
    }
    void fly(int speed){
    System.out.println( "Magpie is flying at speed: "
    + speed);
    }
    @Override
    void eat(){
    System.out.println( "Magpie is eating.");
    }
    }
