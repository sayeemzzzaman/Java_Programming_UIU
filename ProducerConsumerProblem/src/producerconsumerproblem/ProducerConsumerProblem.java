/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

/**
 *
 * @author sayeem
 */
public class ProducerConsumerProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container container = new Container();
        Producer p = new Producer(container);
        Consumer c = new Consumer(container);
    }
    
}
