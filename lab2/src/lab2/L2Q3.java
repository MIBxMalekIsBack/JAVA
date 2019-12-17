package lab2;

import java.util.*; //for date
import java.text.*; //for SimpleDateFormat
public class L2Q3 {
    public static void main (String[] args) {
        Date today;
        SimpleDateFormat simpleDF1, simpleDF2;
        today = new Date();
        simpleDF1 = new SimpleDateFormat();
        simpleDF2 = new SimpleDateFormat ("EEEE MMMM dd, ''yy");
        
        //Default short format display
        System.out.println("Today is " + simpleDF1.format(today));
        //Programmer-designed long format display
        System.out.println("Today is " + simpleDF2.format(today));
    }
}
