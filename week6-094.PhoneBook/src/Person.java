/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Person {
    private String name;
    private String number; 
    
    
    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public String toString(){
        return this.getName() + " number: " + this.getNumber();
    }
    
    public void changeNumber(String newNumber){
        this.number = newNumber;
    }
}
