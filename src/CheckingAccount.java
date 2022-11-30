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
public class CheckingAccount extends BankAccount {
	static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	public boolean withdraw(double amount) {
		amount += FEE;
		boolean x = super.withdraw(amount);
		return x;
	}
}
