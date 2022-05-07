/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronizationlecture;

/**
 *
 * @author Sayeem
 */
public class Caller implements Runnable{
    Thread t;
    String msg;
    CallMe target;
    
    public Caller(String msg, CallMe target){
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        target.call(msg);
    }
    
//    @Override
//    public void run(){
//        synchronized(target){ //synchronize block
//            target.call(msg);
//            target.call2();
//        }
//    }
}
