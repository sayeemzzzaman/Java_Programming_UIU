/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author sayeem
 */
public class Teacher extends Person{
    private String salary;
    
    public Teacher(String name, String age, String salary){
        super(name,age);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    @Override
    public void typeOfPerson(){
        System.out.println("I'm a Teacher");
    }
}
