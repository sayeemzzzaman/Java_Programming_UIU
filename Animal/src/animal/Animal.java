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
public class Animal {

    public static void main (String[] args)
	{
		Pet [] pets = new Pet[2];
		pets[0] = new Cat(50);
		pets[1] = new Dog(60);
		
		for(Pet p : pets) {
			p.make_noise();
			System.out.println("Warm: " + p.is_heated());
			p.sleep();
		}
	}
}
    

