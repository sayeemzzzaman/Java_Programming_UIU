/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerlecture;

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
        }
    }
}
