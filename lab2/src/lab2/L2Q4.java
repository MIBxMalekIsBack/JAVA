/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;
public class L2Q4 {
    public static void main(String[] args){
        String ID,firstName,lastName,target; //declaration
        Scanner input = new Scanner(System.in);     //declare: Scanner
        /*Scanner input;
        input=new Scanner(System.in);*/                 //scanner=new Scanner(System.in);
       
        System.out.print("Enter your student ID: ");
        ID = input.next();
        
        System.out.print("Enter your first name: ");
        firstName = input.next();
        
        System.out.print("Enter your last name: ");
        lastName = input.next();
        
        System.out.print("Enter your target grade for CISB254: ");
        target = input.next();
        System.out.print("\n");
        
        System.out.println("You have entered the following");
        System.out.println("ID: "+ID);
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Targetted grade: "+target);
    }
    
}
