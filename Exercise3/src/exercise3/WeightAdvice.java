/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

public class WeightAdvice {
    
    private String gender,title,name;
    private double UHeight,Recommend;
    private int UAge;
    
    public void RecommendWeight(UserInformation UserInfo){
        UHeight = UserInfo.getHeight();
        gender = UserInfo.getGender();
        name = UserInfo.getName();
        UAge = UserInfo.getAge();
        if (gender.equals("m")||(gender.equals("M")))
            title = "Mr.";
         else
             title = "Ms.";
        
        Recommend = (((UHeight-100)+(UAge/10))*0.90);
        System.out.println(title + " " + name+ "," +"Your advice weight is : "+Recommend+ " Kg.");  
        
    } 
    
}
