/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joinlecture;

/**
 *
 * @author Jannat
 */
public class SumThread implements Runnable{
    
    int[]a;
    int l,r,sum;
    Thread t;
    
    @Override
    public void run(){
        for(int i=l; i<=r; i++){
            sum+= a[i];
        }
    }
    
    public SumThread(String threadName, int[] a, int l, int r){
        t = new Thread(this);
        t.setName(threadName);
        this.a = a;
        this.l = l;
        this.r = r;
        sum = 0;
        t.start();
    }
    
}
