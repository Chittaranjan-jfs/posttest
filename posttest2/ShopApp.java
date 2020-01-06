package labtest;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ShopApp {
	
	static Map<Integer, Customer> shopMap = new TreeMap<>();
	
	public static void main(String args[]) {
		
		Customer order = new Customer(1,"Abhijit",new SpecialOrders(100,5,"Rice","02/10/19"));
		
		addOrder(order);
		findCustomer(order.cust_id);
		updateOrder(order);
		//deleteOrder(order.cust_id);
		showCustomerOrder(order);
		
		//findOrderDetails(100);
		
		Customer order2 = new Customer(2,"Chitta",new SpecialOrders(101,10,"Maggi","18/12/19"));
		
		addOrder(order2);
		findCustomer(order2.cust_id);
		updateOrder(order2);
		showCustomerOrder(order2);
		
		//deleteOrder(order.cust_id);
		
		//findOrderDetails(101);
		
	}
	
	private static void showCustomerOrder(Customer customer)
	{
		System.out.println(customer);
		System.out.println();
		System.out.println(customer.order);
		System.out.println();
		
		
		
	}
	
	private static void addOrder(Customer customer) {
		
		shopMap.put(customer.cust_id,customer);
		System.out.println("Order and Customer Added Successfully!");
		
		
		
	}
	private static void findCustomer(int customerId) {
		Customer customer = (Customer)shopMap.get(customerId);
		if(customer != null) {
			//System.out.println("Found Customer : " + customer);
		}
		else {
			System.out.println("Customer not found!");
		}
	}
	private static void updateOrder(Customer customer) {
		Customer customer1 = (Customer)shopMap.get(customer.cust_id);
		if(customer1 != null) {
			shopMap.put(customer.cust_id, customer);
			//System.out.println("Updated order : " + customer);
			System.out.println();
			//System.out.println("Updated order : " + customer.order);
		}
		else {
			System.out.println("Aeroplane not found!");
		}
	}
	private static void deleteOrder(int customerId) {
		Customer customer = (Customer)shopMap.get(customerId);
		if(customer!= null) {
			shopMap.remove(customerId);
			System.out.println("Order Deleted");
			System.out.println(shopMap);
		}
		else {
			System.out.println("Order not found!");
		}

	}
	
	
	private static void findOrderDetails(int order_id)
	{
		Iterator it = shopMap.values().iterator();
		 
	  
	    while(it.hasNext()) {
	     Customer c = (Customer) it.next();
	     
	     if(c.order.order_id==order_id)
	     {
	    	 System.out.println(c.order);
	     }
	     
	    } 
	}
}
