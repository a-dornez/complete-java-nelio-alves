/*
 * created to practice usage of static members in cases which the instantiation of objects is not
 * the optimal solution
 */

package section8.OOPIntroduction.exercises.utils;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	public static double dollarExchangeRate;
	public static double amountToBeBought;
	
	public static double ConvertCurrency() {
		double taxOverTransactionValue = amountToBeBought * IOF;
		double valueInBRL = dollarExchangeRate * ( amountToBeBought + taxOverTransactionValue) ;
		return valueInBRL;
	}
}

