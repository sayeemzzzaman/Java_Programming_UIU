/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;


     
public class Employee {
    String name;
    double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    void printSalary(){
        System.out.println(salary);
    }
    
    public static void main(String[] args) {
     Employee m1 = new Employee("Aftab",9000);
     PlatinumEmployee m2 = new PlatinumEmployee("Ashfaque",4000);
     SilverEmployee m3 = new SilverEmployee("Riaz",1000);
     
     m1.printSalary();
     m2.printSalary();
     m3.printSalary();
    }
}
