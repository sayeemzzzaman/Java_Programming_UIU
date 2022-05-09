/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;


import java.util.*;
import java.lang.*;
import java.io.*;

public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a[] = {2,9,4,6,1,7,3,8,5};
     
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int n = sc.nextInt();
        int array[] = new int[n];
        
        System.out.println("Input the numbers:");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
    }
}

    
    
    

