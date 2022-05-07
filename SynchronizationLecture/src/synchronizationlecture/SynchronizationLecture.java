/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package synchronizationlecture;

/**
 *
 * @author Jannat
 */
public class SynchronizationLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller t1 = new Caller("Hellooo", target);
        Caller t2 = new Caller("Synchronized", target);
        Caller t3 = new Caller("World", target);
    }
    
}
