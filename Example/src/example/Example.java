/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Geraint
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        System.out.println(d1.getBreed());
        d1.printBreed();
        d1.makeNoise();
        Dog d2 = new Dog("Bulldog");
        d2.printBreed();
        d1.setBreed("Poodle");
        d1.printBreed();
        d2.setBreed("Collie");
        d2.printBreed();
    }
    
}
