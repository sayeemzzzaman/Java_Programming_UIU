/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sayeem
 */
public class Consumer implements Runnable{
    Container container;
    Thread t;
    
    public Consumer(Container container){
        this.container = container;
        t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run(){
        while(true){
            container.get();
//            try {
//                t.sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
}
