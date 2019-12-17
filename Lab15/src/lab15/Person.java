/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

public class Person {
    protected String name;
    protected char gender;
    
    public Person(){}
    public Person(String n, char g){
        name = n;
        gender = g;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public char getGender() {
       return gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public void greet(){
        System.out.println("Hi, my name is " + name);
    }
}
