package miniproject;

public class Subject {
    private String sCode, sName, sGrade;
    private int sMark;
    private double sCredit, sCredit2=0.0, sGradePoint, GPA,gpa1,gpa2=0.0,a,b;
    private String flag, grade;

    public Subject(){
        sCode = "UNASSIGNED";
        sName = "UNASSIGNED";
        sMark = 0;
        sCredit = 0.0;
    }
    public Subject (String a, String b, int c, double d){
        sCode= a;
        sName= b;
        sMark = c;
        sCredit = d;
        setsGrade();
        setsGradePoint();
    }

    public double getsGradePoint() {
        return sGradePoint;
    }
    
    private void setsGradePoint() {
        switch (grade) {
            case "A":
                sGradePoint = 4;
                break;
            case "B":
                sGradePoint = 3;
                break;
            case "C":
                sGradePoint = 2;
                break;
            case "D":
                sGradePoint = 1;
                break;
            case "F":
                sGradePoint = 0;
                break;
            default:
                break;
        }       
    }

    public String getsGrade() {
        return grade;
    }

    private void setsGrade() {
        if (getsMark()>=90 && getsMark()<=100)
            grade = ("A");
        else
            if (getsMark()>=80 && getsMark()<=89)
                grade = ("B");
            else
                if(getsMark()>=70 && getsMark()<=79)
                    grade = ("C");
                else
                    if(getsMark()>=60 && getsMark()<=69)
                        grade = ("D");
                    else
                        grade = ("F");
    }

    public String getsCode() {
        return sCode;
    }

    public String getsName() {
        return sName;
    }

    public int getsMark() {
        return sMark;
    }

    public double getsCredit() {
        return sCredit;
    }
}
