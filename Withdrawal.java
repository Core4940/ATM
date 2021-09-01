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

public abstract class Withdrawal extends Transaction{
	
	int totalbalance;
	
	
	public int Withdraw(int totalbalance) {
		
		Scanner input = new Scanner(System.in);
		
		int choice = Integer.parseInt(input.next());
		int withdraw = 0;
		
		System.out.println("Withdraw Menu");
		System.out.println("You currently have: " + Account.totalbalance);
		System.out.println("Chose a withdrawal amount: ");
		
		
		System.out.println("1 - $20");
		System.out.println("2 - $40");
		System.out.println("3 - $60");
		System.out.println("4 - $100");
		System.out.println("5 - $200");
		System.out.println("6 - Cancel Transaction");
		
		
		switch(choice) {
		
		case 1: withdraw = 20;
		case 2: withdraw = 40;
		case 3: withdraw = 60;
		case 4: withdraw = 100;
		case 5: withdraw = 200;
		case 6: Keypad.Exit();;
		}
		
		System.out.println(withdraw);
		
	
	

			
			if(totalbalance < withdraw) {
				System.out.println("You currently have: " + totalbalance + " , you wish to withdraw: " 
			+ withdraw + ". You cannot withdraw more than your totalbalance ");
			}
			
		return Account.totalbalance - withdraw;
		
		}
}
