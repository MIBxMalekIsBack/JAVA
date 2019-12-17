/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;
import java.text.*;
public class L4Q1 {
    public static void main(String[] args){
        String ID,name;
        int subject;
        double fee;
        DecimalFormat df = new DecimalFormat ("0.00");
        Scanner input = new Scanner (System.in);
        
        System.out.print("ID: ");
        ID = input.nextLine();
        
        System.out.print("Name: ");
        name = input.nextLine();
        
        System.out.print("Number of subject: ");
        subject = input.nextInt();
        
        fee = 1200*subject; 
        
        /*System.out.print("\n");
        System.out.println("Name: "+name);
        System.out.println("Student ID: "+ID);
        System.out.println("Total Fees: "+df.format(fee));*/
        
        System.out.print(
                "\n"+"Name: "+name+"\n"+
                "Student ID: " +ID+ "\n"+
                "Total fees: "+df.format(fee)+"\n");
        
    }
}
