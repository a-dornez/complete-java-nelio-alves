/*
 * "A hostel owner has ten rooms to rent for students. Those rooms are indentified by numbers
 * from 0 to 9.
 * 
 * "Make a program that starts with 10 empty rooms and then read an 'N' quantity representing the 
 * number that will rent rooms (N can be from 1 to 10). Then, register the rent of the N students.
 * For each rent register, inform name, email aswell which room as chosen (0 to 9). Suppose that
 * a vacant room is chosen. Finally, your program should print a report of all occupied hostyel 
 * rooms, sorting them by room number."
 * 		-- Problem by Nelio Alves 
 */

package section9.exercises.application;

import java.util.Locale;
import java.util.Scanner;

import section9.exercises.entities.Tenant;

public class HostelTenantRegister {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		final int ROOMS_QUANTITY = 9;
		Tenant[] hostelRooms = new Tenant[ROOMS_QUANTITY];
		
		Tenant tenant;
		
		System.out.print("How many rooms will be rented: ");
		 int roomsToBeRented = scanner.nextInt();
		
		//collects tenants data
		for ( int i = 0; i < roomsToBeRented; i++ ) {
			System.out.printf("Rent# %d:\n", i + 1);
			System.out.print("Insert tenant's name: ");
			 scanner.nextLine();
			 String tenantName = scanner.nextLine();
			System.out.print("Insert tenant's email: ");
			 String tenantEmail = scanner.nextLine();
			System.out.print("Insert tenant's room: ");
			 int tenantRoomNumber = scanner.nextInt();
			
			//assigns tenants data to chosen room
			tenant = new Tenant(tenantName, tenantEmail, tenantRoomNumber);
			for ( int j = 0 ; j < roomsToBeRented; j++ ) {
				hostelRooms[tenantRoomNumber] = tenant;
			}
			System.out.print("\n");
		}
		
		//prints an report on located rooms
		System.out.println("Busy Rooms:");
		for ( int i = 0; i < hostelRooms.length; i++ ) {
			if ( hostelRooms[i] != null) {
				System.out.println( hostelRooms[i].toString() );
			}
		}
		
		scanner.close();
	}
}

