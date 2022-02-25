/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iotest;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author sayeem
 */
public class IOTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try{
//            File f = new File("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\IOTest\\src\\iotest\\out.txt");
//            Scanner sc = new Scanner(f);
//            while(sc.hasNext()){
//                String name = sc.next();
//                int id = sc.nextInt();
//                double cgpa = sc.nextDouble();
//                System.out.println(name);
//                System.out.println(id);
//                System.out.println(cgpa);
//                
//                Student s1 = new Student(name,id,cgpa);
//            }
//            sc.close();
//        }
        try{
            FileReader f = new FileReader("out.txt");
            BufferedReader reader = new BufferedReader(f);
            
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
