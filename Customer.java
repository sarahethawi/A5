// import libraries as needed here
import java.text.NumberFormat;
import java.util.ArrayList;
/********************************************************************
 * Programmer:    Sarah Ethawi
 * Class:  CS30S
 *
 * Assignment: Practitioner example
 *
 * Description: Practitioner class, this is the super class
 ***********************************************************************/

public class Customer {
  //*** Class Variables ***
  private static int nextID = 1234;

  //*** Instance Variables ***
  private String firstName;
  private String lastName;
  private int ID;
  private ArrayList<BankAccount> accounts;


  //*** Constructors ***
  public Customer(String fn, String ln) {
      this.firstName = fn;
      this.lastName = ln;
      this.ID = getNextID;
      this.accounts = new ArrayList<>();
  }// end Custmer (full-arg)

  //*** Getters ***
  public String getFirstName() {
        return firstName;
  }

  public String getLastName() {
        return lastName;
  }
  

  //*** Setters ***
   public void setFirstName(String fn) {
      this.firstName = fn;
  }
 
  public void setLastName(String ln) {
        this.lastName = ln;
  }
  
  // *** Utility ***
  
  // Public method to get total balance
  public double getTotalBalance() {
      double totalBalance = 0.0;
      for (BankAccount account : accounts) {
          totalBalance += account.getCurrentBalance();
      }
      return totalBalance;
  }
  
  public void addAccount(BankAccount account) {
        accounts.add(account);
        account.setCustomer(this); // Set association
  }
  
  // Override toString method
  @Override
  public String toString() {
      StringBuilder st = new StringBuilder();
      st.append("Customer: ").append(firstName);
      st.append(" ").append(lastName);
      st.append(" ").append(ID);
      st.append("    Total Balance:").append(BankAccount.currency.format(getTotalBalance()));
  }// end toString()
  
  private String getNextID() {
      return nextID++;
  }// end getNextID
} // end of public class 
