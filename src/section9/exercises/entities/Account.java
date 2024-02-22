/*
 * Class created to apply constructors, method overloading and attributes encapsulation
 * -------------------------------------------------------------------------------------------
 *  22-feb-2024: modified constructor with initial deposit after checking instructor solution.
 *  Instead of directly assigning a value to 'accountBalance', now the 'Deposit()' method is
 *  used for an initial deposit value. This makes easier for maintenance as "if some bussiness
 *  rules is modified, you'll need to refactor less code blocks".
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
		Deposit(initialDeposit);	
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

