/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author sayeem
 */
public class Dog extends Pet {
    public Dog(int bodyTemp){
        super(bodyTemp);
    }
    @Override
    public void make_noise(){
        System.out.println("Ghew");
    }
}
