package labtest;

public abstract class Orders implements Shop{
	
	int order_id;
	int order_quantity;
	String item;
	String date;
	
	
	public abstract void confirm();

	public abstract void close();
	
	@Override
	public String toString() {
		
		return " ------Order Details----- \n Order ID : "+order_id+" Order Quantity : "+order_quantity+" Order Item : "+item+" Order Date : "+date;
		
	}
}
