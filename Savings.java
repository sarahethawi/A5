// import libraries as needed here
import java.util.ArrayList;
import java.text.NumberFormat;

/********************************************************************
 * Programmer:   Sarah Ethawi
 * Class:  CS30S
 *
 * Assignment: Practitioner example
 *
 * Description: Practitioner class, this is the super class
 ***********************************************************************/

// import libraries as needed here

public class Savings extends BankAccount{
    //*** Class Variables ***
    private double interestRate;
    private double interest;


    //*** Constructors ***
    public Savings(){
        interestRate = 0.0;
    }// end Savings (no-arg)

    public Savings(String fn, String ln, double cb) {
        super(fn, ln, cb);
        this.interestRate = 0.02; // Default interest rate 2%
    }// end Savings (full-arg)

    // *** utilities ***
  
    // Add interest method
    public void addInterest() {
        interest = getCurrentBalance() * interestRate / 12;
        deposit(interest);
    }// end addInterest

    // Withdraw method
    public void withdraw(double amt) {
        if (amt <= getCurrentBalance()) {
            setCurrentBalance(getCurrentBalance() - amt);
        } // end if
        else {
            System.out.println("Withdrawal failed");
        }// end else
    }// end withdraw
} // end of public class
