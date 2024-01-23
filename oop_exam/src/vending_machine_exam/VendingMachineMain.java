package vending_machine_exam;


public class VendingMachineMain {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		Product product = new Product();
		product	= vendingMachine.orderProduct("박카스", 13);
		if(product != null) {
			System.out.println(product.name);
			System.err.println(product.quantity);
		}
		
		vendingMachine.addProduct("박카스", 2);
				
		vendingMachine.showProductQuantity();
		
	}
}
