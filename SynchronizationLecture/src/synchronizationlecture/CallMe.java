package synchronizationlecture;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sayeem
 */
public class CallMe {
    public synchronized void call(String msg){
        System.out.print("[");
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(CallMe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(msg);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(CallMe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.print("]");
    }
    
//    public void call2(){
//        System.out.print("]");
//    }
}
