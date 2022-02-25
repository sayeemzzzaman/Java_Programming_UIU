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
public class Employee {

    double salary;
    double numberOfHours;
   
    public void getInfo(double salary,double numberOfHours)
    {
        this.salary = salary;
        this.numberOfHours = numberOfHours;
    }
    public void AddSal(){
        if(salary<500)salary+=10;
    }
    public void AddWork(){
        if(numberOfHours>6)salary+=5;
    }
}
