/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jiayi;
import java.text.DecimalFormat;
import java.util.*;
public class GPA1 {
    public static void main(String [] args){
        String sCode, sName, sGrade,flag,option,studName,studGender,studID,studIntake;
        int sMark= 0,i=0,index = 0;
        double cHours=0.0,GP,GPA = 0.00,TotalPoint = 0.0,TotalCredit  = 0.0,point = 0.0,creditHours = 0.0;
        boolean status = true;
        
        
        final int size = 4;
        //subjectFile course;
        Subject[] subjectList = new Subject[size];  
        
        Scanner input =  new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
       
        
        System.out.print("Student Name: ");
        studName = input.nextLine();
        System.out.print("Student Gender: ");
        studGender = input.nextLine();
        System.out.print("Student ID: ");
        studID = input.nextLine();
        System.out.print("Student Intake: ");
        studIntake = input.nextLine();
        
        studentFile stud = new studentFile(studName, studGender, studID, studIntake);   //parameter passing
        
        
        
        do{
                System.out.print("\n\nSubject code: ");
                sCode = input.nextLine();

                System.out.print("Subject Name: ");
                sName = input.nextLine();

                status = true;
                while(status){
                     System.out.print("Subject Mark: ");
                try{
                   sMark = input.nextInt();
                   status = false;
                }catch(InputMismatchException e){
                    System.out.print("Please enter your marks again.");
                    input.next();
                    status = true;
                }
                    if(sMark < 0 || sMark > 100)
                    {
                    System.out.println("Invalid Marks!!\n\n");
                    status = true;
                }
           }

              
                  status = true;
                  while(status){
                      System.out.print("SubjectCredit Hours: ");
                       try{
                           cHours = input.nextDouble();
                           status= false;
                  }catch(InputMismatchException e){
                     System.out.print("Please enter the credit hours again.");
                     input.next();
                     status = true;
                  }   
                   if(cHours < 1 || cHours > 4 )
                   {
                        System.out.println("Invalid Credit Hours!!");
                        status = true;
                   }
                
            }
              Subject course = new Subject(sCode,sName,sMark,cHours);
              subjectList[index] = course;
              index++;
              flag = input.nextLine();
              System.out.print("Do you want to continue? [Y/N ]: "); 
              option = input.nextLine();
        }while (index < 5 && option.equals("Y"));
        
        
        for(i =0; i< index; i++){
            System.out.println(subjectList[i].getgradePoint());
           point = subjectList[i].getgradePoint();
          creditHours = subjectList[i].getcreditHours();
            GP = point*creditHours;
            //GP = subjectList[i].getgradePoint()*subjectList[i].getcreditHours();
            TotalPoint+= GP;
            
            //Hours = subjectList[i].getcreditHours();
            TotalCredit += creditHours;
        }
        
        for(i=0 ; i < index; i++){
            System.out.println("Subject Code: " + subjectList[i].getSubCode());
            System.out.println("Subject Name: " + subjectList[i].getSubName());
            System.out.println("Subject Mark: " + subjectList[i].getSubMark());
            System.out.println("Subject Grade: " + subjectList[i].getSubGrade());
            System.out.println("Subject Grade Point: " + subjectList[i].getgradePoint());
            System.out.println("Subject Credit Hours: " + subjectList[i].getcreditHours());
            flag = input.nextLine();
        }
        
        GPA = TotalPoint / TotalCredit;
        flag = input.nextLine();
        
        System.out.print("Your GPA for this semester is: " + df.format(GPA) + "." + "\n");
    }
}
