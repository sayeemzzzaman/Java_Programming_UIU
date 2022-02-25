/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1.pack2;
import pack1.*;
/**
 *
 * @author sayeem
 */
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Cart");
    System.out.println( v.name);
    Car c=new Car("BMW",101);
    c.print();
    Bike b=new Bike("Pulsar",102);
    b.print();
    }
}
