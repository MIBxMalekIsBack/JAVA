/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

public class L2Q2 {
    public static void main(String[] args){
        String fullName, firstName, lastName, space;
        fullName = new String("Decafe Latte");
        space = new String(" ");
        firstName = fullName.substring(0,fullName.indexOf(space));
        lastName = fullName.substring(fullName.indexOf(space)+1,fullName.length());
        
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Your last name has" + lastName.length() + "characters");
    }
    
}
