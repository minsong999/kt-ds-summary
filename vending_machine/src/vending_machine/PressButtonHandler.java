package vending_machine;

public interface PressButtonHandler<I> {
	public void handle(VendingMachine<I> machine, I item, Customer customer, String productName, int orderCount);

//	for (I product : productArray) {
//		if (product.getName().equals(productName)) {
//			if (product.getQuantity() < 0) {
//				this.refund(customer, product.getPrice());
//				return; // 메소드를 종료.
//			}
//
//			if (product.getQuantity() < orderCount) {
//				this.refund(customer, product.getPrice());
//				return; // 메소드 종료
//			}
//
//			int quantity = product.getQuantity();
//			quantity -= orderCount;
//			product.setQuantity(quantity);
//
//			customer.addStock(product.getName(), product.getPrice(), orderCount);
//		}
//	}
}
