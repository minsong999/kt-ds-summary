package vending_machine;

/**
 * 자판기를 이용하는 고객
 */
public class Customer {

	private int wallet;
//	int stock;
	private Product product;
	
	//getter
	public int getWallet() {
		return this.wallet;
	}
	public Product getProduct() {
		return this.product;
	}
	
	//setter
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}

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
		if (this.product.getName() == null) {
			// 고객이 가진 상품의 정보를 제로콜라로 채워준다.
			this.product.setName(name);
			this.product.setPrice(price);
			this.product.setQuantity(VendingMachine.PRODUCT_COUNT);
		} else {
			// 고객이 제로콜라를 구매한 적이 있다면
			// 고객이 가진 제로콜라의 수량을 1개 증가시킨다.
			this.product.setQuantity(this.product.getQuantity() + 1);
		}
	}
}
