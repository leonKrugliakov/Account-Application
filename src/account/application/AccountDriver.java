//*****************************************************************************************************
//
//      File:            AccountDriver.java
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

import java.text.NumberFormat;
import java.util.Scanner;

public class AccountDriver 
{
    public static void main(String[] args)
    {
        
        NumberFormat nF = NumberFormat.getCurrencyInstance();
        Scanner sc = new Scanner(System.in);
        
        CheckingAccount checking = new CheckingAccount(1.00);
        SavingsAccount savings = new SavingsAccount(10.00);
        
        boolean contin = true;
        int amountResponse;
        String actionResponse,
                accountResponse,
                continResponse;
        
        System.out.println("Welcome to the Account application\n");
        System.out.println("Starting Balances");
        System.out.println("Checking: " + nF.format(checking.getBalance()));
        System.out.println("Savings: " + nF.format(savings.getBalance()));
        System.out.println("\nEnter the transactions for the month\n");
        
        while(contin)
        {
            actionResponse = Validator.getChoiceString(sc, "Withdrawal "
                    + "or deposit? (w/d): ", "w", "d");
            accountResponse = Validator.getChoiceString(sc, "Checking "
                    + "or savings (c/s): ", "c", "s");
            
            if(accountResponse.equals("c"))
            {
                amountResponse = Validator.getIntWithinRange(sc, "Amount? ", 
                        0, (int)checking.getBalance());
                sc.nextLine();
                
                checking.subtractMonthlyFee();
                
                if(actionResponse.equals("w"))
                {
                    Transactions.withdraw(checking, amountResponse);
                }
                else if(actionResponse.equals("d"))
                {
                    Transactions.deposit(checking, amountResponse);
                }
            }
            else if(accountResponse.equals("s"))
            {
                amountResponse = Validator.getIntWithinRange(sc, "Amount? ", 
                        0, (int)savings.getBalance());
                sc.nextLine();
                
                if(actionResponse.equals("w"))
                {
                    Transactions.withdraw(savings, amountResponse);
                }
                else if(actionResponse.equals("d"))
                {
                    Transactions.deposit(savings, amountResponse);
                }
            }
            
            continResponse = Validator.getChoiceString(sc, 
                    "\nContinue? (y/n): ", "y", "n");
            System.out.println();
            
            if(continResponse.equals("y"))
            {
                contin = true;
            }
            else if(continResponse .equals("n"))
            {
                contin = false;
            }
        }
        
        savings.calculateMonthlyInterestPayment();
        
        System.out.println("\nMonthly Payments and Fees");
        System.out.println("Chacking fee:\t\t\t" + 
                nF.format(checking.getMonthlyFee()));
        System.out.println("Savings interest payment:\t" + 
                nF.format(savings.getMonthlyInterestPayment()));
        
        System.out.println("\nFinal Balances:");
        System.out.println("Checking:\t " + nF.format(checking.getBalance()));
        System.out.println("Savings:\t" + nF.format(savings.getBalance()));
    }
}

/*
Welcome to the Account application

Starting Balances
Checking: $1,000.00
Savings: $1,000.00

Enter the transactions for the month

Withdrawal or deposit? (w/d): w
Checking or savings (c/s): c
Amount? 500

Continue? (y/n): y

Withdrawal or deposit? (w/d): d
Checking or savings (c/s): s
Amount? 200

Continue? (y/n): n


Monthly Payments and Fees
Chacking fee:			$1.00
Savings interest payment:	$12.00

Final Balances:
Checking:	 $499.00
Savings:	$1,212.00
*/