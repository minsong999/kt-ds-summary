package vending_machine;

public interface InsertMoneyHandler<I> {
	public void handle(VendingMachine<I> machine, Customer customer, I item, String productName);

//	System.out.println("자판기의 상품 금액: " + this.getMoney());
//	for (I product : this.productArray) {
//		if (product != null) {
//			System.out.println("자판기의 상품 수량: " + product.getQuantity());
//			System.out.println("자판기의 상품 이름: " + product.getName());
//		}
//	}
	
	
	
	
	
	
	
	//	for (I product : this.productArray) {
//		if (product.equals(productName)) {
//			this.money += product.getPrice();
//			customer.pay(product.getPrice());
//			break; // 반복중단
//		}
//	}
}
