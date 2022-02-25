/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistlecture;

/**
 *
 * @author sayeem
 */
public class Person {
    String name;
    double cgpa; //If in the ques not specified that Instance Variable public or private..we have to take private IV as default..and take getter setter

    public Person(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
}
