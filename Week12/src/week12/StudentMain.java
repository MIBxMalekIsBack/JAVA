/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

public class StudentMain {
    public static void main(String [] args){
    Student student1 = new Student();
    CSITstudent student2 = new CSITstudent();
    COEstudent student3 = new COEstudent();
    Student student4 = new CSITstudent();
    
    System.out.println(student1.getTitle("Male"));
    System.out.println(student2 .getTitle("Male"));
    System.out.println(student3 .getTitle("Male"));
    System.out.println(student4 .getTitle("Male"));
    }
}
