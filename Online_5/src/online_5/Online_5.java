/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sayeem
 */
public class Online_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> initialList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names: ");
        
        String name[] = new String[5];
        
     for(int i=0; i<5 ; i++){
         nameList.add(sc.next());
         name = nameList.get(i).split(" ");
         String str = "";
         for(int j=0; j<name.length; j++){
             str += name[j].charAt(0) + ".";
         }
         initialList.add(str);
     }
     for(String v : initialList){
         System.out.println(v);
     }
        
         
    }
    
}
