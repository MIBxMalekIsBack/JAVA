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
public class Account {
    private String ownerName;
    private double balance;
    public Account(){
        ownerName = "unassigned";
        balance = 0.0;
    }
    public void add(double amt){
        balance = balance + amt;
    }
    public void deduct(double amt){
        balance = balance - amt;
    }
    public double getCurrentBalance(){
        return balance;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setInitialBalance(double bal){
        balance = bal;
    }
    public void setOwnerName(String name){
        ownerName = name;
    }
}
