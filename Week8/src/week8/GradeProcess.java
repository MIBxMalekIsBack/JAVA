package week8;

public class GradeProcess {
    private String grade;
    private int Sresult;
    

    public void setGrade(Subject subjResult) {
        Sresult = subjResult.getSubjectResult();
        if ((Sresult>=90)&&(Sresult<=100))
            grade = "A";
        else
            if ((Sresult>=80)&&(Sresult<=89))
                grade = "B";
            else
                if ((Sresult>=70)&&(Sresult<=79))
                    grade = "C";
                else
                    if ((Sresult>=60)&&(Sresult<=69))
                        grade = "D";
                    else
                         grade = "F";
        subjResult.setSubjectGrade(grade);
    }
}
