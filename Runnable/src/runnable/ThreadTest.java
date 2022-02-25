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
public class ThreadTest implements Runnable {
    public void run() {
            for (int i = 0; i < 20; i++) {
            System.out.println(
            Thread.currentThread().getName() + " " + i);
            try {
            Thread.sleep(30);
            } catch (InterruptedException e) {
            e.printStackTrace();
           }
        }
    }
}