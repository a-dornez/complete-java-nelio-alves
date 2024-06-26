/*
 * This is instructor's code.
 * source https://github.com/acenelio/enum1-java
 */

package section13.enums.examples.application;

import java.util.Date;

import section13.enums.examples.entities.Order;
import section13.enums.examples.entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
	
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	
	}
}

