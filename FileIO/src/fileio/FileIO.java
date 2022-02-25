/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

 class Person {
     String data1,data2,data3;

    public Person(String data1, String data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }
     
}
public class FileIO {

    
    public static void main(String[] args) {
        
        File fileObj = new File("InputFile.txt");
        Person arr[] = new Person[10];
        int counter = 0;
        try{
        Scanner sc = new Scanner(fileObj);
        while(sc.hasNextLine()){
            String data1 = sc.nextLine(),data2 = sc.nextLine(),data3 = sc.nextLine();
            Person temp = new Person(data1,data2,data3);
            arr[counter++] = temp;
            }
        }
        catch(Exception ex){ex.printStackTrace();}
        
        for(int i=0; i<counter; i++){
            Person pr = arr[i];
            System.out.println("Name: " + pr.data1 + "\nID: " + pr.data2 + "\nCGPA: " + pr.data3);
        }
        
        Student s1 = new Student("Sakib", 50, 3.5);

            if(students.contains(s1)){
                System.out.println("Found Sakib!");
            }
            
        
    }
    
}
