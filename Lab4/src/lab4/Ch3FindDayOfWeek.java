/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;
import java.text.*;
public class Ch3FindDayOfWeek {
    public static void main(String[] args){
        int year,month,day;
        GregorianCalendar cal;
        SimpleDateFormat sdf;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Year (yyyy): ");
        year = input.nextInt();
        
        System.out.print("Month (1-12): ");
        month = input.nextInt();
        
        System.out.print("Day (1-31): ");
        day = input.nextInt();
        
        cal = new GregorianCalendar (year,month-1,day);
        sdf = new SimpleDateFormat ("EEEE");
        
        System.out.println("");
        System.out.println("Day of week: "+sdf.format(cal.getTime()));
    }
    
}
