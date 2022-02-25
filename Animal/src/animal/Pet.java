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
abstract public class Pet {
    
	int bodyTemperature;
	public Pet(int bodyTemperature){
		this.bodyTemperature = bodyTemperature;
	}
	abstract void make_noise();
	boolean is_heated(){
		return (bodyTemperature >= 80);
	}
	final void sleep(){
		System.out.println("Pet sleeping");
	}

}
