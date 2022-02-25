/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final193que2;

import java.io.*;
import java.util.*;

/**
 *
 * @author sayeem
 */
public class Final193Que2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File obj = new File("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\Final193Que2\\src\\final193que2\\employeeDirectory.txt");
        ArrayList<Employee> arrList = new ArrayList<Employee>();
        try{
            Scanner fsc = new Scanner(obj);
            while(fsc.hasNextLine()){
                int id = fsc.nextInt();
                String name = fsc.next();
                double salary = fsc.nextDouble();
                arrList.add(new Employee(id,name,salary));
            }
            Collections.sort(arrList, new Comparator<Employee>(){
                @Override
                public int compare(Employee a, Employee b){
                    return (int) (a.salary - b.salary);
                }
            });
            PrintWriter wr = new PrintWriter("D:\\CSE\\Trimester Wise\\Java_Programming_UIU\\Final193Que2\\src\\final193que2\\output.txt");
            wr.println("ID: " + arrList.get(4).ID + " Name: " + arrList.get(4).name + " Salary: " + arrList.get(4).salary);
            wr.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        //System.out.println("Salary: " + arrList.get(4).name + " ID: " + arrList.get(4).ID + " Salary: " + arrList.get(4).salary);
//        for(Employee v : arrList){
//            System.out.println("Salary: " + v.name + " ID: " + v.ID + " Salary: " + v.salary);
//        }
    }
    
}
