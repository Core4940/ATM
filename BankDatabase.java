/****************************************
*
* Student Name: Corey Barron
* Date Due: 4/25/2018
* Date Submitted: 4/24/2018
* Program Name: Final Project
* Program Description: This project is to develop an application software for ATM
*  having a customer console (keyboard and display) for interaction with the customer,
*   a printer for printing customer receipts, and a key-operated 
*   switch to allow an operator to start or stop the machine. 
*
*
****************************************/

import java.util.Scanner;

public class BankDatabase {
	public static void main(String[] args, String accountnumber, String PIN, int totalbalance) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Account Database of: " + accountnumber);
		System.out.print("Account Number: " + accountnumber);
		System.out.print("PIN: " + PIN);
		System.out.print("Total balance: " + totalbalance);
		
		System.out.println("Modify account number " + accountnumber);
		
		 accountnumber = input.nextLine();
		 
		 System.out.println("New account number is: " + accountnumber);
		 
		System.out.println("Modify PIN " +  PIN);
		
		PIN = input.nextLine();
		
		System.out.println("New PIN is: " + PIN);
	}
}