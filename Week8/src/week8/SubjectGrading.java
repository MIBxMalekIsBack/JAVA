package week8;

import java.util.*;
public class SubjectGrading {
    public static void main(String[] args){
        String SName, SID;
        int SResult;
        
        Subject Subj = new Subject();
        GradeProcess Process = new GradeProcess();
        Scanner input = new Scanner (System.in);
        
        System.out.print("Subject ID: ");
        SID = input.nextLine();
        System.out.print("Subject name: ");
        SName = input.nextLine();
        System.out.print("Subject Result: ");
        SResult = input.nextInt();
        
        Subj.setSubjectInfo(SID, SName, SResult);
        Process.setGrade(Subj);
        System.out.println("Your Grade: " +Subj.getSubjectGrade());
    }
}
