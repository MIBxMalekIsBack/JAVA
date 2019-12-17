package labtest;

import java.util.*;
public class number {
    public static void main(String[] args){
        int number=0, index=0, odd=0, average=0;
        Scanner input = new Scanner (System.in);
        
        do
        {
            System.out.print("Enter an ODD integer : ");
            number = input.nextInt();                     
            
            if (number%2 != 0)
            {
                odd = odd + number;
                index++;
            }
        }while(number != 0);
        
        average = odd/index;
        
        System.out.println("\nSum Of All Odd Integer : " +odd);
        System.out.println("Average of ODD integer : " +average);
    }
}
