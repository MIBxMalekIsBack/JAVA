/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

public class Ch2StringProcessing {
    public static void main(String[] args){
        String fullName, firstName, lastName, space;
        fullName=new String("Decafe Latte");
        space = new String(" ");
        firstName = fullName.substring(0,fullName.indexOf(space));
        lastName = fullName.substring(fullName.indexOf(space)+1,fullName.length());
        
        System.out.println("Full Name: "+fullName);
        System.out.println("First: "+firstName);
        System.out.println("Last: "+lastName);
        System.out.println("Your last name has "+ lastName.length() + " characters.");
    }
    
}
