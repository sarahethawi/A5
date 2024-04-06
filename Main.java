// import java libraries here as needed
import java.util.ArrayList;
import java.text.NumberFormat;
/********************************************************************
 * Programmer:  Sarah Ethawi
 * Class:  CS30S
 *
 * Assignment: A5
 * Program Name:  Main 
 *
 * Description: 
 ***********************************************************************/

public class Main { 
    public static void main(String[] args) {
        // Creating an ArrayList of BankAccounts
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Adding accounts
        accounts.add(new Savings("John ", "Doe", 1000.0));
        accounts.add(new Savings("Jane ", "Smith", 2000.0));
        accounts.add(new Chequing("Alice ", "Johnson", 1500.0, 7.50));
        accounts.add(new Chequing("Bob ", "Brown", 300.0));

        // Demonstrate behaviors
        System.out.println("**Deposit**\n");
        for (BankAccount account : accounts) {
            System.out.println(account + " before deposit: " + account.getCurrentBalance());
            account.deposit(500.0);
            System.out.println(account + " after deposit: " + account.getCurrentBalance());
            System.out.println();
        }// end for

        System.out.println("\n**Withdrawal**\n");
        for (BankAccount account : accounts) {
            if (account instanceof Savings) {
                ((Savings) account).withdraw(200.0);
                System.out.println(account);
            }// end if
        }// end for

        System.out.println("\n**Cash Cheque**\n");
        for (BankAccount account : accounts) {
            if (account instanceof Chequing) {
                ((Chequing) account).cashCheque(400.0);
                System.out.println(account);
            }// end if 
        }// end for

        // Printing output
        System.out.println("\n**Account Info**");
        System.out.println("Last Name / First Name / Account ID / Balance");
        for (BankAccount account : accounts) {
            System.out.println(account.getInfo());
        }// end for
    }// end main
}// end Main class
