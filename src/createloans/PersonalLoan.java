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
public class PersonalLoan extends Loan
{

    public PersonalLoan(int loanNr, String lastName, int loanAmount, int term, double interestRate) 
    {
        super(loanNr, lastName, loanAmount, term);
        interestRate = interestRate + 0.2;
    }

   
   
}
