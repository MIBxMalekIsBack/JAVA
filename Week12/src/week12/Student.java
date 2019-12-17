/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

public class Student {
    protected String studName;
    protected char studGender;
    protected int studAge;
    protected String studSubject;
    
    public Student(){
        studName = "Ali Baba";
        studGender = 'M';
        studAge = 18;
        studSubject = "English";
    }
    
    public Student(String Name, String Gender, int Age){
        studName = Name;
        studGender = Gender.charAt(0);
        studAge = Age;
    }
    public String getTitle(String Gender){
        if (Gender.charAt(0) == 'M')
            return "Mr." + studName + " you must study " + studSubject + "!";
        else
            return "Ms." + studName + " you must study " + studSubject + "!";
    }
}
