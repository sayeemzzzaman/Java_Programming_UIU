/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que5;

/**
 *
 * @author sayeem
 */
public class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public Student(String name) {
        this.name = name;
        this.id = -1;
        this.cgpa = -1;
    }
}
