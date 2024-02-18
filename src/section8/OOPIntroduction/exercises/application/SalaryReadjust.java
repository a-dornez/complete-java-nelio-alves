/* "Make a program that reads an employee's data (name, gross salary and tax). Then, show their data (name and net salary.
 * Finally, raise their salary based on a given percentage (only gross salary is affected by such percentage), show again 
 * their name followed by readjusted salary. Use the following class model:
 * 				________________________________________________
 * 				|					 Employee					|
 * 				|-----------------------------------------------|
 * 				| - name: String								|
 * 				| - GrossSalary: double							|
 * 				| - tax: double									|
 * 				|-----------------------------------------------|
 * 				| + NetSalary(): double							|
 * 				| + IncreaseSalary( percentage: double ) : void |
 * 				|_______________________________________________|
 * 
 * 		-- Problem by Nelio Alves
 */

package section8.OOPIntroduction.exercises.application;

import java.util.Locale;
import java.util.Scanner;

import section8.OOPIntroduction.exercises.entities.Employee;

public class SalaryReadjust {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("What is this employee's name: ");
		 employee.name = scanner.nextLine();
		System.out.print("What is this employee's gross salary?: ");
		 employee.grossSalary = scanner.nextDouble();
		System.out.print("What is the tax value deduced from their salary?: ");
		 employee.tax = scanner.nextDouble();
		
		System.out.println("\nEmployee: " + employee);
		
		System.out.println("\nWhich percentage to increase salary?: ");
		 employee.IncreaseSalary( scanner.nextDouble() );
		
		System.out.println("\nUpdated Data. Emloyee: " + employee);
		
		scanner.close();
	}
 
}
