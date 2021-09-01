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

public interface Screen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String accountnumber = input.nextLine();
		
		String PIN = input.nextLine();
		
		
		System.out.println("Welcome!");
		System.out.println("Please enter an account number: " + accountnumber);
		
		System.out.println("Please enter your PIN: " + PIN);
		
	}
	
}