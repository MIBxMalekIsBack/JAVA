package lab16;

import javax.swing.*;
public class Input {
    public static void main (String [] args ){
        String name;
        int age;
        double cgpa;
               
        name = JOptionPane.showInputDialog(null, "Enter your name : ");
        String ageInStr = JOptionPane.showInputDialog(null, "Enter you age : ");
        age = Integer.parseInt(ageInStr);
        String cgpaInStr = JOptionPane.showInputDialog(null, "Enter your cgpa : ");
        cgpa = Double.parseDouble(cgpaInStr);
        Student s = new Student (name, age, cgpa);
        JOptionPane.showMessageDialog(null, s.toString());
        
        
        
        
        
    }
}
