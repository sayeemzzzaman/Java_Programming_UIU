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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main obj = new A(4,5){
            public void printSum(int a, int b){
                System.out.println(a+b);
            }
            public void printSum(int a, int b, int c){
                
            }
            public void printSum(int a, int b, int c, int d){
            
            }
        };
    }
    
}
