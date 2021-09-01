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

public abstract class Deposit extends Transaction {
	
	public int Deposit(int totalbalance) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Deposit Amount(no decimals): ");
		
		String deposit = input.nextLine();
		
		int depositValue = Integer.parseInt(deposit);
		
		System.out.println("You've entered: " + deposit);
		
		String choice = input.nextLine();
		
		System.out.println("Is this correct? Enter 1 for Yes and 2 for No");

		if(choice.equals("2")) {
			Keypad.Exit();
		}else if(choice.equals("1")) {
			totalbalance = totalbalance + depositValue;
		}
		
		Account.totalbalance = totalbalance;
		
		System.out.println("Your balance is now: " + totalbalance);
		
		return Account.totalbalance;
	}
}
