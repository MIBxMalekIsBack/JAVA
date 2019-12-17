/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

public class Customer {
    protected String custName;
    protected char custGender;
    protected String custTitle;
    
    public Customer(){
        
    }
    public Customer (String name, String gender){
        custName = name;
        custGender = gender.charAt(0);
        setTitle(gender);
        greeting();
    }
    
    public void setTitle(String gender){
        if (Character.toUpperCase(gender.charAt(0))=='M')
            custTitle = "Mr. ";
        else
            custTitle = "Ms. ";
    }
    
    public void greeting(){
        System.out.println("Welcome" + custTitle + custName);
    }
}
