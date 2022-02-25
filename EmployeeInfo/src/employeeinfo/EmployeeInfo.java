/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeinfo;

import java.util.Scanner;

/**
 *
 * @author sayeem
 */
public class EmployeeInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee person1 = new Employee();
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble(),numberOfHours = sc.nextDouble();
        person1.getInfo(salary,numberOfHours);
        person1.AddSal();
        person1.AddWork();
        System.out.println(person1.salary+"\t"+person1.numberOfHours);
    }
    
}
