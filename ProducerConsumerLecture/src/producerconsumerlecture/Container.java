/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerlecture;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sayeem
 */
public class Container {
    int n;
    boolean empty = true;
    
    synchronized void put(int n){
        if(!empty){
            try {
                wait(); //producer thread waiting
            } catch (InterruptedException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.n = n;
        System.out.println("Put " + n + " into the container.");
        empty = false;
        notify(); //notifies the consumer to stop waiting
    }
    
    synchronized int get(){
        if(empty){
            try {
                wait(); //consumer waiting
            } catch (InterruptedException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        empty = true;
        notify();
        System.out.println("Got " + n + " from the container.");
        return n;
    }
}
