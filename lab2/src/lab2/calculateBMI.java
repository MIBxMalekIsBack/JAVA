/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ABDUL MALEK
 */
import java.util.*;
import java.text.*;
public class calculateBMI {
    public static void main(String[] args){
        double height1,height2,weight,BMI;
        String name,lastName,space;
        
        space = new String(" ");
        DecimalFormat DF = new DecimalFormat("0.00");
        Scanner input = new Scanner (System.in);
        
        System.out.println("Hello!");
        System.out.print("What is your name: ");
        name = input.nextLine();
        
        System.out.print("Height [CM]: ");
        height1 = input.nextDouble();
        
        System.out.print("Weight [KG]: ");
        weight = input.nextDouble();
        height2 = height1/100;
        BMI = weight/(Math.pow(height2,2));
        lastName = name.substring((name.indexOf(space)+1),name.length());
        
        System.out.println("");
        System.out.println("Hi "+lastName);
        System.out.println("Your BMI is "+DF.format(BMI));
        
    }
    
}
