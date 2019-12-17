package week8;

import java.util.*;
public class Calculation {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Number digit = new Number();
        int count = 0;
        
        System.out.print("You wish to calculate the sum of how many digits: ");
        count = input.nextInt();
        digit.sumCal(count);
        System.out.println("The sum of the " + count + "digits is: "+digit.getNumSum());
        
    }
}
