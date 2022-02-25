/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1.pack2;
import pack1.*;
public class Car extends Vehicle {
    public Car(String name, int id){
    super(name);
    this.id=id;
 }
 void print(){
 System.out.println(name + " " + id);
 }
}
