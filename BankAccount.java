// import libraries as needed here
import java.text.NumberFormat;

/********************************************************************
 * Programmer:    Sarah Ethawi
 * Class:  CS30S
 *
 * Assignment: Practitioner example
 *
 * Description: Practitioner class, this is the super class
 ***********************************************************************/

public class BankAccount {
  //*** Class Variables ***
  public static NumberFormat currency = NumberFormat.getCurrencyInstance();
  private static int nextID = 1000;

  //*** Instance Variables ***

  protected int ID;
  protected double currentBalance;
  protected String firstName;
  protected String lastName;


  //*** Constructors ***

  public BankAccount(){
      firstName = lastName = "Unknown";
      currentBalance = 0.0;
      ID = getNextID();
  }// end BankAccount (no-arg)

  public BankAccount(String fn, String ln, double cb) {
    this.firstName = fn;
    this.lastName = ln;
    this.currentBalance = cb;
    this.ID = getNextID();
  }// end BankAccount (full-arg)


  //*** Getters ***

  public String getFirstName(){
    return firstName;
  }// end getFirstName

  public String getLastName(){
      return lastName;
  }// end getLastName

  public double getCurrentBalance(){
      return currentBalance;
  }// getCurrentBalance

  public int getID(){
      return ID;
  }// end getID

  private int getNextID() {
    return nextID++;
  }// end getNextID

  //*** Setters ***

  public void setFirstName(String fn){
      this.firstName = fn;
  }// end setFirstName

  public void setLastName(String ln){
      this.lastName = ln;
  }// end setLastName

  public void setCurrentBalance(double cb){
      this.currentBalance = cb;
  }// end setCurrentBalance

  public void setID(int i){
      this.ID = i;
  }// end setID

  // *** Utility ***
  public String getInfo(){
      StringBuilder st = new StringBuilder();
      st.append(lastName);
      st.append(" ");
      st.append(firstName.charAt(0));
      st.append(" ").append(ID);
      st.append(": ");
      st.append(currency.format(currentBalance));

      return st.toString();
  }// end getName()
    
  @Override
  public String toString(){
      StringBuilder st = new StringBuilder();
      st.append(firstName);
      st.append(lastName);
      st.append(" ").append(ID);
      return st.toString();
  }

  // Deposit method
  public void deposit(double amt) {
      currentBalance += amt;
  }// end deposit 

} // end of public class 
