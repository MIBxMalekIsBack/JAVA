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
public class Ch2RecordFiling {
    public static void main (String[] args) {
        String firstName, lastName;
        Scanner input = new Scanner(System.in);
        System.out.print("Your full name: ");
        firstName = input.next( );
        lastName = input.next( );
        System.out.println("Your medical record is filed under " + lastName + "," + firstName + ".");
    }
    
}
