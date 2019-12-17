/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.text.*;
public class Ch3Circle {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat ("0.00");
        final double PI = 3.14159;  //constant
        double radius, area, circumference;
        radius = 2.35;
       
        area = PI*Math.pow(radius,2);
        circumference = 2.0*PI*radius;
        System.out.println("Given Radius: "+radius);
        System.out.println("Area: "+df.format(area));
        System.out.println("Circumference: "+df.format(circumference));
    }
    
}
    

