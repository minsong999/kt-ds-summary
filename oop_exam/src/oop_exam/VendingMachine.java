package oop_exam;

/**
 * 자판기
 */
public class VendingMachine {
	// 상수 자리
	final int PRICE = 1300;

	// 멤버변수 자리
	/**
	 * 상품 수량
	 */
	int productQuantity;

	/**
	 * 돈
	 */
	int money;

	/**
	 * 돈을 넣는다.
	 * 
	 * @param customer 돈을 넣는 고객
	 */
	public void insertMoney(Customer customer) {
		this.money += PRICE;
		customer.pay(PRICE);
	}

	// 생성자 자리.
	/**
	 * VendingMachine의 인스턴스를 생성할 때 호출된다.
	 */
	public VendingMachine() {
		System.out.println("자판기 인스턴스를 만들었습니다.");
		// 생성자가 만들어준 인스턴스의 멤버변수에 값을 할당한다.(초기화)
		this.productQuantity = 10;
		this.money = 100_000;
		
		/*
		 * 생성자를 만드는 이유
		 * 1. 멤버 변수 초기화(멤버 변수에 기본 값을 별도로 할당하기 위해서)
		 * 	- Reference Type(배열, 컬렉션 등) 위주로 초기화
		 * 2. 인스턴스 생성과 동시에 다른 메소드를 호출하기 위해
		 * 	- 예> 인스턴스를 생성함과 동시에 insertMoney 메소드를 호출하기 위해서
		 */
	}

	/**
	 * 버튼을 누른다
	 * 
	 * @param customer 버튼을 누른 고객
	 */
	public void pressButton(Customer customer) {
		if (this.productQuantity <= 0) {
			return; // 메소드 즉시 종료
		}
		this.productQuantity--;
		customer.addStock();
	}

}
