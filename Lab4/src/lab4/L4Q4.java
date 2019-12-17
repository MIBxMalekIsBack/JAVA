package lab4;

import java.util.*;
import java.text.*;
public class L4Q4 {
    public static void main(String [] args){
    String date, year,month,day;
        String space = new String ("/");
        GregorianCalendar cal;
        SimpleDateFormat sdf;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Date [dd/mm/yyyy]: ");
        date = input.nextLine();
        
        day = date.substring(0, date.indexOf(space)); 
        month = date.substring(date.indexOf(space)+1, date.indexOf(space)+3);
        year = date.substring(date.indexOf(space)+4, date.indexOf(space)+8);
        
        /*day = date.substring(0, 2); 
        month = date.substring(3, 5);
        year = date.substring(6,date.length());
        */
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
