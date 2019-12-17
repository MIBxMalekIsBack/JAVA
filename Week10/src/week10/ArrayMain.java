package week10;

import java.util.*;
public class ArrayMain {
    
    public static void main(String[] args){
        final int size = 3;
        Scanner input = new Scanner(System.in);
        Student[] studList = new Student[size]; // create array
        String sName,flag;
        int sAge,index=0;
        
        do
        {
            System.out.print("Enter student name: ");
            sName = input.nextLine();
            System.out.print("Enter student age: ");
            sAge = input.nextInt();
            flag = input.nextLine();                    //dummy
            Student studData = new Student(sName,sAge);
            studList [index] = studData;
            index++;
        }while(index<size);
        
        for (index = 0 ; index < size ; index++){
            System.out.println(studList[index].getStudName());
            System.out.println(studList[index].getStudAge());
            System.out.println("\n");
        }
     }
}
