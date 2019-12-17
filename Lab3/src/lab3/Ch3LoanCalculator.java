package lab3;

import java.util.*;
import java.text.*;
public class Ch3LoanCalculator {
    public static void main(String[] args){
        double loanAmount,annualInterestRate;
        double monthlyPayment, totalPayment,monthlyInterestRate;
        int loanPeriod, numberOfPayments;
        final int MonthInYear = 12;
        DecimalFormat df= new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Loan Amount (Dollar + cents): ");
        loanAmount = input.nextDouble();
        
        System.out.print("Annual Interest Rate [e.g., 9.5]: ");
        annualInterestRate = input.nextDouble();
        
        System.out.print("Loan Period - # of years: ");
        loanPeriod = input.nextInt();
        
        monthlyInterestRate = annualInterestRate/MonthInYear/100;
        numberOfPayments = loanPeriod*MonthInYear;
        monthlyPayment = (loanAmount*monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
        totalPayment = monthlyPayment*numberOfPayments;
               
        //Display Result
        System.out.println("");
        System.out.println("Loan Amount: $" +loanAmount);
        System.out.println("Annual Interest Rate: "+annualInterestRate);
        System.out.println("Loan Period (years): "+loanPeriod);
        System.out.println("\n");
        
        System.out.println("Monthly payment is  $" +df.format(monthlyPayment));
        System.out.println("TOTAL payment is  $" +df.format(totalPayment));
    }
    
}
