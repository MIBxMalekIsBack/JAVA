/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ABDUL MALEK
 */
import java.util.*;
public class Ch2Greetings {
    public static void main (String[] args) {
        String firstName;
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        firstName = input.nextLine( ); //accept characters up to, but not //nextLine dia amek semua
                                     //not including the first space
                                     
        System.out.println("Hi, " + firstName + ". Nice to meet you.");
    }
    
}
