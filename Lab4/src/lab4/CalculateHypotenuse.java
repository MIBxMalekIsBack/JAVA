/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;
import java.text.*;
public class CalculateHypotenuse {
    public static void main (String[] args){
    double side,base,hypo,c;
    DecimalFormat df = new DecimalFormat("0.00");
    Scanner input = new Scanner(System.in);
    
    System.out.println("This program is calculate Hypotenuse of Triangle ");
    
    System.out.print("Side: ");
    side = input.nextDouble();
    
    System.out.print("Base: ");
    base = input.nextDouble();
    
    c = Math.pow(side,2)+Math.pow(base,2);
    hypo = Math.sqrt(c);
    
    System.out.println("Hypotenuse: "+df.format(hypo));
    
    }   
}
