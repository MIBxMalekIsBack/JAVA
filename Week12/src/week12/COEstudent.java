/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

public class COEstudent extends Student {
    private String studSubject;
    public COEstudent(){
        studName = "IronMan";
        studGender = 'M';
        studSubject = "Mathematics";
    }
    public String getTitle(String Gender){
        if (Gender.charAt(0) == 'M')
            return "Mr." + studName + " you must study " + studSubject + "!";
        else
            return "Ms." + studName + " you must study " + studSubject + "!";
    }
    
}
