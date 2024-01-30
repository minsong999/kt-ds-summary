package vending_machine;

/**
 * 자판기의 추상 클래스
 * abstract method가 있을 경우
 * 클래스의 타입도 abstarct class가 되어야 한다.
 * abstract class는 인스턴스로 만들 수 없다. (new Seller() 형식의 사용 불가)
 */
public abstract class Seller {

	// 클래스 상수 (공용 상수)
	/**
	 * 한번에 구매할 수 있는 제품의 수
	 */
	public static final int PRODUCT_COUNT;
	public static final String MACHINE_NAME;

	// 클래스 상수에 값을 할당하는 방법
	// static block
	static {
		// static 변수 / 상수의 값을 초기화하는 공간
		PRODUCT_COUNT = 1;
		MACHINE_NAME = "자판기";
	}

	// 상수 자리
//		final int PRICE = 1300;

	// 멤버변수 자리
	/**
	 * 상품 수량
	 */
//		int productQuantity;
	private Product[] productArray; // product 멤버변수 생성..

	/**
	 * 돈
	 */
	private int money; // money 멤버변수 생성

	public Product[] getProductArray() {
		return this.productArray;
	}

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}

	// 생성자 자리
	/**
	 * VendingMachine의 인스턴스를 생성할 때 호출된다.
	 */
	public Seller() {
		// "자판기 인스턴스를 만들었습니다." 출력
//			System.out.println("자판기 인스턴스를 만들었습니다.");
////			this.productQuantity = 10;
//			// 생성자가 만들어준 인스턴스의 멤버변수에 값을 할당한다. (초기화)
//			this.product = new Product();
//			this.product.setName("제로펩시");
//			this.product.setPrice(1600);
//			this.product.setQuantity(50);
//			this.money = 100_000;
//			
		this(100000);
		/*
		 * 생성자를 직접 만드는 이유 (두 가지) 1. 멤버변수 초기화 (멤버변수에 기본 값을 별도로 할당을 하기 위해서) - Reference
		 * Type 위주로 쵝화. - 배열, 컬렉션 2. 인스턴스 생성과 동시에 다른 메소드를 호출하기 위해. - 예> 인스턴스를 생성함과 동시에
		 * insertMoney메소드를 호출하기 위해서.
		 */
	}

	// 생성자 오버로딩
	public Seller(int money) {
		this.money = money;
		// 돈을 넣어주면 그 돈만큼 가지는 자판기 생성..

		this.productArray = new Product[3];

		this.productArray[0] = new Product();
		this.productArray[0].setName("제로펩시");
		this.productArray[0].setPrice(1600);
		this.productArray[0].setQuantity(50);

		this.productArray[1] = new Product();
		this.productArray[1].setName("제로콜라");
		this.productArray[1].setPrice(1500);
		this.productArray[1].setQuantity(30);

		this.productArray[2] = new Product();
		this.productArray[2].setName("제로스프라이트");
		this.productArray[2].setPrice(1400);
		this.productArray[2].setQuantity(20);
	}

	/**
	 * 돈을 넣는다.
	 * 
	 * @param 돈을          넣은 고객
	 * @param productName 구매할제품의 이름 (제로펩시, 제로콜라, 제로스프라이트)
	 */
	public final void insertMoney(Customer customer, String productName) {

		// this.productArray를 반복하면서 Product 인스턴스의 제품명 호가인.
		// Product 인스턴스의 제품명과 productName이 같으면,
		// 해당 제품의 가격으로 자판기의 돈을 즈가시키고
		// 고객의 돈을 감소시킨다.

		for (Product product : this.productArray) {
			if (product.equals(productName)) {
				this.money += product.getPrice();
				customer.pay(product.getPrice());
				break; // 반복중단
			}
		}

		// 원래 갖고있던 금액에 팔린 음료값 더하기
		// this.money += this.productArray.getPrice();
		// customer에 this.product.price를 파라미터로 갖는 pay기능을실행 ==> customer 금액 상실
		// customer.pay(this.productArray.getPrice());
	}

	/**
	 * 버튼을 누른다.
	 * 
	 * @param 버튼을 누른 고객
	 */
	public final void pressButton(Customer customer, String productName) {
////			if(this.productQuantity <= 0) {
//			// 만약 음료재고가 없다면
//			if(this.product.getQuantity() <= 0) {
//				return; // 메소드 즉시 종료
//			}
////			this.productQuantity--;
//			//재고가 있다면 재고 하나 감소
//			int quantity = this.product.getQuantity();
////			quantity--;
//			quantity -= VendingMachine.PRODUCT_COUNT;
//			this.product.setQuantity(quantity);
//			// 소비자의 재고는 상승 
//			// this.product.name, this.product.price를 파라미터로 갖는 addStock 기능 실행
//			customer.addStock(this.product.getName(), this.product.getPrice());

		// 같은 코드가 사라지게된다... 메소드 체이닝..
		this.pressButton(customer, productName, VendingMachine.PRODUCT_COUNT);
	}

	// 메소드 오버러딩 -- 문제점 같은코드를 사용하게됨..
	public void pressButton(Customer customer, String productName, int orderCount) {

		// this.productArray를 반복하면서 productName과 같은지 비교한다.
		// 같으면 해당 제품의 수량을 체크하고 (0보다 작은지)
		// 작다면, 메소드를 종료시킨다.
		// 그렇지 않다면 해당 제품의 수량을 하나 감소시키고
		// 고객에게 해당 제품을 전달한다.

		for (Product product : productArray) {
			if (product.getName().equals(productName)) {
				if (product.getQuantity() < 0) {
					this.refund(customer, product.getPrice());
					return; // 메소드를 종료.
				}

				if (product.getQuantity() < orderCount) {
					this.refund(customer, product.getPrice()); 
					return; // 메소드 종료
				}

				int quantity = product.getQuantity();
				quantity -= orderCount;
				product.setQuantity(quantity);

				customer.addStock(product.getName(), product.getPrice(), orderCount);
			}
		}
//			if (this.productArray.getQuantity() <= 0) {
//				return;
//			}
//			int quantity = this.productArray.getQuantity();
//			// orderCount만큼 판매하게됨
//			quantity -= orderCount;
//			this.productArray.setQuantity(quantity);
//			customer.addStock(this.productArray.getName(), this.productArray.getPrice(), orderCount);

	}
	
	/**
	 * 고객에게 환불 처리한다.
	 * 상속된 클래스에서만 사용할 수 있도록 한다.
	 * @param customer 환불 받을 고객
	 * @param refundMoney 환불 받을 금액
	 */
	protected abstract void refund(Customer customer, int refundMoney);

	public void printProducts() {
		System.out.println("자판기의 상품 금액: " + this.getMoney());
		for (Product product : this.productArray) {
			if (product != null) {
				System.out.println("자판기의 상품 수량: " + product.getQuantity());
				System.out.println("자판기의 상품 이름: " + product.getName());
			}
		}
	}

}