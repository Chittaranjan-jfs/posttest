package labtest;

public class Customer {
	
	int cust_id;
	String cust_name;
	
	Orders order;
	
	Customer(int cust_id,String cust_name,Orders order){
		this.cust_id=cust_id;
		this.cust_name=cust_name;
		
		this.order=order;
		
		
	}
	
	@Override
	public String toString() {
		
		return " ------Customer Details----- \n Customer ID : "+cust_id+" Customer Name : "+cust_name;
		
	}
	
	

}
