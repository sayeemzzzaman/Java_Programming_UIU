/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final183que4;

import java.util.*;

/**
 *
 * @author sayeem
 */
public class Final183Que4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
        
        
        arrEmployee.add(new Employee("Sakib", 203, 5000));
        arrEmployee.add(new Employee("Monir", 211, 9000));
        arrEmployee.add(new Employee("Afjal", 245, 7000));
        
        Collections.sort(arrEmployee, new Comparator<Employee>(){
            @Override
            public int compare(Employee a, Employee b){
                return (int) (a.salary - b.salary);
            }
        });
        
        for(int i=0; i<arrEmployee.size(); i++){
            System.out.println("Name: " + arrEmployee.get(i).employeeName + " ID: " + arrEmployee.get(i).employeeId + " Salary: " + arrEmployee.get(i).salary);
        }
    }
    
}
