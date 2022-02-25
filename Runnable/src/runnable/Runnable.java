/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable;

/**
 *
 * @author sayeem
 */
public class Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new ThreadTest("Thread 1");
        Thread t2 = new ThreadTest("Thread 2");
        // Start the threads
        t1.run(); t2.run();
        t1.combine(); t2.combine();
        // Following statement should execute
        // after all the threads are finished
        System.out.println("MAIN END");

    }
    
}
