
package divideconquersorting;

import java.util.Arrays;

/**
 *
 * @author sayeem
 */
public class SortThread implements Runnable{
    int[]array;
    int l,r;
    Thread t;
    
    @Override
    public synchronized void run(){
        System.out.println(t.getName() + " sorting array from index " + l + " to " + r);
            Arrays.sort(array, l, r+1);
    }
    
    public SortThread(int[] array, int l, int r){
        t = new Thread(this);
        this.array = array;
        this.l = l;
        this.r = r;
        t.start();
    }
}
