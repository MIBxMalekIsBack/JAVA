/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jiayi;

/**
 *
 * @author ABDUL MALEK
 */
public class studentFile {
     private String studName;
    private String studGender;
    private String studID;
    private String studIntake;
    
    public studentFile(){                          //default constructor
        this.studName = "Unassigned";
        this.studGender = "Unassigned";
        this.studID = "Unassigned";
        this.studIntake = "Unassigned";
    }
        public studentFile(String n, String g, String c, String i){
            studName = n;
            studGender = g;
            studID = c;
            studIntake = i;
    }
        
        public String getStudName (){
            return studName;
    }
        
       
        public String getTitle(String Gender){
            if(Gender.charAt(0) == 'M')
                return "Mr. ";
            else
                return"Ms. ";
        }
        
        public String getStudID(){
            return studID;
        }
        
        
        
        public String getStudIntake(){
            return studIntake;
        }
}
