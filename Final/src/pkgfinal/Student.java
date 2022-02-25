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
public class Student extends Person{
    private String cgpa;
    private String studentID;
    
    public Student(String name, String age, String cgpa, String studentID){
        super(name,age);
        this.cgpa = cgpa;
        this.studentID = studentID;
    }

    public String getCgpa() {
        return cgpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
    @Override
    public void typeOfPerson(){
        System.out.println("I'm a student");
    }
}
