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
    synchronized void put(int random){
        if(counter == 5){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        array[counter] = random;
        System.out.println("Producing " + array[counter] + " into the container");
        counter++;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
        }
        notify();
    }
    
    synchronized int get(){
        if(counter==0){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        notify();
        
        System.out.println("Consuming " + array[counter-1] + " from the container");
        int newArr[] = Arrays.copyOf(array, array.length - 1);
        //counter--;
        System.out.println(counter);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array[counter];
    }
}
