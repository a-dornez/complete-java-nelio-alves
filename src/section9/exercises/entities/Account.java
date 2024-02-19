/*
 * Class created to apply constructors, method overloading and attributes encapsulation
 */

package section9.exercises.entities;

public class Account {
	
	private int accountID;
	private String accountHoldersName;
	private double accountBalance;
	private static final double WITHDRAWL_TAX = 5.00;
	
	public Account( int accountID, String accountHoldersName, double initialDeposit ) {
		this.accountID = accountID;
		this.accountHoldersName = accountHoldersName;
		this.accountBalance = initialDeposit;
	}
	
	public Account( int accountID, String accountHoldersName ) {
		this.accountID = accountID;
		this.accountHoldersName = accountHoldersName;
	}
	
	public int getAccount() {
		return accountID;
	}
	
	public String getAccountHoldersName() {
		return accountHoldersName;
	}
	
	public void setAccountHoldersName( String accountHoldersName ) {
		this.accountHoldersName = accountHoldersName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void Deposit( double depositValue ) {
		accountBalance += depositValue;
	}
	
	public void Withdrawl( double withdrawlValue ) {
		accountBalance = accountBalance - withdrawlValue - WITHDRAWL_TAX;
	}
	
	public String toString() {
		return "Account " + accountID
				+ ", Holder: " + accountHoldersName
				+ ", Balance: $ " + String.format("%.2f", accountBalance);
	}
}

