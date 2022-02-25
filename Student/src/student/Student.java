/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sayeem
 */
public class Student {
    private String name, id;
    private double cgpa;
	public Student(String id, String name, double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
    @Override
        public String toString(){
            return id+" "+name+" "+cgpa;
        }
public static void main(String[] args){
    Student s1 = new Student("011162101", "Kratos", 3.0);
    Student s2 = new Student("011162102", "Thanos", 4.0);
    System.out.println("Before swap");
    System.out.println(s1);
    System.out.println(s2);
    swap(s1, s2);
    System.out.println("After swap");
    System.out.println(s1);
    System.out.println(s2);
    }
public static void swap(Student s1, Student s2){
        String tempName,tempId;
        double tempCgpa;
        tempName = s1.name;
        tempId = s1.id;
        tempCgpa = s1.cgpa;
        s1.name = s2.name;
        s1.id = s2.id;
        s1.cgpa = s2.cgpa;
        s2.name = tempName;
        s2.id = tempId;
        s2.cgpa = tempCgpa;
        
    }
}
