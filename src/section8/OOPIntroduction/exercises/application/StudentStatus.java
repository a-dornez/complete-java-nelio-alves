/*
 * "Make a program that reads a students name and the grades they obtained in the year trimesters
 * (first trimester worths 30 points, second and third worths 35 points each). In the end, show 
 * student's final grade. Also, display if the student is approved (PASS) or reproved (FAILED) and, 
 * if failed, how many points are missing to achieve the minimum passing grade (which is 60% of 
 * maximum points). Consider maximum final grade as 100. Create a Student Class."
 * 		-- Problem by Nelio Alves
 */

package section8.OOPIntroduction.exercises.application;

import java.util.Locale;
import java.util.Scanner;

import section8.OOPIntroduction.exercises.entities.Student;

public class StudentStatus {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("\nWelcome\nPlease, insert the students name: ");
		 student.name = scanner.nextLine();
		System.out.print("Insert their first garde: ");
		 student.grade1 = scanner.nextDouble();
		System.out.print("Insert their second grade: ");
		 student.grade2 = scanner.nextDouble();
		System.out.print("Insert their third grade: ");
		 student.grade3 = scanner.nextDouble();
		
		student.FinalGrade();
		System.out.println( "\n" + student.toString() );
		
		scanner.close();
	}
}

