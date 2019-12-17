package lab4;

import java.util.*;
import java.text.*;
public class L4Q4New {
    public static void main(String[] args){
        String date, year,month,day;
        String space = new String ("/");
        GregorianCalendar cal;
        SimpleDateFormat sdf;
        int num1, num2;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Date [dd/mm/yyyy]: ");
        date = input.nextLine();
        
        num1 = date.indexOf("/");   // NEW WAYSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
        num2 = date.lastIndexOf("/"); //NEW WAYSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
        
        //System.out.println("num1 : " + num1 + "num2 : " + num2 ); testing position
        
        /*day = date.substring(0, date.indexOf(num1)); 
        month = date.substring(date.indexOf(num1)+1, date.lastIndexOf(num2));
        year = date.substring(date.lastIndexOf(num2), date.length());
        
        
        day = date.substring(0, date.indexOf(space)); 
        month = date.substring(date.indexOf(space)+1, date.indexOf(space)+3);
        year = date.substring(date.indexOf(space)+4, date.indexOf(space)+8);
        */
        day = date.substring(0, num1); 
        month = date.substring(num1+1, num2);
        year = date.substring(num2+1,date.length());
        
        int a = Integer.parseInt(day);
        int b = Integer.parseInt(month);
        int c = Integer.parseInt(year);
        
        //cal = new GregorianCalendar (year,month-1,day);
        //sdf = new SimpleDateFormat ("EEEE");
        
        System.out.println("");
        System.out.println("Day: "+a);
        System.out.println("month: "+b);
        System.out.println("year: "+c);
        
        cal = new GregorianCalendar (c,b-1,a);
        sdf = new SimpleDateFormat ("EEEE");
        
        System.out.println("");
        System.out.println("Day of week: "+sdf.format(cal.getTime()));
    }
    
}
