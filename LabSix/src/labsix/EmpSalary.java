/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsix;

import java.util.*;
public class EmpSalary {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Employee staff1 = new Employee();
        
        String eID, eName, eGender;
        double eComm, eSal;
        
        System.out.print("Employee number : ");
        eID = input.nextLine();
        System.out.print("Employee name : ");
        eName = input.nextLine();
        System.out.print("Employee gender : ");
        eGender = input.nextLine(); 
        System.out.print("This month commission : ");
        eComm = input.nextDouble();
        System.out.print("Monthly Salary : ");
        eSal = input.nextDouble();
        staff1.getEmpInfo(eID, eName, eGender, eComm, eSal);
        System.out.println(staff1.displayAnswer());
    }
}
