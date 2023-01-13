//*****************************************************************************************************
//
//      File:            Account.java
//
//      Student:         Leon Krugliakov
//
//      Assignment:      Assignment #5
//
//      Course Name:     Java I
//
//      Course Number:   COSC 2050 - 01
//
//      Due:             February 26, 2020
//
//
//      This program illustrates an interface in which the user is able to 
//      conduct withdrawel and deposit transactions between their checking
//      and savings accounts. The program also calculates the fees and 
//      interest that the user makes at the end and displays the correct
//      output values for both accounts.
//
//      Other files required:
//      1.  AccountDriver.java  -  Contains the main method
//      2.  Balanceable.java  -  Contains the Balanceable interface
//      3.  CheckingAccount.java  -  Contains the CheckingAccount class
//      4.  Depositable.java  -  Contains the Depositable interface
//      5.  SavingsAccount.java  -  Contains the SavingsAccount class
//      6.  Transactions.java  -  Contains the Transactions class
//      7.  Validator.java  -  Contains the Validator class
//      8.  Withdrawable.java  -  Contains the Withdrawable interface
//
//*****************************************************************************************************

//package account.application;

public class Account implements Depositable, Withdrawable, Balanceable
{
    private double balance;
    
    //*****************************************************************************************************
    
    public Account()
    {
        balance = 0;
    }
    
    //*****************************************************************************************************
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    //*****************************************************************************************************
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    //*****************************************************************************************************
    
    public void setBalance(double amount)
    {
        balance = amount;
    }
    
    //*****************************************************************************************************
    
    public double getBalance()
    {
        return balance;
    }
}
