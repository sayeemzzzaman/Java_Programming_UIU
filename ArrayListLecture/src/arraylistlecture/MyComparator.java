/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistlecture;

import java.util.Comparator;

/**
 *
 * @author sayeem
 */
public class MyComparator implements Comparator<Person>{
    
    public int compare(Person a , Person b){
        return (int) (a.cgpa - b.cgpa);
    }
}
