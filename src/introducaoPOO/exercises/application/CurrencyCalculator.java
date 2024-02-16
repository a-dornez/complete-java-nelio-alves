/*
 * "Make a program that reads the current dollar (USD) exchange rate to be bought in reais (BRL) by an user.
 * Show how many reais (BRL) the user will pay for that amount, consider the user will pay a 6% IOF tax over
 * the amount in dollars. Create a class CurrencyConverter to execute calculations."
 *   -- Problem by Nelio Alves  
 */

package introducaoPOO.exercises.application;

import java.util.Locale;
import java.util.Scanner;

import introducaoPOO.exercises.utils.CurrencyConverter;

public class CurrencyCalculator {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nWelcome\nPlease, what is the US dollar price?: ");
		 CurrencyConverter.dollarExchangeRate = scanner.nextDouble();
		System.out.print("How many dollars will be bought?: ");
		 CurrencyConverter.amountToBeBought = scanner.nextDouble();
		
		System.out.printf("\nAmount to be paid in reais(BRL): %.2f\n", CurrencyConverter.ConvertCurrency() );
		
		scanner.close();
	}
}

