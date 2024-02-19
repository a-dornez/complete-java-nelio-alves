/*
 * "In a bank, to register a bank account, it's necessary to inform an account number, it's holder name and an initial
 * deposit value that the holder depositied while crating their account. That initial vakue, however, it's opitional,
 * therefore: if account holder does not deposit any amount while registering their account, that account's initial
 * value would be, naturally, zero.
 *
 * "Important: once created, an account number must not be changeable. Though an account holder's name may be modified
 * (as a person's name may be changed after a marriage, for instance).
 * 
 * "Finally, an account's balance must not modified freely in an arbitrary way. There must be a mechanism to protect
 * such a thing. An account's balance must only be increased due to deposits and only be diminished reduced due to
 * withdraws. Consider that for each withdraw value the bank applies an $5.00 tax. Note: an account may get to a negative
 * balance value if it's balance is not enough to perform a withdraw and/or pay the tax.
 * 
 * "You must make a program that executes an accounts registering process, allowing it's user to choose whether they
 * want to make an initial deposit or not. Then, prompt user to make a deposit and then to make a withdraw, always 
 * displaying updated data on account status after each operation.
 * 
 * 	-- Problem by Nelio Alves
 */

package section9.exercises.application;

import java.util.Locale;
import java.util.Scanner;

import section9.exercises.entities.Account;

public class BankingOperations {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nWelcome\nPlease, enter account number: ");
		 int accountID = scanner.nextInt() ;
		System.out.print("Now, enter account holder's name: ");
		 scanner.nextLine();
		 String accountHoldersName = scanner.nextLine();
		System.out.print("Is there a initial deposit?(y/n): ");
		 String initialDepositChoice = scanner.nextLine();
		 
		double initialDeposit = 0;
		if ( initialDepositChoice.equalsIgnoreCase("y") ) {
			System.out.print("Enter initial deposit value: ");
			 initialDeposit = scanner.nextDouble();
		}
		
		Account account = new Account(accountID, accountHoldersName, initialDeposit);
		
		System.out.println("\n" + account.toString() );
		
		System.out.print("\nEnter a deposit value: ");
		 account.Deposit( scanner.nextDouble() );
		System.out.println("Updated account data: \n" + account.toString() );
		
		System.out.print("\nEnter a withdraw value: ");
		 account.Withdrawl( scanner.nextDouble() );
		System.out.println("Updated account data:\n" + account.toString() + "\n");
		
		scanner.close();
	}

}

