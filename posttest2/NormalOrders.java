package labtest;

public class NormalOrders extends Orders {
	
	@Override
	public void confirm() {
		
		System.out.println("This normal Order is confirmed !! ");
		
	}

	@Override
	public void close() {
		
		System.out.println("This normal Order is closed !! ");
		
	}
	
	public void receive() {
		
		System.out.println("This normal order is received !! ");
	}
	
	public void dispatch() {
		
		System.out.println("This normal order is dispatched !! ");
	}
	
	

}
