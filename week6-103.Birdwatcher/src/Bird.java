/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Bird {

    private String name;
    private String latinName;
    int countObservation = 0; 

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
     public String getName() {
        return name;
    }
    
    public void increaseObservation() {
        countObservation++;
    }

    public String toString(){
        return name + "(" + latinName + "): " + countObservation + " observations";
    }
}
