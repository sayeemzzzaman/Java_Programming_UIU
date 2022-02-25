/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

    public class Bike extends Vehicle {
     public Bike(String name, int id){
         super(name);
         this.id=id;
    }
   public void print(){
        System.out.println(name+ " " + id);
    }
}
    

