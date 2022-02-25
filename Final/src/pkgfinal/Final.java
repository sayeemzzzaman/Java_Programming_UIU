/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author sayeem
 */
public class Final {

   
    public static void main(String[] args) {
        try{
        File file = new File("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\Final\\src\\pkgfinal\\people.txt");
        ArrayList<Student> student = new ArrayList<Student>();
        ArrayList<Teacher> teacher = new ArrayList<Teacher>();

            Scanner fsc = new Scanner(file);
        
            while(fsc.hasNextLine()){
                String data1 = fsc.nextLine();
                String h[] = data1.split(", ");
                
                if(h[0].equals("Student")){
                    String name = h[1];
                    String age = h[2];
                    String cgpa = h[3];
                    String studentID = h[4];
                    student.add(new Student(name, age, cgpa, studentID));
                }
                else if(h[0].equals("Teacher")){
                //else{
                    String name = h[1];
                    String age = h[2];
                    String salary = h[3];
                    teacher.add(new Teacher(name, age, salary));
                }

                //System.out.println(h[4]);
                
            }
            Comparator<? super String> myComparator = new Comparator<String>() {

            @Override
            public int compare(String name1, String name2) {
                int num1 = Integer.parseInt(name1.split(" ")[1]);
                int num2 = Integer.parseInt(name2.split(" ")[1]);
                // > : Increasing order 
                // < : Decreasing order
                if(num1 < num2)
                        return 1;
                else
                        return -1;
            }

        };
            Collections.sort(student, myComparator);
            Collections.sort(teacher, myComparator);
            
            //Collections.sort(student, (Person a1, Person b)) -> (int) Integer.parseInt(a1.name) - Integer.parseInt(b.name));
           // Collection.sort(student);
            //Collection.sort(teacher);
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        

    }
    
}
