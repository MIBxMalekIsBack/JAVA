package week8;

public class Subject {
    private String subjectID, subjectName, subjectGrade;
    private int subjectResult;
    
    public void setSubjectInfo(String ID, String name, int result) {
        this.subjectID = ID;
        this.subjectName = name;
        this.subjectResult = result;
    }

    public void setSubjectGrade(String subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    public int getSubjectResult() {
        return subjectResult;
    }

    public String getSubjectGrade() {
        return subjectGrade;
    }
}
