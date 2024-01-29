package vending_machine;

public class Mart {
	
	/**
	 * 함수지향방식으로 개발한 코드
	 */
//	public static void case1() {
//		
//		// VendingMachine 생성자를 호출해 인스턴스 생성
//		VendingMachine drinkMachine = new VendingMachine();
//
//		// Customer 생성자를 호출해 인스턴스 생성
//		Customer musk = new Customer(0);
//		// mask.wallet에 10000으로 값 재할당
////		musk.wallet = 10000;
////		musk.setWallet(10000); setter를 만들면 가능
////		musk.stock = 0;
//		// 고객이 자판기에 돈을 넣는다.
//		// 고객이 가진 돈을 빼주고
//		musk.pay(1300);
//		
//		// 자판기의 돈을 증가시킨다.
////		drinkMachine.insertMoney();
//		
//		// 고객이 자판기의 음료 버튼을 누른다.
//		// 자판기의 수량이 하나 줄어들고 
////		drinkMachine.pressButton();
//		// 고객의 수량이 하나 증가한다.
//		musk.addStock("",0);
//		
//		//결과 출력
//		System.out.println("자판기의 잔액: " + drinkMachine.getMoney());
//		//결과 출력
//		System.out.println("자판기의 상품 수량: " + drinkMachine.getProductArray().getQuantity());
//		//결과 출력
//		System.out.println("자판기의 상품 이름: " + drinkMachine.getProductArray().getName());
//		//결과 출력
//		System.out.println("고객의 지갑 잔액: " + musk.getWallet());
//		//결과 출력
//		System.out.println("고객의 상품 수량: " + musk.getProduct().getQuantity());
//	
//		
//	}
////	
//	public static void TemperatureProduct(TemperatureProduct tp) {
//		System.out.println(tp.getName()); //null
//	}

	//Object클래스가 최상위인데 그러면 다 Object로 받으면 안 될까? 1. 형변환이 불편하다.
	/*
	 * public static void printProduct(Product p) { System.out.println(p.getName());
	 * //null
	 * 
	 * if( p instanceof TemperatureProduct) { TemperatureProduct tp =
	 * (TemperatureProduct) p; System.out.println(tp.getIsHot()); }
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		Product p = new Product();
		p.setName("보드마카");
		p.setPrice(500);
		p.setQuantity(40);
		System.out.println(p);
		/*
		 * Product p = new Product(); TemperatureProduct tp = new TemperatureProduct();
		 * Object o = new TemperatureProduct(); // sub 클래스는 super클래스의 모든 것을 가지고 있기 때문에
		 * 사용 가능하다.
		 * 
		 * printProduct(p); printProduct(tp); //sub클래스만의 멤버변수, 메소드, 생성자는 사용할 수 없다.
		 */		//TemperatureProduct(p); //문법상 오류
		//TemperatureProduct(tp); //사용 가능하다.
		
		// Selller (추상클래스일때)
		// --> VendingMachine
		// --> RefundableVendingMachine
		// IS a 관계 성립
		// RefundableVendingMachine is Seller
		// Seller drinkVendingMachine = new VendingMachine();
		// Seller drinkVendingMachine = new RefundableVendingMachine();
		
		//Sellable (인터페이스)
		// --> (구현) VendingMachine
		// --> (구현) RefundableVendingMachine
		// 인터페이스를 구현 (IS A)
		// RefundableVendingMachine is Sellable
		// Sellable drinkVendingMachine = new VendingMachine();
		// Sellable drinkVendingMachine = new RefundableVendingMachine();
		
		// 객체지향방식으로 개발
		// VendingMachine 생성자를 호출해 인스턴스 생성
		Sellable drinkMachine = new VendingMachine();
		//아래의 코드는 VendingMachine의 ㅐㅇ성자에서 대체함.
//		drinkMachine.money = 3000;
//		drinkMachine.productQuantity = 5;
		
		// Customer 생성자를 호출해 인스턴스 생성
		Customer musk = new Customer(200_000);
//		아래 코드는 Customer의 생성자에서 대체함
//		musk.wallet = 10000;
//		musk.stock = 0;
		
		drinkMachine.insertMoney(musk,"제로펩시");
		drinkMachine.pressButton(musk,"제로펩시", 50);
		
		drinkMachine.insertMoney(musk,"제로펩시");
		drinkMachine.pressButton(musk,"제로펩시");

		musk.printProducts();
		drinkMachine.printProducts();
		
		System.out.println("-------------------------------------------------------");
		// 메소드 오버로딩 생성자 오버로딩 출력해보기
		Sellable snackMachine = new RefundableVendingMachine(400);

		snackMachine.insertMoney(musk, "제로펩시");
		snackMachine.pressButton(musk, "제로펩시", 55);
		
		snackMachine.insertMoney(musk, "제로펩시");
		snackMachine.pressButton(musk, "제로펩시", 2);

		musk.printProducts();
		snackMachine.printProducts();
				
		}
	


}
