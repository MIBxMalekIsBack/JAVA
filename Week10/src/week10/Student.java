/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

public class Student {
     private String studName;
    private int studAge;
    
    public Student(){
        this.studName = "unassigned";
        this.studAge = 0;
    }
    
    public Student(String n, int a){
        this.studName = n;
        this.studAge = a;
    }

    public String getStudName() {
        return studName;
    }

    public int getStudAge() {
        return studAge;
    }
}
