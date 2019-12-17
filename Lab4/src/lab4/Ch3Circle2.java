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
public class Ch3Circle2 {
      public static void main(String[] args){
       final double PI = 3.14159;
       double radius, area, circumference;
       DecimalFormat df = new DecimalFormat("0.000");
       radius = 2.35;
       
       area = PI*radius*radius;
       circumference = 2.0*PI*radius;
       
       System.out.println("Given Radius: "+df.format(radius));
       System.out.println ("Area: "+df.format(area));
       System.out.println("Circumference: "+df.format(circumference));
    }
    
}
