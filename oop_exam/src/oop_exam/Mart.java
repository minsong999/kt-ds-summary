package oop_exam;

/**
 * 자판기와 고객이 만나는 마트
 */
public class Mart {
	/**
	 * 함수지향방식으로 개발한 코드
	 */
	public static void case1() {
		Customer musk = new Customer(0, 0);
		VendingMachine drinkMachine = new VendingMachine();

		drinkMachine.money = 3000;
		drinkMachine.productQuantity = 5;
		musk.wallet = 10_000;
		musk.stock = 0;

		// 고객이 자판기에 돈을 넣는다.
		// 고객이 가진 돈을 빼주고 자판기의 돈을 증가시킨다.
		musk.pay(drinkMachine.PRICE);

		// 자판기의 돈을 증가시킨다.
//		drinkMachine.insertMoney();

		// 고객이 자판기의 음료 버튼을 누른다.
		// 자판기의 상품 수량 감소하고
//		drinkMachine.pressButton();
		// 고객의 상품 수량 증가
		musk.addStock();

		System.out.println("자판기의 잔액: " + drinkMachine.money);
		System.out.println("자판기의 상품수량: " + drinkMachine.productQuantity);
		System.out.println("musk의 잔액: " + musk.wallet);
		System.out.println("musk의 상품수량: " + musk.stock);
	}

	/**
	 * 객체지향 방식으로 개발
	 */
	public static void main(String[] args) {
		Customer musk = new Customer(200_000, 50);
		VendingMachine drinkMachine = new VendingMachine();

//		아래 코드는 VendingMachine의 생성자에서 대체함.		
//		drinkMachine.money = 3000;
//		drinkMachine.productQuantity = 5;
//		아래 코드는 Customer의 생성자에서 대체함.
//		musk.wallet = 10_000;
//		musk.stock = 0;

		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);

		System.out.println("자판기의 잔액: " + drinkMachine.money);
		System.out.println("자판기의 상품수량: " + drinkMachine.productQuantity);
		System.out.println("musk의 잔액: " + musk.wallet);
		System.out.println("musk의 상품수량: " + musk.stock);
	}
}
