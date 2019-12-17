/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.*;
public class Shape {
     Scanner input = new Scanner(System.in);
    
    public double acceptRadius(){
        System.out.print("Enter the radius : ");
        return(input.nextDouble());
    }
    public int acceptBase(){
        System.out.print("Enter the base : ");
        return(input.nextInt());
    }
    public int acceptHeight(){
        System.out.print("Enter the height: ");
        return (input.nextInt());
    }
    
}
