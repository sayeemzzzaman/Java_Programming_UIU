/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joinlecture;

/**
 *
 * @author Jannat
 */
public class JoinLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8,9};
        
        SumThread t1 = new SumThread("t1", a, 0, 2);
        SumThread t2 = new SumThread("t2", a, 3, 5);
        SumThread t3 = new SumThread("t3", a, 6, 8);
        
        try{
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        int sum = t1.sum + t2.sum + t3.sum;
        System.out.println(sum);
    }
    
}
