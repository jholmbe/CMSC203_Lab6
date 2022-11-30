/* CMSC203 Lab 6
Class: CMSC203 CRN 23999 
Program: Lab 6 
Instructor: Farnaz Eivazi 
Summary of Description: Creating two child classes of BankAccount to demonstrate inheritance concepts learned.
Due Date: 11/29/2022 
Integrity Pledge: I pledge that I have completed the programming assignment independently. 
I have not copied the code from a student or any source.
Student name: Justin Holmberg
*/
public class SavingsAccount extends BankAccount {
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = getAccountNumber() + "-" + savingsNumber;
	}
	public SavingsAccount(BankAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber += 1;
		accountNumber = getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest() {
		deposit((getBalance() * rate)/12);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
}
