/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final191que2;

import java.io.*;
import java.util.*;

/**
 *
 * @author sayeem
 */
public class Final191Que2 {

    public static void main(String[] args) {
        try{
            File obj = new File("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\Final191Que2\\src\\final191que2\\numbers.txt");
            Scanner fsc = new Scanner(obj);

            while(fsc.hasNextLine()){
                String line = fsc.nextLine();
                String split[] = line.split(",");
                int max=0;
                for(int i=0 ; i<split.length; i++){
                    if(Integer.valueOf(split[i]) > max){
                        max = Integer.valueOf(split[i]);
                    }
                }
                System.out.println(max);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
