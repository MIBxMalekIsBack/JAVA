package weekseven;

public class Subject {
    private String subID,subName,subGrade;
    private int subCredit, subPoint;
    
    public void setSubinfo(String code, String name, String grade, int credit)
    {
        this.subID = code;
        this.subName = name;
        this.subGrade = grade;
        this.subCredit = credit;
        
    }

    public void setSubPoint(int subPoint) {
        this.subPoint = subPoint;
    }

    
    public String getSubName() {
        return subName;
    }

   
    public String getSubID() {
        return subID;
    }

    
    public String getSubGrade() {
        return subGrade;
    }

    
    public int getSubCredit() {
        return subCredit;
    }

    
    public int getSubPoint() {
        return subPoint;
    }
}
