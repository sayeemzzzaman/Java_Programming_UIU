/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sayeem
 */
public class Ct5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File obj = new File("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\ct5\\src\\ct5\\input.txt");
        File out = new File("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\ct5\\src\\ct5\\output.txt");
        
        ArrayList<String> arr= new ArrayList<String>();
        try{
            PrintWriter pWriter = new PrintWriter("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\ct5\\src\\ct5\\output.txt");
            Scanner fsc = new Scanner(obj);
            while(fsc.hasNextLine()){
                String name = fsc.next();
                int id = fsc.nextInt();
                double cgpa = fsc.nextDouble();
                arr.add(name + " " + cgpa + "\n");
                
            }
            
            Collections.reverse(arr);
            
         for(int i=0 ; i<arr.size() ; i++){
            pWriter.println(arr.get(i));
        }
         pWriter.close();
       }
        catch (IOException ex) {
            ex.printStackTrace();
        }
       

    }
    
}
