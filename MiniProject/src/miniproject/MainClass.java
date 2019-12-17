package miniproject;

import java.util.*;
import java.text.*;
public class MainClass {
    public static void main (String [] args) {
        
        final int size=10;
        String name, ID, Gender, Intake, flag=" ", cont, sCode, sName;
        int sMark = 0, sCredit = 0, i, j=1, k, x=0;
        double point, TotalPoint = 0.0, CreditHour, TotalCredit = 0.0, GPA;
        char option, gender2;
        boolean status = true;
        
        Subject subjInfo;
        Subject[] subjList = new Subject[size];
        Student stud = new Student();
        Scanner input = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("*************************************************");
        System.out.println("\tWelcome to GPA Calculator");
        System.out.println("*************************************************");
        
        System.out.print("\nStudent Name: ");
        String StudName = input.nextLine(); 
        name = StudName.toUpperCase();
        System.out.print("Student ID: ");
        String StudID = input.next();
        ID = StudID.toUpperCase();
        
        
        do{
        System.out.print("Gender: ");
        Gender = input.next();
        String gender1 = Gender.toUpperCase();
        gender2 = gender1.charAt(0);
        if(gender2 != 'M' && gender2 != 'F')
            System.out.println("Invalid Gender!! [Male/M][Female/F]\n");
        }while(gender2 != ('M') && gender2 != ('F'));
            
        
        flag=input.nextLine();
        System.out.print("Student Intake: ");
        String StudIntake = input.nextLine();
        Intake = StudIntake.toUpperCase();
        stud = new Student (name, ID, gender2, Intake);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.print("\nSubject Code: ");
            String Scode = input.nextLine();
            sCode = Scode.toUpperCase();
            
            System.out.print("Subject Name: ");
            String subName = input.nextLine();
            sName = subName.toUpperCase();
                
            status = true;
            while(status){
                System.out.print("Subject Mark: ");
                try{
                    sMark = input.nextInt();
                    status = false;
                    
                }catch (InputMismatchException e)
                 {
                    System.out.println("Enter integer value !!");
                    input.next();
                    status = true;
                    
                 }
                if (sMark<0 || sMark>100)
                    {
                        System.out.println("INVALID MARK! [0-100]\n");
                        status = true;
                    }
                
            }
            
            status = true;
            while(status){
                System.out.print("Subject Credit Hour: ");
                try{
                    sCredit = input.nextInt();
                    status = false;
                    
                }catch(InputMismatchException e)
                {
                    System.out.println("Enter integer value !!");
                    input.next();
                    status = true;
                }
                if (sCredit <1 || sCredit>4)
                {
                        System.out.println("INVALID CREDIT HOUR! [1-4]\n");
                        status = true;
                }
            }
                
            do{
                System.out.print("Do you want continue add next subject [Y/N] : ");
                cont = input.next();
                String cont2 = cont.toUpperCase();
                option = cont2.charAt(0);
                if(option != 'Y' && option != 'N')
                    System.out.println("Invalid Option entered !! [Yes/Y][No/N]\n");
            }while (option != 'Y' && option != 'N'); 
            flag = input.nextLine();
            subjInfo = new Subject (sCode, sName, sMark, sCredit);
            subjList [0] = subjInfo;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        do{
            if(j>4)
            {
                System.out.println("\n\nSORRY! YOU CANNOT ADD MORE SUBJECT! "
                                   + "MAXIMUM SUBJECT IS 5");
                break;
            }

            do{
                x=1;
                System.out.print("\nSubject Code: ");
                Scode = input.nextLine();
                sCode = Scode.toUpperCase();
                for (k=0; k<j; k++)
                    {
                    if(sCode.equals(subjList[k].getsCode()))
                        {
                            System.out.print("Duplication Occur!\nYou have entered this Subject Code before.\n");
                            x=2;
                        }
                    }
                
            }while(x==2);   

            
            System.out.print("Subject Name: ");
            subName = input.nextLine();
            sName = subName.toUpperCase();
                
            status = true;
            while(status){
                System.out.print("Subject Mark: ");
                try{
                    sMark = input.nextInt();
                    status = false;
                    
                }catch (InputMismatchException e)
                 {
                    System.out.println("Enter integer value !!");
                    input.next();
                    status = true;
                    
                 }
                if (sMark<0 || sMark>100)
                    {
                        System.out.println("INVALID MARK! [0-100]\n");
                        status = true;
                    }
                
            }
            
            status = true;
            while(status){
                System.out.print("Subject Credit Hour: ");
                try{
                    sCredit = input.nextInt();
                    status = false;
                    
                }catch(InputMismatchException e)
                {
                    System.out.println("Enter integer value !!");
                    input.next();
                    status = true;
                }
                if (sCredit <1 || sCredit>4)
                {
                        System.out.println("INVALID CREDIT HOUR! [1-4]\n");
                        status = true;
                }
            }
            
            subjInfo = new Subject (sCode, sName, sMark, sCredit);
            subjList [j] = subjInfo; 
            j++;
            do{
                System.out.print("Do you want continue add next subject [Y/N] : ");
                cont = input.next();
                String cont2 = cont.toUpperCase();
                option = cont2.charAt(0);
                if(option != 'Y' && option != 'N')
                {
                    System.out.println("Invalid Option entered !! [Yes/Y][No/N]\n");
                }
                flag = input.nextLine();
            }while (option != 'Y' && option != 'N');
        }while(j<6 && option == 'Y');
        
        
        System.out.println("\n\n\n\n************************************************************************************************");
        System.out.println("\t\tThis is your information and result");
        System.out.println("************************************************************************************************");
        System.out.println("\n\n\t\tStudent Name : " + name + "\n" + 
                           "\t\tStudent ID : " + ID + "\n" + 
                           "\t\tGender : " + gender2 + "\n" + 
                           "\t\tStudent Intake : " + Intake +"\n");
        
        for (i = 0 ; i < j ; i++){
            point= subjList[i].getsGradePoint()*subjList[i].getsCredit();
            TotalPoint += point;
            CreditHour = subjList[i].getsCredit();
            TotalCredit += CreditHour;
        }
        
        for (i = 0 ; i < j ; i++){
            System.out.println("\t\tSubject Code : " + subjList[i].getsCode());
            System.out.println("\t\tSubject Name : " + subjList[i].getsName());
            System.out.println("\t\tSubject Mark : " + subjList[i].getsMark());
            System.out.println("\t\tSubject Grade : " + subjList[i].getsGrade());
            System.out.println("\t\tSubject Grade Point : " + subjList[i].getsGradePoint());
            System.out.println("\n");
        }
        GPA = TotalPoint/TotalCredit;
        System.out.println("\t\tYour GPA is "+ df.format(GPA));
        if(GPA>=3.50 && GPA<=4)
            System.out.println("\n\t\tCongratulation! You are listed in Dean List. \n\t\tFIRST CLASS HONOR");
        else
            if(GPA>=3 && GPA<3.5)
                System.out.println("\t\tCongratulation! You get Second Class Honor");
            else
                System.out.println("\t\tTry do the best next semester !");
    }
}


