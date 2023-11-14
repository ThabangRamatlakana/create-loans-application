/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createloans;

/**
 *
 * @author Thabang
 */
public abstract class Loan implements LoanConstants
{
    private int loanNr;
    private String lastName;
    private int loanAmount;
    private double interestRate;
    private int term;

    public Loan(int loanNr, String lastName, int loanAmount, int term) 
    {
        this.loanNr = loanNr;
        this.lastName = lastName;
        this.loanAmount = loanAmount;
        this.term = term;
    }

    public double getInterestRate() {
        return interestRate;
    }

    
    

    @Override
    public String toString() {
        return "Loan{" + "loanNr=" + loanNr + ", lastName=" + lastName + ", loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", term=" + term + '}';
    }
    
    
    
}
