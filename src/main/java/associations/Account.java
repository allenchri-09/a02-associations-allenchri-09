package associations;

public class Account{

  // Add instance variables
    private String accountNumber;
    private Customer cust;
    private double balance;

  // A constructor that initializes the account number and Customer, and sets the balance to zero.
public Account(String accountNumber Customer cust){
    this.accountNumber = accountNumber;
    this.cust = cust;
    this.balance = 0;
}

  // getAccountNumber() - Returns a String representing the account number.
public String getAccountNumber(){return accountNumber;}

  // getCustomer() - Returns a reference to the Customer object associated with this account
    public Customer getCustomer(){return cust;}

  // getBalance() - Returns the avaiable balance (may be a decimal value)
  public double getBalance(){return balance;}
}
