/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jiayi;
import java.util.*;
public class Subject {
    private String sCode, sName,sGrade,flag;
    private int sMark;
    private Double creditHours,gradePoint,GP;

    //public Subject(String sCode, String sName, int sMark, Double sCredit) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    public Subject(){   //overload constructor
        sCode = " ";
        sName = " ";
        sMark = 0;
        creditHours = 0.0;
    }
    

   public Subject(String sCode,String sName,int sMark,Double creditHours){
       this.sCode= sCode;
       this.sName = sName;
       this.sMark = sMark;
       this.creditHours = creditHours;
      
    }
   
   Scanner input = new Scanner(System.in);
   
    public String getSubCode() {
        return sCode;
    }
    
    public String getSubName() {
        return sName;
    }

    public int getSubMark() {
        return sMark;
    }
    
    public String getSubGrade() {
        return sGrade;
    }

    public Double getcreditHours() {
        return creditHours;
    }

    public Double getgradePoint() {
        return GP;
    }

    
    public void setcomputeGrade(){
        if(sMark >= 90 && sMark <= 100)
                {
                    this.sGrade = "A";
                    System.out.print("A\n");
                 
                }
                else
                    if(sMark >= 80 && sMark <= 89)
                {
                    this.sGrade = "B";
                    System.out.print("B\n");
                   
                }
                else
                        if(sMark >= 70 && sMark <= 79)
                        {
                            this.sGrade = "C";
                            System.out.print("C\n");
                            
                        }
                else
                            if(sMark >= 60 && sMark <= 69)
                            {
                                this.sGrade = "D";
                                System.out.print("D\n");
                                
                            }
                else
                          if(sMark >= 0 && sMark <= 59)
                          {
                                this.sGrade = "F";
                                System.out.print("F\n");
                               
                          }
              
                               
    }
    
    public void setgradePoint(){
        if(sGrade.equals("A") )
          GP = 4.0;
        else
            if(sGrade.equals("B"))
                GP = 3.0;
        else
                if(sGrade.equals("C"))
                    GP = 2.0;
        else
                    if(sGrade.equals("D"))
                        GP = 1.0;
        else
                        if(sGrade.equals("F"))
                            GP = 0.0;
        
    }
}
