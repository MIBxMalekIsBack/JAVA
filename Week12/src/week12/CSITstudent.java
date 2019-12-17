/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

public class CSITstudent extends Student {
    private String studSubject = "programming";
    
    public CSITstudent(){
        studName = "Abu Bakar";
        studGender = 'M';
        studSubject = "Programming";
    }
    
    public String getTitle(String Gender){
        if (Gender.charAt(0) == 'M')
            return "Mr." + studName + " you must study " + studSubject + "!";
        else
            return "Ms." + studName + " you must study " + studSubject + "!";
    }
}
