/*
 * "Make a program that reads a rectangle's width and height. Then, display on screen it's area value, perimeter and diagonal.
 * Use a Class as shown in the following project:
 * 		 	_______________________
 * 			|      Rectangle	   |
 * 			|----------------------|
 * 			|- width: double	   |
 * 			|- height: double	   |
 * 			|----------------------|
 * 			|+ Area(): double	   |
 * 			|+ Perimeter(): double |
 * 			|+ Diagonal(): double  |
 * 			|______________________|
 * 		
 * 		-- Problem by Nelio Alves
 */

package section8.OOPIntroduction.exercises.application;

import java.util.Locale;
import java.util.Scanner;

import section8.OOPIntroduction.exercises.entities.Rectangle;

public class RectangleProperties {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rectangleA = new Rectangle();
		
		System.out.print("\nWelcome\nPlease, insert the rectangle's width: ");
		 rectangleA.width = scanner.nextDouble();
		System.out.print("Now, insert the rectangle's height: ");
		 rectangleA.height = scanner.nextDouble();
		
		System.out.println( "\nAREA: " + rectangleA.Area() );
		
		System.out.println( "PERIMETER: " + rectangleA.Perimeter() );
		
		System.out.println( "DIAGONAL: " + rectangleA.Diagonal() );
		
		scanner.close();
	}

}
