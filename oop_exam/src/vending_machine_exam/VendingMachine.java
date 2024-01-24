package vending_machine_exam;

public class VendingMachine {
	Product product = new Product();
	Product product2 = new Product();
	Product product3 = new Product();
	Product product4 = new Product();
	
	//클래스 상수(공용 상수)
	/**
	 * 한번에 구매 할 수 있는 제품의 수
	 */
	public static final int PRODUCT_COUNT = 1;
	
	public VendingMachine() {
		this.product = new Product();
		this.product2 = new Product();
		this.product3 = new Product();
		this.product4 = new Product();
		
		this.product.name = "박카스";
		this.product.price = 900;
		this.product.quantity = 15;
		
		this.product2.name = "몬스터";
		this.product2.price = 1500;
		this.product2.quantity = 20;

		this.product3.name = "핫식스";
		this.product3.price = 1300;
		this.product3.quantity = 10;

		this.product4.name = "밀키스";
		this.product4.price = 1400;
		this.product4.quantity = 5;
	}

	public Product orderProduct(String productName, int productCount) {
		Product product = null;
		
		if (this.product.name.equals(productName)) {
			if (this.product.quantity < productCount) {
				System.out.println("상품이 품절되었습니다.");
			} else {
				this.product.quantity = this.product.quantity - productCount;
				product = new Product();
				product.name = productName;
				product.price = this.product.price;
				product.quantity = productCount;
			}
		}
		if (this.product2.name.equals(productName)) {
			if (this.product2.quantity < productCount) {
				System.out.println("상품이 품절되었습니다.");
			} else {
				this.product2.quantity = this.product2.quantity - productCount;
				product = new Product();
				product.name = productName;
				product.price = this.product.price;
				product.quantity = productCount;
			}
		}
		if (this.product3.name.equals(productName)) {
			if (this.product3.quantity < productCount) {
				System.out.println("상품이 품절되었습니다.");
			} else {
				this.product3.quantity = this.product3.quantity - productCount;
				product = new Product();
				product.name = productName;
				product.price = this.product.price;
				product.quantity = productCount;
			}
		}
		if (this.product4.name.equals(productName)) {
			if (this.product4.quantity < productCount) {
				System.out.println("상품이 품절되었습니다.");
			} else {
				this.product4.quantity = this.product4.quantity - productCount;
				product = new Product();
				product.name = productName;
				product.price = this.product.price;
				product.quantity = productCount;
			}
		}
		return product;

		
	}

	public void addProduct(String productName, int productCount) {
		if (this.product.name == productName) {
			this.product.quantity += productCount;
		}else if(this.product2.name == productName) {
			this.product2.quantity += productCount;
		}else if(this.product3.name == productName) {
			this.product3.quantity += productCount;
		}else if(this.product4.name == productName) {
			this.product4.quantity += productCount;
		}
	}

	public void showProductQuantity() {
		System.out.println("상품명: " + this.product.name);
		System.out.println("재고: " + this.product.quantity);
		System.out.println("상품명: " + this.product2.name);
		System.out.println("재고: " + this.product2.quantity);
		System.out.println("상품명: " + this.product3.name);
		System.out.println("재고: " + this.product3.quantity);
		System.out.println("상품명: " + this.product4.name);
		System.out.println("재고: " + this.product4.quantity);
	}
}
