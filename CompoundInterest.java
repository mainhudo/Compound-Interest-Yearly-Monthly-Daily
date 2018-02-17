/*
Mai Nhu Do (Moira)
02/15/2018
Create a Compound interest table
*/
package compoundinterest;
import java.util.Scanner;

public class CompoundInterest {

   
    public static void main(String[] args) {

    double interest_rate_annually = 0;
    double year = 0 ;
    double month = 0;
    double day = 0;
    double yearlyAmt = 0;
    double monthlyAmt = 0;
    double dailyAmt = 0;
    Scanner kb = new Scanner(System.in);
    // you only need one Scanner above
    // kb  can be anyname except system names such as "double"
    System.out.println("Enter your starting balance in the account:");
    double userInputBalance = kb.nextDouble();
    yearlyAmt = userInputBalance;   // All amount = intinital amount 
    monthlyAmt = userInputBalance;
    dailyAmt = userInputBalance;
    
    System.out.println("Enter your years you will be saving");
    year = kb.nextDouble();
    
    // everytime I do type the nextDouble, it prompts me to ask for user input
    
    System.out.println("Enter your interest rate:");
    interest_rate_annually = kb.nextDouble();
    interest_rate_annually = interest_rate_annually/100;
    
     System.out.println("|year  |yearly   |monthly|  daily|");
     for (int i = 1; i <= year; i++){      
        
        yearlyAmt = yearlyAmt + interest_rate_annually*yearlyAmt;
        
        for (int j = 1; j <= 12; j++){
          monthlyAmt = monthlyAmt + (interest_rate_annually/12)*monthlyAmt;
        }
        // THESE FOR LOOPS ARE SEPARATE SCOPE 
        for (int d = 1; d <= 365; d ++) {
            dailyAmt = dailyAmt + (interest_rate_annually/365)*dailyAmt;
        } 
// A for loop inside a for loop, the inner will run inside the outer       
//        System.out.println("For " + year + " years an initial " + userInputBalance + " cost compounded at a rate of " + interest_rate_annually + " will grow to " + yearlyAmt);
//        System.out.println("For " + month + " months an initial " + userInputBalance + " cost compounded at a rate of " + interest_rate_annually + " will grow to " + monthlyAmt);
//        System.out.println("For " + day + " days an initial " + userInputBalance + " cost compounded at a rate of " + interest_rate_annually + " will grow to " + dailyAmt);
        
        System.out.format("|%6d|$%.2f|$%.2f|$%.2f|\n", i, yearlyAmt, monthlyAmt, dailyAmt);
        
    }
     }
     
}
    

