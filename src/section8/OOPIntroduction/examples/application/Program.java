package section8.OOPIntroduction.examples.application;

import java.util.Locale;
import java.util.Scanner;

import section8.OOPIntroduction.examples.entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		 product.name = scanner.nextLine();
		System.out.print("Price: ");
		 product.price = scanner.nextDouble();
		System.out.print("Quantity: ");
		 product.quantity = scanner.nextInt();
		
		
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be aded in stock: ");
		 int quantity = scanner.nextInt();
		 product.addProducts(quantity);
		
		System.out.println("\nUpdated data: " + product);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		 quantity = scanner.nextInt();
		 product.removeProducts(quantity);
		
		System.out.println("\nUpdated data: " + product);
		
		scanner.close();
	}
}

