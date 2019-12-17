package week7;

public class Subject {
    private String subName,subID,subGrade;
    private int subCredit;
    
    public Subject(){
        subName = "unassigned";
        subID = "unassigned";
        subGrade = "unassigned";
        subCredit = 0;
    }
    
    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public String getSubGrade() {
        return subGrade;
    }

    
    public void setSubGrade(String subGrade) {
        this.subGrade = subGrade;
    }

    public int getSubCredit() {
        return subCredit;
    }

    public void setSubCredit(int subCredit) {
        this.subCredit = subCredit;
    }
}
