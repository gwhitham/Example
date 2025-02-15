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
        
        Animal [] myAnimals = new Animal[6];
        
    
        for(int i = 0; i<myAnimals.length; i+=2){
            myAnimals[i] = new Dog();
            myAnimals[i+1] = new Cat();
        }
        System.out.println(Cat.countCats);
        System.out.println(myAnimals[3].makeNoise());
        
    }
    
}
