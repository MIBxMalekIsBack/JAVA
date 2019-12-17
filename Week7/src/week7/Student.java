package week7;

public class Student {
    private String studName,studID;
    
    public Student(){
        studID = "unassigned";
        studName = "unassigned";
    }
    
    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudID() {
        return studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }
}
