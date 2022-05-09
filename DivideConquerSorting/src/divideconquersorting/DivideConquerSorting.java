
package divideconquersorting;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sayeem
 */
public class DivideConquerSorting {


    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int n = sc.nextInt();
        int array[] = new int[n];
        
        System.out.println("Input the numbers:");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println("Input the number of divisions: ");
        int x = sc.nextInt(); //number of divisions of the array to sort
        int k=0,b=0;
        SortThread t[] = new SortThread[x];
        for(int i=0; i<x; i++){
            
            if(b+1 == x){
                t[i] = new SortThread(array, k, array.length-1);
                break;
            }
            else {
                t[i] = new SortThread(array, k, b++);
                k = b;
            }
        }
        
        try {
            for(int i=0; i<t.length-1; i++){
                    t[i].t.join();
                    i++;
                } 
        }
        catch (Exception ex) {
                Logger.getLogger(DivideConquerSorting.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        for(int v: array){
            System.out.print(v + ", ");
        }
    }
    
}
