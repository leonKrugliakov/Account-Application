//*****************************************************************************************************
//
//      File:            CheckingAccount.java
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
//      1.  Account.java  -  Contains the Account class
//      2.  AccountDriver.java  -  Contains the main method
//      3.  Balanceable.java  -  Contains the Balanceable interface
//      4.  Depositable.java  -  Contains the Depositable interface
//      5.  SavingsAccount.java  -  Contains the SavingsAccount class
//      6.  Transactions.java  -  Contains the Transactions class
//      7.  Validator.java  -  Contains the Validator class
//      8.  Withdrawable.java  -  Contains the Withdrawable interface
//
//*****************************************************************************************************

//package account.application;

public class CheckingAccount extends Account
{
    
    private double monthlyFee;
    
    //*****************************************************************************************************
    
    public CheckingAccount()
    {
        super();
        monthlyFee = 0;
    }
    
    //*****************************************************************************************************
    
    public CheckingAccount(double monthlyFee)
    {
        super();
        this.monthlyFee = monthlyFee;
        this.setBalance(1000);
    }
    
    //*****************************************************************************************************
    
    public void subtractMonthlyFee()
    {
        super.withdraw(monthlyFee);
    }
    
    //*****************************************************************************************************
    
    public double getMonthlyFee()
    {
        return monthlyFee;
    }
}
