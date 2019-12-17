/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

public class Lecturer extends Person {
    private String empNo;

    public Lecturer(){}
   
    public Lecturer(String n, char g, String e){
        super(n,g);
        empNo = e;
    }
    
    public String getEmpNo() {
        return empNo;
    }
    
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    
    public void greet(){
        System.out.println("Hi class, my name is " + name);
    }
    
    public void greet(String wish){
        System.out.println("Hi class, " + wish + ", my name is " + name);
}

}
