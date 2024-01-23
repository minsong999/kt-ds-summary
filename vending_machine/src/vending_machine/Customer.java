package vending_machine;

/**
 * 자판기를 이용하는 고객
 */
public class Customer {

	int wallet;
//	int stock;
	Product product;

	public Customer() {

	}

//	public Customer(int wallet, int stock) {
	public Customer(int wallet) {
		this.wallet = wallet;
//		this.stock = stock;
		this.product = new Product();
	}

	/**
	 * 지출한다.
	 */
	public void pay(int price) {
		if (wallet - price < 0) {
			return; // 메소드 즉시 종료
		}
		this.wallet -= price;
	}

	/**
	 * 상품이 하나 증가한다.
	 */
	public void addStock(String name, int price) {
		// this.stock++;
		// 고객이 제로콜라를 구매한 적이 있는지 확인.
		// 고객이 제로콜라를 구매한 적이 없다면
		if (this.product.name == null) {
			// 고객이 가진 상품의 정보를 제로콜라로 채워준다.
			this.product.name = name;
			this.product.price = price;
			this.product.quantity = 1;
		} else {
			// 고객이 제로콜라를 구매한 적이 있다면
			// 고객이 가진 제로콜라의 수량을 1개 증가시킨다.
			this.product.quantity++;
		}
	}
}
