/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author sayeem
 */
abstract class A {
    
    final int x;
    
    public void printSum(int a, int b) {
        System.out.println(a + b);
        x=50;
        System.out.println(x);
    }
    //public abstract void printSum(int a, int b, int c);
   // public abstract void printSum(int a, int b, int c, int d);
}
