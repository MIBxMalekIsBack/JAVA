package lab3;

import java.util.*;
import java.text.*;
public class CalculateCalories {
    public static void main(String[] args){
        String fullName,lastName,space;
        space = new String(" ");
        double weight,calories,perDay,pound;
        Scanner input = new Scanner(System.in);
        DecimalFormat DF = new DecimalFormat("0.00");
        
        System.out.print("Hi, What is your full name: ");
        fullName = input.nextLine();
        lastName = fullName.substring(fullName.indexOf(space)+1,fullName.length());
        
        System.out.print("Enter Your Weight [KG]: ");
        weight = input.nextDouble();
        
        pound = weight*2.2;
        calories = pound*19;
        perDay = calories/30;
        
        System.out.println("\n");
        System.out.println("Hello "+lastName);
        System.out.println("Your weight in Pound is "+pound);
        System.out.println("This is number of calories you need in one day : "+DF.format(perDay));
    }
    
}
