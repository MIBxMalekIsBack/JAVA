/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;


public class Student {
    //data member
    private String name;
    private String email;
    
    //Constructor
    public Student(){
        name = "Unassigned";
        email= "unassigned";
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String studentName){
        name= studentName;
    }
    
    public void setEmail(String address){
        email= address;
    }
}
