/*
 * "Write a program that reads an integer number 'N' and then reads data (id, name and salary) of a 'N' amount of employees.
 * Id values must not be repeated.
 * 
 * "Then, apply an x per cent raise on a given employee salary. To perform this, the program must read an id and x value. 
 * If inserted Id does not exist, print a message and abort operation. 
 * 
 * "Finally, print an updated employees list. Remember to apply encapsulation, to prevent salary values from being
 * arbitrarily modified. A salary should be only increased by a raise operation based on a percentage."
 * 		-- Problem by Nelio Alves
 * 
 * @ TODO: add Id value validator upon registration: an Id value must not be repeated;
 */

package section10.exercises.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section10.exercises.entities.Employee;

public class EmployeeManager {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many employees will be registered?: ");
		int employeesQuantity = scanner.nextInt();
		System.out.print("\n");
		
		List<Employee> employees = new ArrayList<>();
		
		//collects employee's data
		for ( int i = 0; i < employeesQuantity; i++ ) {
			System.out.printf( "Employee #%d:\n", i + 1 );
			System.out.print("Id: ");
			Integer employeeId = scanner.nextInt();
			
				//following comments are attempts at an Id value validator
				/*boolean invalidId = false;
				//validates inserted id and collects readjust rate if id is valid
				for ( int j = 0; j < employees.toArray().length; j++ ) {
					if ( employees.get(j).getEmployeeId() == employeeId ) {
						
						System.out.print("Enter the percentage: ");
						double readjustRate = scanner.nextDouble();
						
						employees.get(j).SalaryRaise(readjustRate);
						
						invalidId = true;
					}
				}
				
				if ( invalidId == true ) {
					System.out.println("\nThis Id does not exist!");
				}
				*/
				
				/*boolean invalidId;
				Integer employeeId;
				do {
					employeeId = scanner.nextInt();
					invalidId = IdRegisterValidator(employees, employeeId);
					if (invalidId == true ) {
						System.out.print("This Id already exxists,please insert another value: ");
					}
				} while ( invalidId == true ); 
				*/
			
				/*boolean invalidId = false;
				do {
					System.out.print("This Id already exists, please insert another value: ");
					employeeId = scanner.nextInt();
					invalidId = IdRegisterValidator(employees, employeeId);
				} while (invalidId == true);
				*/
			
			System.out.print("Name: ");
			scanner.nextLine();
			String employeeName = scanner.nextLine();
			System.out.print("Salary: ");
			Double employeeSalary = scanner.nextDouble();
			
			employees.add(i, new Employee(employeeId, employeeName, employeeSalary));
			
			System.out.print("\n");
		}
		
		System.out.print("Enter the employee Id that will have a salary increase: ");
		int employeeId = scanner.nextInt();
		
		//validates inserted id and collects readjust rate if id is valid
		Employee chosenEmployee = employees.stream().filter(x -> x.getEmployeeId() == employeeId ).findFirst().orElse(null);
		if ( chosenEmployee != null ) {
			System.out.print("Enter the readjust percentage: ");
			double readjustRate = scanner.nextDouble();
			
			chosenEmployee.SalaryRaise(readjustRate);
			
		}
		else {
			System.out.println("\nThis Id does not exist!");
		}
		
		/*
		boolean invalidId = true;
		//validates inserted id and collects readjust rate if id is valid
		for ( int i = 0; i < employees.toArray().length; i++ ) {
			if ( employees.get(i).getEmployeeId() == employeeId ) {
				
				System.out.print("Enter the percentage: ");
				double readjustRate = scanner.nextDouble();
				
				employees.get(i).SalaryRaise(readjustRate);
				
				invalidId = false;
			}
		}
		
		if ( invalidId == true ) {
			System.out.println("\nThis Id does not exist!");
		}
		*/
		
		System.out.println("\nList of employees:");
		for ( Employee employee : employees ) {
			System.out.println(" " + employee.toString());
		}
		
		scanner.close();
	}
	
	/*
	static boolean IdRegisterValidator ( List<Employee> employees, Integer employeeId ) {
		boolean invalidId = false;
		for ( int i = 0; i < employees.toArray().length; i++ ) {
			if ( employees.get(i).getEmployeeId() == employeeId ) {
				invalidId = true;
				return invalidId;
			}
		}
		
		return invalidId;
	}
	*/
}

