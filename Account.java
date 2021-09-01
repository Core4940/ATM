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

public class Account {
	
	static String accountnumber;
	static String PIN;
	static int balance;
	static int totalbalance;
	
	public Account(String accountnumber) {
		
	}
	
	public String accountNumber(String accountnumber) {
		Account.accountnumber = accountnumber;
		
		return accountnumber;
	}
	
	public String pin(String PIN) {
		Account.PIN = PIN;
		
		return PIN;
	}
	
	public int availableBalance(int balance, int withdraw, int deposit) {
		Account.balance = balance - withdraw + deposit;
		
		return balance;
	}
	
	public int totalBalance(int totalbalance) {
		Account.totalbalance = balance + totalbalance;
		
		return totalbalance;
	}
	
	
	
	public static void main(String[] args) {
		
	System.out.println("View My Balance Menu");
	System.out.println("Account Number: " + accountnumber);
	System.out.println("PIN: " + PIN);
	System.out.println("Current Balance: " + totalbalance);
	
	
	}
}