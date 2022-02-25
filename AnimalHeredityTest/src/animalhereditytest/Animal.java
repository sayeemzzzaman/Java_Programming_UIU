/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalhereditytest;

/**
 *
 * @author sayeem
 */
public class Animal {
    private double noOfLegs;
    private boolean vegetarian,eats;
  public  Animal(double noOfLegs, boolean vegetarian, boolean eats)
    {
        this.noOfLegs = noOfLegs;
        this.vegetarian = vegetarian;
        this.eats = eats;
    }
  boolean getVeg()
    {
        return vegetarian;
    }
  boolean getEats()
    {
        return eats;
    }
  double getNoOfLegs()
  {
      return noOfLegs;
  }
}
