/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*; //for date
import java.text.*; //for SimpleDateFormat
public class Ch2DateDisplay {
    public static void main (String[] args) {
        
        SimpleDateFormat simpleDF1, simpleDF2;
        Date today = new Date();
        //today = new Date();
        simpleDF1 = new SimpleDateFormat();
        simpleDF2 = new SimpleDateFormat ("EEEE MMMM dd, yyyy");
        
        //Default short format display
        System.out.println("Today is " + simpleDF1.format(today));
        //Programmer-designed long format display
        System.out.println("Today is " + simpleDF2.format(today));
    }
    
}
