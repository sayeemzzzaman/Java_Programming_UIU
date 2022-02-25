/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author sayeem
 */
//public class Test {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine() , s2 = sc.nextLine();
//        
//        System.out.println(s1.indexOf(s2));
//        System.out.println(s1.lastIndexOf(s2));
//    }
//    
//}

public class Test
{
    /* Checks if a string is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
 
    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }
 
        return count;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String str = sc.nextLine();
 
        int count = countMatches(text, str);
        System.out.println(count);
        
    }
}
