/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final183que2;

import java.io.*;
import java.util.*;

/**
 *
 * @author sayeem
 */
public class Final183Que2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File obj = new File("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\Final183Que2\\src\\final183que2\\victims.txt");
            Scanner fsc = new Scanner(obj);
            ArrayList<String> dis = new ArrayList<String>();
            //String d = "";
            while(fsc.hasNextLine()){
                String line = fsc.nextLine();
                String h[] = line.split("-");
                String name = h[0],age = h[1], district = h[2];
                
                //d+=h[2]+" ";
                dis.add(district);
            }
            int count = 0;
            int index=0, max=0;
            for(int i=0; i<dis.size(); i++){
                String check = dis.get(i);
                for(int j=0; j<dis.size(); j++){
                    if(dis.get(j).equals(check)){
                        count++;
                    }
                }
                if(count>max){
                    max=count;
                    index = i;
                }
                count = 0;
            }
            System.out.println(dis.get(index) + "-" + max);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
