package oop_exam;

public class DrinkVendingMachineMain {

	public static void main(String[] args) {	//자바 시작 메소드
		
		DrinkVendingMachine vendingMachine = new DrinkVendingMachine(); //DrinkVendingMachine 인스턴스로 vendingMachine 이름으로 생성
		vendingMachine.printStock();	//DrinkVendingMachine 클래스의 printStock 메소드 실행
		
//		Drink orderdDrink = vendingMachine.order("박카스", 10);	//Drink 클래스에 DrinkVendingMachine클래스의 order 메소드에 "박카스", 10의 값을 넘겨 실행하여 리턴한 값을 할당
//		System.out.println(">> 주문결과: "+ orderdDrink.name + ", " + orderdDrink.price + ", " + orderdDrink.stock); //주문결과인 DrinkVendingMachine클래스의 order 메소드에 "박카스", 10의 값을 넘겨 실행하여 리턴한 값의 이름, 가격, 재고 출력
//		
//		orderdDrink = vendingMachine.order("박카스", 5);//Drink 클래스에 DrinkVendingMachine클래스의 order 메소드에 "박카스", 5의 값을 넘겨 실행하여 리턴한 값을 할당
//		System.out.println(">> 주문결과: "+ orderdDrink.name + ", " + orderdDrink.price + ", " + orderdDrink.stock); //주문결과인 //Drink 클래스에 DrinkVendingMachine클래스의 order 메소드에 "박카스", 5의 값을 넘겨 실행하여 리턴한 값의 이름, 가격, 재고 출력
//		
//		orderdDrink = vendingMachine.order("밀키스", 5);//Drink 클래스에 DrinkVendingMachine클래스의 order 메소드에 "밀키스", 5의 값을 넘겨 실행하여 리턴한 값을 할당
//		System.out.println(">> 주문결과: "+ orderdDrink.name + ", " + orderdDrink.price + ", " + orderdDrink.stock); //주문결과인 //Drink 클래스에 DrinkVendingMachine클래스의 order 메소드에 "밀키스", 5의 값을 넘겨 실행하여 리턴한 값의 이름, 가격, 재고 출력
		
		vendingMachine.printStock(); //DrinkVendingMachine 클래스의 printStock 메소드 실행
//		
//		vendingMachine.fill("박카스", 300); //DrinkVendingMachine 클래스의 fill 메소드 실행  파라미터 "박카스", 300
//		vendingMachine.fill("몬스터", 450); //DrinkVendingMachine 클래스의 fill 메소드 실행  파라미터 "몬스터", 450
//		vendingMachine.fill("핫식스", 250); // DrinkVendingMachine 클래스의 fill 메소드 실행 파라미터 "핫식스", 250
//		vendingMachine.fill("밀키스", 150); //DrinkVendingMachine 클래스의 fill 메소드 실행  파라미터 "밀키스", 150
//		                                                                                            
//		vendingMachine.fill("제로콜라", 500); //DrinkVendingMachine 클래스의 fill 메소드 실행 파라미터 "제로콜라", 500
//		
//		vendingMachine.printStock(); //DrinkVendingMachine 클래스의 printStock 메소드 실행
	}
	
}