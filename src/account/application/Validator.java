//*****************************************************************************************************
//
//      File:            Validator.java
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
//      4.  CheckingAccount.java  -  Contains the CheckingAccount class
//      5.  Depositable.java  -  Contains the Depositable interface
//      6.  Transactions.java  -  Contains the Transactions class
//      7.  SavingsAccount.java  -  Contains the SavingsAccount class
//      8.  Withdrawable.java  -  Contains the Withdrawable interface
//
//*****************************************************************************************************

//package account.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator 
{
    public static int getInt(Scanner sc, String prompt)
    {
        String valid = "n";
        int input = 0;
        
        while(valid.equalsIgnoreCase("n")){
            
            try
            {
                System.out.print(prompt);
                input = sc.nextInt();
                valid = "y";
            }
            catch(InputMismatchException e)
            {
                System.out.println("The input you ahve eneterd is invalid, "
                        + "it must be an integer. Try again!");
                sc.nextLine();
                continue;
            }
            
        }
        
        return input;
    }
    
    //*****************************************************************************************************
    
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max)
    {
        String valid = "n";
        int input = 0;
        
        while(valid == "n")
        {
            
            input = getInt(sc, prompt);
            
            if(input <= min)
            {
                System.out.println("The input you have entered cannot be "
                        + "lower than " + min + ", please try again!");
            }
            else if(input >= max)
            {
                System.out.println("The input you have entered cannot be "
                        + "higher than " + max + ", please enter a value "
                                + "smaller then the amount on the account!");
            }
            else
            {
                valid = "y";
            }
            
        }
        
        return input;
    }
    
    //*****************************************************************************************************
    
    public static String getRequiredString(Scanner sc, String prompt)
    {
        String input = "",
                valid = "n";
        
        while(valid == "n"){
            
            System.out.print(prompt);
            input = sc.nextLine();
            
            if(input.isEmpty())
            {
                System.out.println("Please enter an input, this"
                        + " line can't be left blank!");
            }
            else if(!input.isEmpty())
            {
                valid = "y";
            }
            
        }
        
        return input;
        
    }
    
    //*****************************************************************************************************
    
    public static String getChoiceString(Scanner sc, 
            String prompt, String s1, String s2)
    {
        String valid = "no",
                input = "";
        
        while(valid == "no")
        {
            input = getRequiredString(sc, prompt);
            if(input.equalsIgnoreCase(s1))
            {
                valid = "yes";
            }
            else if(input.equalsIgnoreCase(s2))
            {
                valid = "yes";
            }
            else
            {
                System.out.println("The input you have entered is invalid."
                        + " Please enter 'y' or 'n' as your answer!");
                valid = "no";
            }
        }
        
        return input;
    }
}
