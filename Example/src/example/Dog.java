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
public class Dog {
    
    private int legs = 4;
    private String breed = "";
    private int eyes =2;
    private int tail = 1;
    
    public Dog(String breed){
        this.breed = breed;
    }
    
    public Dog(){
        this.breed = "Labrador";
    }
    
    public void printBreed(){
        System.out.println(breed);
    }
    
    public String getBreed(){
        return this.breed;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    
    public void makeNoise(){
        System.out.println("Woof");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
    
    
}
