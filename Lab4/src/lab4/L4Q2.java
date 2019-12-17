package lab4;

import java.util.*;
import java.text.*;
public class L4Q2 {
    public static void main(String[] args){
        double cm,feet,inches;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner (System.in);
        
        System.out.print("in CM: ");
        cm = input.nextInt();
        
        feet = cm * 0.0328084;
        inches = cm * 0.393701;
        
        System.out.println("In feet: "+df.format(feet));
        System.out.println("In inches: "+df.format(inches));
        
    }
    
}
