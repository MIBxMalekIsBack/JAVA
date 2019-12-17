/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.*;
public class GPACalculation {
    public static void main (String[] args) {
        Student stud = new Student();
        Subject subj = new Subject();
        
        String sID,sName,sSubj,sGrade;
        int sCredit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Student ID : ");
        sID = input.nextLine();
        System.out.print("Student Name : ");
        sName = input.nextLine();
        System.out.print("Subject Name : ");
        sSubj = input.nextLine();
        System.out.print("Subject Grade : ");
        sGrade = input.nextLine();
        System.out.print("Subject Credit : ");
        sCredit = input.nextInt();
        
        stud.setStudName(sName);
        stud.setStudID(sID);
        subj.setSubName(sSubj);
        subj.setSubGrade(sGrade);
        subj.setSubCredit(sCredit);
        
        System.out.println("\n");
        System.out.println(stud.getStudID());
        System.out.println(stud.getStudName());
        System.out.println(subj.getSubName());
        System.out.println(subj.getSubGrade());
        System.out.println(subj.getSubCredit());
    }
}
