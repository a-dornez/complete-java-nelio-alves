/*
 * "Write a program that reads two integer numbers 'M' and 'N', then read a matrix
 * of 'M' rows and 'N' columns storing integer values, repetitions are allowed. Then,
 * read an 'x' value that has at least one occurrence in the matrix. For each x occurrence,
 * show the values allocated to it's left, above it, to it's right and under x only
 * when there is an value to be shown."
 * 		-- Problem By Nelio Alves 
 */

package section10.exercises.application;

import java.util.Scanner;

public class SurroundingMatrixElements {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rowsQuantity = scanner.nextInt();
		int columnsQuantity = scanner.nextInt();
		
		int[][] matrix = new int[rowsQuantity][columnsQuantity];
		
		//collects values for matrix's positions
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int elementToCheckSurroundingValues = scanner.nextInt();
		
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				//checks occurrences of chosen value 
				if ( elementToCheckSurroundingValues == matrix[i][j] ) {
					System.out.printf("\nPosition %d, %d:\n", i, j );
					//checks valid coordinates
					if ( j > 0 ) {	//there's nothing to the left of j == 0 (first column)
						System.out.printf(" Left: %d\n", matrix[i][j-1] );
					}
					if ( i > 0 ) {	//there's nothing above i = 0 (first row)
						System.out.printf(" Up: %d\n", matrix[i-1][j] );
					}
					if ( j < columnsQuantity -1 ) {	//there's nothing to the right of j == columnsQuantity -1 (last column)
						System.out.printf(" Right: %d\n", matrix[i][j+1] );
					}
					if ( i < rowsQuantity - 1 ) {	//there's nothing under i == rowsQuantity -1 (last row)
						System.out.printf(" Down: %d", matrix[i+1][j] );
					}
				}
			}
		}
		
		scanner.close();
	}
}

