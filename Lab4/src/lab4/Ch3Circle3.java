/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author ABDUL MALEK
 */
import java.util.*;
import java.text.*;
public class Ch3Circle3 {
    public static void main(String[] args){
       final double PI = 3.14159;
       final String TAB = "\t";
       final String NEWLINE = "\n";
       
       double radius, area, circumference;
       Scanner input = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("0.00");
       
       System.out.print("Enter Radius: ");
       radius = input.nextDouble();
       
       area = PI*radius*radius;
       circumference = 2.0*PI*radius;
       
       System.out.println(
               "Given Radius: "+TAB+df.format(radius)+NEWLINE+
               "Area: "+TAB+df.format(area)+ NEWLINE+
               "Circumference: "+TAB+df.format(circumference));
    }
    
}
