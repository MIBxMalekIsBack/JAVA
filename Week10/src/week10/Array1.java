package week10;

import java.util.*;
public class Array1 {
     public static void main(String[] args){ 
        final int size = 3;
        int [] numList; //declare an array pointer
        numList = new int [size]; //create an array pointed by numList
        //int [] numList = new int [3];
        Scanner input = new Scanner(System.in);
        int number = 0, index = 0; //initialize
        
        do
        {
            System.out.print("Enter number: ");
            number = input.nextInt();
            numList[index] = number; //assign the data into the array
            index++;
        } while (number != 0 && index < size);
        
        for (index=0 ; index<size ; index++)
        {
            System.out.println("Integer in location " + index + 
                               " is " + numList[index]);
        }
        
    }
}
