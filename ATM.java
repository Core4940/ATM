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

public class ATM {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choice = Integer.parseInt(input.next());
		String output = null;
		
		System.out.println("Main Menu");
		System.out.println("Enter a choice: ");
		
		
		System.out.println("1 - View My Balance");
		System.out.println("2 - Withdraw  cash");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Exit");
		
		
		switch(choice) {
		
		case 1: output = "Going to: View My Balance";
		case 2: output = "Going to: Withdrawal Menu";
		case 3: output = "Going to: Deposit Menu";
		case 4: System.exit(0);
		}
		
		System.out.println(output);
		
	}
}
