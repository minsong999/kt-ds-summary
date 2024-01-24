package vending_machine;

/**
 * 자판기
 */
public class VendingMachine {
	// 상수 자리
//	final int PRICE = 1300;
	
	//클래스 상수(공용 상수)
		/**
		 * 한번에 구매 할 수 있는 제품의 수
		 */
		public static final int PRODUCT_COUNT;
		public static final String MACHINE_NAME;
	
	//클래스 상수에 값을 할당하는 방법
	//static block
	static {
		// static 변수 / 상수의 값을 초기화 하는 공간.
		PRODUCT_COUNT = 2;
		MACHINE_NAME="자판기";
	}

	// 멤버변수 자리
	/**
	 * 상품 수량
	 */
//	int productQuantity;
	private Product product;

	/**
	 * 돈
	 */
	private int money;

	//getter
	public Product getProduct() {
		return this.product;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	//setter
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 돈을 넣는다.
	 * 
	 * @param customer 돈을 넣는 고객
	 */
	public void insertMoney(Customer customer) {
		
		this.money += this.product.getPrice();
		customer.pay(this.product.getPrice());
	}

	// 생성자 자리.
	/**
	 * VendingMachine의 인스턴스를 생성할 때 호출된다.
	 */
	public VendingMachine() {
		System.out.println("자판기 인스턴스를 만들었습니다.");
		// 생성자가 만들어준 인스턴스의 멤버변수에 값을 할당한다.(초기화)
		this.product = new Product();
		this.product.setName("제로펩시"); 
		this.product.setPrice(1300);
		this.product.setQuantity(0);

		this.money = 100_000;

		/*
		 * 생성자를 만드는 이유 1. 멤버 변수 초기화(멤버 변수에 기본 값을 별도로 할당하기 위해서) - Reference Type(배열, 컬렉션
		 * 등) 위주로 초기화 2. 인스턴스 생성과 동시에 다른 메소드를 호출하기 위해 - 예> 인스턴스를 생성함과 동시에 insertMoney
		 * 메소드를 호출하기 위해서
		 */
	}

	/**
	 * 버튼을 누른다
	 * 
	 * @param customer 버튼을 누른 고객
	 */
	public void pressButton(Customer customer) {
		if (this.product.getQuantity() <= 0) {
			return; // 메소드 즉시 종료
		}
		this.product.setQuantity(this.product.getQuantity() - 1);
		customer.addStock(this.product.getName(), this.product.getPrice());
	}
}