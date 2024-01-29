package vending_machine;

public class Customer {

	/**
	 * 고객이 가진돈
	 */
	private int wallet;

	/**
	 * 고객이 가진 상품의 수량
	 */
//	int stock;
	private Product[] productArray;

	public int getWallet() {
		return this.wallet;
	}

	public Product[] getProduct() {
		return this.productArray;
	}

	/**
	 * 생성자
	 */
//	public Customer(int wallet, int stock) {
	public Customer(int wallet) {
		this.wallet = wallet;
//		this.stock = stock;
		// 프로덕트 생성자 호출
		this.productArray = new Product[3];
	}

	/**
	 * 지출한다.
	 */
	public void pay(int price) {
		// 가지고있는 금액빼기 음료가격이 영보다 작으면
		if (this.wallet - price <= 0) {
			return; // 메소드 즉시 종료
		}
		// Customer이 갖고있던 돈에서 음료값 빼기
		this.wallet -= price;
	}

	/**
	 * 환불 받는다.
	 * 
	 * @param money 환불 받은 금액
	 */
	public void addMoney(int money) {
		this.wallet += money;
	}

	/**
	 * 상품이 증가한다.
	 */
	public void addStock(String name, int price) {
////		this.stock++;
//		// 고객이 제로콜라를 구매한 적이 있는지? 확인.
//		// 고객이 제로콜라를 구매한 적이 없다면 
//		if (this.product.getName() == null) {
//			// 고객이 가진 상품의 정보를 제로콜라로 채워준다.
//			this.product.setName(name);
//			this.product.setPrice(price);
////			this.product.setQuantity(1);
//			this.product.setQuantity(VendingMachine.PRODUCT_COUNT);
//		}
//		// 고객이 제로콜라를 구매한 적이 있다면.
//		else {
//			// 고객이 가진 제로콜라의 수량을 1개 증가 시킨다.
////			this.product.quantity++;
//			int quantity = this.product.getQuantity();
////			quantity++;
//			quantity += VendingMachine.PRODUCT_COUNT;
//			this.product.setQuantity(quantity);
//		}
		this.addStock(name, price, VendingMachine.PRODUCT_COUNT);
	}

	// 메소드 오버로딩
	public void addStock(String name, int price, int productCount) {

		// 고객이 방금 구매한 제품이 고객의 제품 목록(this.productArray)에 있는지 확인한다.
		// 있다면 productCount 만큼 수량만 증가시킨다.
		// 없다면 비어있는 인덱스를 찾아서 비어있는 인덱스에 할당해준다.
		Product product = getProductByName(name);

		if (product != null) {
			int quantity = product.getQuantity();
			quantity += productCount;
			product.setQuantity(quantity);
		} else {
			int nullIndex = getNullIndex();
			if (nullIndex >= 0) {
				this.productArray[nullIndex] = new Product();
				this.productArray[nullIndex].setName(name);
				this.productArray[nullIndex].setPrice(price);
				this.productArray[nullIndex].setQuantity(productCount);
			}
		}
	}

	private Product getProductByName(String name) {
		for (Product product : productArray) {
			if (product != null && name.equals(product.getName())) {
				return product;
			}
		}
		return null;
	}

	private int getNullIndex() {
		for (int i = 0; i < productArray.length; i++) {
			if (this.productArray[i] == null) {
				return i;
			}
		}
		return -1;
	}

	public void printProducts() {
		System.out.println("고객의 돈: " + this.wallet);
		for (Product product : this.productArray) {
			if (product != null) {
				System.out.println("고객의 상품 수량: " + product.getQuantity());
				System.out.println("고객의 상품 이름: " + product.getName());
			}
		}
	}
}

//		this.stock++;
// 고객이 제로콜라를 구매한 적이 있는지? 확인.
// 고객이 제로콜라를 구매한 적이 없다면
//		if (this.productArray.getName() == null) {
//			// 고객이 가진 상품의 정보를 제로콜라로 채워준다.
//			this.productArray.setName(name);
//			this.productArray.setPrice(price);
////			this.product.setQuantity(1);
//			this.productArray.setQuantity(productCount);
//		}
//		// 고객이 제로콜라를 구매한 적이 있다면.
//		else {
//			// 고객이 가진 제로콜라의 수량을 1개 증가 시킨다.
////			this.product.quantity++;
//			int quantity = this.productArray.getQuantity();
////			quantity++;
//			quantity += productCount;
//			this.productArray.setQuantity(quantity);
//		}
//	}

//}
