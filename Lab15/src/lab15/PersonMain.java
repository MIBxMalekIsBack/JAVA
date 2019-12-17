/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

import java.util.*;
public class PersonMain {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter person's name: ");
        String pname = scan.next();
        System.out.print("Enter person's gender: ");
        String pgen = scan.next();
        char pg = pgen.charAt(0);
        Person p = new Person(pname, pg);
        System.out.print("Enter lecturer's name: ");
        String n = scan.next();
        System.out.print("Enter lecturer's gender: ");
        String gender = scan.next();
        char g = gender.charAt(0);
        System.out.print("Enter lecturer's employee no: ");
        String no = scan.next();
        Lecturer l = new Lecturer(n, g, no);
        System.out.print("Enter student's name: ");
        String nn = scan.next();
        System.out.print("Enter student's gender: ");
        String ge = scan.next();
        char gg = ge.charAt(0);
        System.out.print("Enter student's employee no: ");
        String id = scan.next();
        Student s = new Student(nn, gg, id);
        p.greet();
        l.greet();
        s.greet();

    }
}
