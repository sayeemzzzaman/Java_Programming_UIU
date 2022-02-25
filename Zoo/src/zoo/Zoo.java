/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author sayeem
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Magpie();
        Magpie c = (Magpie) b;
        a.fly();
        b.fly();
        b.eat();
        b.boo();
        ((Magpie)b).fly(15);
        c.fly();
        a.eat();
        b.eat();
        c.eat();
    }
    
}
