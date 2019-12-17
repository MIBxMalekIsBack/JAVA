package lab4;

import java.util.*;
import java.text.*;
public class L4Q3 {
    public static void main(String [] args){
        double celcius,fahrenheit;
        DecimalFormat df = new DecimalFormat ("0.00");
        Scanner input = new Scanner (System.in);
        
        System.out.print("Temperature in Degree Celcius: ");
        celcius = input.nextDouble();
        
        fahrenheit = (1.8*celcius)+32;
        
        System.out.println("Temperature in Fahrenheit: "+df.format(fahrenheit));
    }
}
  