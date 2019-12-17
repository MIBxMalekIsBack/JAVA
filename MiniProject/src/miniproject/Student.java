package miniproject;

public class Student {
    private String studName, studID, studIntake;
    private char studGender;
    
    public Student(){
        studName = "UNASSIGNED";
        studID = "UNASSIGNED";
        studGender = ' ';
        studIntake = "UNASSIGNED";
    }
    
    public Student(String a, String b, char c, String d){
        studName = a;
        studID = b;
        studGender = c;
        studIntake = d;
    }

    public String getStudName() {
        return studName;
    }

    public String getStudID() {
        return studID;
    }

    public char getStudGender() {
        return studGender;
    }

    public String getStudIntake() {
        return studIntake;
    }
    
}
