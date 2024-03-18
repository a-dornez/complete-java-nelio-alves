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
 * ------------------------------------------------------------------------------------------------------------------------
 * 17-mar-2024: added id value check upon employee registration, if id value already exists, prints warning and requires
 * another value
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
				//checks if inserted id already exists
				while ( IdRegisterValidator(employees, employeeId) == false) {
					System.out.print("This Id already exists. Please insert another value: ");
					employeeId = scanner.nextInt();
				}
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
		
		System.out.println("\nList of employees:");
			for ( Employee employee : employees ) {
				System.out.println(" " + employee.toString());
			}
		
		scanner.close();
	}
	
	static boolean IdRegisterValidator ( List<Employee> employees, int employeeId ) {
		
		//checks if inserted id is available
		Employee chosenEmployeeId = employees.stream().filter(x -> x.getEmployeeId() == employeeId ).findFirst().orElse(null);
		if ( chosenEmployeeId != null ) {
			return false;
		}
		
		return true;
	}
}

