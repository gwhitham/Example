/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author gerai
 */
public class Cat extends Animal{
    
    private String breed;
    
    public Cat(){
        breed = "manx";
        vertabrate = true;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public void setBreed(String b){
        this.breed = b;
    }
    
    public String makeNoise(){
        return "Miaow";
    }
    
}
