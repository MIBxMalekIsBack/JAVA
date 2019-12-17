/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.*;
public class WeightRocommend {
    public static void main(String [] args){
        String userName,userGender;
        int userAge;
        double userHeight;
        
        UserInformation Uinfo = new UserInformation();
        WeightAdvice Calc = new WeightAdvice();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name : ");
        userName = input.nextLine();
        System.out.print("Age : ");
        userAge = input.nextInt();
        //input.nextLine();              //skip line
        System.out.print("Gender : ");
        userGender = input.next();
        System.out.print("Height : ");
        userHeight = input.nextDouble();
        
        Uinfo.setUserInfo(userName, userAge, userGender, userHeight);
        Calc.RecommendWeight(Uinfo);
    }
}
