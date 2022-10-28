/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sayeem
 */
public class Container {
    int array[] = new int[5];
    int counter = 0;
    synchronized void put(int counter){
        
        if(counter == 5){
            try {
                //System.out.println("inside max");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.counter = counter;
        Random rd = new Random();
        int random = rd.nextInt(100);
        array[counter] = random;
        System.out.println("Producing " + array[counter] + " into the container");
        //counter++;
        notify();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    synchronized int get(){
        if(counter<0){
            try {
                //System.out.println("inside empty");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        counter--;
        notify();
        System.out.println("Consuming " + array[counter] + " from the container");
        //int newArr[] = Arrays.copyOf(array, array.length - 1);
        
        //System.out.println(array.length);
        
       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return array[counter];
    }
}
