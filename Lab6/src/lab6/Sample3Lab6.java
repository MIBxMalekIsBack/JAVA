/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.*;
public class Sample3Lab6 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        final double basicSal = 1000.00;
        String empNo, empName, empGender, title;
        double empComm, empSal;
        
        System.out.println("Employee number: ");
        empNo = input.nextLine();
        System.out.println("Employee Name: ");
        empName = input.nextLine();
        System.out.println("Employee Gender: ");
        empGender = input.nextLine();
        System.out.println("This month commissoon: ");
        empComm = input.nextDouble();
        System.out.print("Monthly Salary : ");
        empSal = input.nextDouble();
        
        empSal = basicSal + empSal + empComm;
        
        if (empGender.equals("Male")) // same like ==
            title = "Mr.";
        else
            title = "Ms.";
        System.out.println(title + " " + empName +
                ". This month you have earned " +
                "RM " + empSal + ".");
    }
}
