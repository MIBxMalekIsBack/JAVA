/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

import java.util.*;
public class Membership extends Customer {
    private int custDiscount = 0;
    
    public Membership (String n, String g, int y){
        custName = n;
        custGender = g.charAt(0);
        custDiscount = y;
        setTitle(g);
        greeting();
    }
    
    public void greeting(){
        System.out.println("Welcome! " + custTitle  + custName + "." +
                           "Your Discount " + custDiscount);
    }
}
