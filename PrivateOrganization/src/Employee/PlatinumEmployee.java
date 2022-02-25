/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author sayeem
 */
public class PlatinumEmployee extends Employee{
    PlatinumEmployee(String name, double salary){
        super(name,salary);
    }
    
    @Override
    void printSalary(){
        double bonus = salary*0.15, total;
        total = salary + bonus;
        System.out.println("Name: "+name + " Bonus: "+ bonus +" Total Salary: "+ total);
    }
}
