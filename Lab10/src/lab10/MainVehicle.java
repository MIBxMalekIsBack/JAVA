package lab10;

import java.util.*;
public class MainVehicle {
     public static void main(String args[]){
        Vehicle v = new Vehicle();
        Vehicle v2 = new Vehicle();
        Scanner q = new Scanner(System.in);
        String myCol, myType, myTrans;
        String myCol2, myType2, myTrans2;
        
        System.out.print("Enter the color of the vehicle: ");
        myCol = q.next();
        System.out.print("Enter the type of the vehicle: ");
        myType = q.next();
        System.out.print("Enter the transmission of the vehicle: ");
        myTrans = q.next();
        
        v.setColor(myCol);
        v.setType(myType);
        v.setTransmission(myTrans); 
        
        System.out.println("The details of the vehicle: ");
        System.out.println("Color: " + v.getColor());
        System.out.println("Type: " + v.getType());
        System.out.println("Transmission: " + v.getTransmission());
        
        System.out.print("Enter the color of the vehicle: ");
        myCol2 = q.next();
        System.out.print("Enter the type of the vehicle: ");
        myType2 = q.next();
        System.out.print("Enter the transmission of the vehicle: ");
        myTrans2 = q.next();
        Vehicle newV = new Vehicle(myCol2, myType2, myTrans2);
        
        newV.printColor();
        newV.printColor(0);
        
        System.out.println("The details of the vehicle: ");
        System.out.println("Color: " + newV.getColor());
        System.out.println("Type: " + newV.getType());
        System.out.println("Transmission: " + newV.getTransmission());
    }
}


