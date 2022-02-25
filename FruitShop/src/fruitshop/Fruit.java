/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshop;

/**
 *
 * @author sayeem
 */
public class Fruit {
    String name;
    double weight;
    double pricePerKg;
    double totalPrice;
    
    public Fruit(String name, double weight, double pricePerKg)
    {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
        totalPrice = weight * pricePerKg;
    }
    
    public void reducePricePerKG(double reduce)
    {
        pricePerKg -= reduce;
        totalPrice = weight * pricePerKg;
    }
    public void increasePricePerKG(double increase)
    {
        pricePerKg += increase;
        totalPrice = weight*pricePerKg;
    }
    public void printDetails()
    {
        System.out.println("Fruit Details: \nName:"+ name +"\nWeight: "+weight+"Kg\nPriceperkg: "+pricePerKg+"\nTotal price:"+totalPrice+"\n");
    }
}
