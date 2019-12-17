package weekseven;

public class GPA {
    private Subject courseInfo; //useless 
    private String grade;
    private int point;
    
    public void gradepoint(Subject course){
        grade = course.getSubGrade();
        
        if (grade.equals("A"))
            point = 4;
        else
            if (grade.equals("B"))
                point = 3;
            else
                if (grade.equals("C"))
                    point = 2;
                else
                    if (grade.equals("D"))
                        point = 1;
                    else
                        point = 0;
        course.setSubPoint(point);
    }
}
