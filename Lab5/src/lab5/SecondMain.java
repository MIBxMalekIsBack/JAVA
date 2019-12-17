/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ABDUL MALEK
 */
public class SecondMain {
    public static void main(String[] args){
        Bicycle bike;
        Account acct;
        
        String myName = "Jon Java";
        
        bike = new Bicycle();
        bike.setOwnerName(myName);
        
        acct = new Account();
        acct.setOwnerName(myName);
        acct.setInitialBalance(250.00);
        
        acct.add(25.00);
        acct.deduct(50);
        System.out.println("Owner: " + acct.getOwnerName());
        System.out.println("Bal : "+ acct.getCurrentBalance());
        
        System.out.println(bike.getOwnerName()+" own a bicycle and");
        System.out.println("has $"+acct.getCurrentBalance()+ " left in the bank");
    }
}
