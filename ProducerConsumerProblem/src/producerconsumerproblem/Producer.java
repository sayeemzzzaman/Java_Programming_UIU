/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sayeem
 */
public class Producer implements Runnable{
    Container container;
    Thread t;
    
    Producer(Container container){
        this.container = container;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        Random rd = new Random();
        int random = rd.nextInt(100);
        container.put(random);
//        try {
//            t.sleep(2000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
