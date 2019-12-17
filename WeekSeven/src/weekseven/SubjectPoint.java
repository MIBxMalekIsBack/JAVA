package weekseven;

public class SubjectPoint {
    public static void main(String[] args){
        Subject course = new Subject();
        GPA pointCal = new GPA();
        
        course.setSubinfo("CISB254", "JAVA", "A", 4);
        
        System.out.println("Subject ID    : " +course.getSubID());
        System.out.println("Subject Name  : " +course.getSubName());
        System.out.println("Credit Hours  : " +course.getSubCredit());
        System.out.println("Subject Grade : " +course.getSubGrade());
        
        pointCal.gradepoint(course);
        System.out.println("Subject grade point : " +course.getSubPoint());
    }
}
