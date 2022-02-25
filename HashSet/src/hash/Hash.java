/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author sayeem
 */
public class Hash {

    public static void main(String[] args) {
       
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(400);
        hs.add(500);
        hs.add(400); //duplicate not count
        hs.add(200);
        
        if(hs.contains(500))System.out.println("Found 500!");
        if(hs.contains(800))System.out.println("Found 800!");
        
        hs.remove(400); //removes all 400
        if(hs.contains(400))System.out.println("Found 400!");
        
        hs.remove(900); //does nothing
        System.out.println("Size: " + hs.size());
        
        for(int v: hs)System.out.println(v); //can't use for loop, only for each loop
        
        System.out.println("================================================");
        
        //Map: Maps one element with another
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("011211", 100); //"011211" = 100
        map.put("011212", 400); //"011212" = 400
        //         key    value
        System.out.println(map.get("011212"));
        System.out.println(map.get("011211"));
        System.out.println("HashMap: " + map);
    }
    
}
