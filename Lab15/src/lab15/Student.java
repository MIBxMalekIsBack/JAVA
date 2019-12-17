/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

public class Student extends Person {
    private String studentID;
    
    public Student(){}
    
    public Student(String n, char g, String i){
        super(n, g);
        studentID = i;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
   
    public void greet(){
        System.out.println ( "Hi madam, my name is " + name);
    }
}
