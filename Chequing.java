// import libraries as needed here
import java.util.ArrayList;
import java.text.NumberFormat;

/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Practitioner example
 *
 * Description: Practitioner class, this is the super class
 ***********************************************************************/

// import libraries as needed here

public class Chequing extends BankAccount{
    //*** Class Variables ***
    private double fee;

    // Constructors
    public Chequing(String fn, String ln, double cb, double f) {
        super(fn, ln, cb);
        this.fee = f;
    }// end Chequing (no-arg)

    public Chequing(String fn, String ln, double cb) {
        super(fn, ln, cb);
        this.fee = 5.00; // Default fee $5.00
    }// end Chequing (full-arg)

    // Cash cheque method
    public void cashCheque(double amt) {
        if (amt > getCurrentBalance()) {
            setCurrentBalance(getCurrentBalance() - amt - 15.00); // Additional $15 overdraft fee
        }// end if
        else {
            setCurrentBalance(getCurrentBalance() - amt - fee);
        }// end else
    }// end cashCheque
} // end of public class
