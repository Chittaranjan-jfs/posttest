package labtest;

public class SpecialOrders extends Orders {
	
	public SpecialOrders(int order_id,int order_quantity , String item , String date)
	{
		super.date=date;
		super.item=item;
		super.order_id=order_id;
		super.order_quantity=order_quantity;
		
	}

	@Override
	public void confirm() {
		
		System.out.println("This Special Order is confirmed !! ");
		
	}

	@Override
	public void close() {
		
		System.out.println("This Special Order is closed !! ");
		
	}
	
	public void dispatch() {
		
		System.out.println("This special order is dispatched !! ");
	}
	

}
