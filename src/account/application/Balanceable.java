//*****************************************************************************************************
//
//      File:            Balanceable.java
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
//      3.  CheckingAccount.java  -  Contains the CheckingAccount class
//      4.  Depositable.java  -  Contains the Depositable interface
//      5.  Transactions.java  -  Contains the Transactions class
//      6.  SavingsAccount.java  -  Contains the SavingsAccount class
//      7.  Validator.java  -  Contains the Validator class
//      8.  Withdrawable.java  -  Contains the Withdrawable interface
//
//*****************************************************************************************************

//package account.application;

public interface Balanceable 
{
    double getBalance();
    void setBalance(double amount);
}
