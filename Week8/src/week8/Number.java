package week8;

import java.util.*;
public class Number {
    private int numSum, num;
    Scanner input = new Scanner(System.in);
    
    public Number(){
        numSum = 0;
        num = 0;
    }

    public void setNumSum(int numSum) {
        this.numSum = numSum;
    }

    public void setNum(int num) {
        this.num = num;
        
    }
    
    public void sumCal(int count){
        int i;
        for(i=1 ; i <= count ; i++){
            System.out.print("Enter number " + i + ": ");
            this.num = input.nextInt();
            this.numSum = this.getNumSum() + this.num;
        }
    }

    public int getNumSum() {
        return numSum;
    }
}
