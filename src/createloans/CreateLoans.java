/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createloans;

import javax.swing.JOptionPane;

/**
 *
 * @author Thabang
 */
public class CreateLoans 
{

    private static int interest;
     public static void main(String[] args) 
    {    
        BusinessLoan bl = new BusinessLoan();
        PersonalLoan pl = new PersonalLoan();
        int SIZE = 5;
        int[] loans = new int[SIZE];
        BusinessLoan[] businessLoans = new BusinessLoan[SIZE];
        PersonalLoan[] personalLoan = new PersonalLoan[SIZE];
         int x =0;
        int interestRate;
        int QUIT = 999;
        int loanType;
        int loanNr;
        String lastName;
        int loanAmount;
        int MAX_AMOUNT = 100000;
        String loan;
        String LOAN1 = "business";
        int newInterest = 0;
        
        
        
         
        interestRate = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the interest rate"));
        loanType = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the loan type or 999 to exit: " + "\n 1. Short term" +
                     "\n 2. Medium term" + "\n 3. Long term" ));
        
        
        while (x < loans.length && loanType != QUIT)
        {
            lastName = JOptionPane.showInputDialog(null, "Enter your last name");
            loanNr = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your loan number"));
            loanAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your loan amount less than R100 000"));
            loan = JOptionPane.showInputDialog(null, "Is this a business loan or personal loan?");
            
            while (loanAmount > MAX_AMOUNT) {
                loanAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Invlaid entry, enter your loan amount less than R100 000"));
            }
            
            
            if (loan.equals(LOAN1)) 
            {
            bl = new BusinessLoan(interest/100);
            newInterest = (int) bl.getInterestRate();
            }
            
            else {
            pl = new PersonalLoan(interest/100);
            newInterest = (int) pl.getInterestRate();
        }


            ++x;
            interestRate = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the interest rate"));
        loanType = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the loan type or 999 to exit: " + "\n 1. Short term" +
                     "\n 2. Medium term" + "\n 3. Long term" ));
        }
        
        
        JOptionPane.showMessageDialog(null, "Goodbye");
        System.exit(0);
           
             
            
        
    }
    
}
