package vending_machine;

import java.util.logging.Handler;

/**
 * 상속 받은 클래스가 추상 메소드가 존재하는 추상 클래스라면 추상 메소드를 이 클래스에서 구현을 시키거나 이 클래스도 추상 클래스로 만들어
 * 주어야 한다. <b>환불 불가능한 자판기<b>
 * 
 * @param <I>
 */
//public class VendingMachine extends Seller {
public class VendingMachine<I> implements Sellable<I> {

	private InsertMoneyHandler<I> insertMoneyHandler;
	private PressButtonHandler<I> pressButtonHandler;
	private PrintHandler<I> printHandler;

	private I[] productArray; // product 멤버변수 생성
	/**
	 * 돈
	 */
	private int money; // money 멤버변수 생성

	@Override
	public I[] getProductArray() {
		return this.productArray;
	}

	@Override
	public int getMoney() {
		return money;
	}

	@Override
	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void setInsertMoneyHandler(InsertMoneyHandler<I> handler) {
		this.insertMoneyHandler = handler;
	}

	@Override
	public void setPressButtonHandler(PressButtonHandler<I> handler) {
		this.pressButtonHandler = handler;
	}

	@Override
	public void setPrintHandler(PrintHandler<I> handler) {
		this.printHandler = handler;
	}

	public VendingMachine() {
		this(100_000, null);
	}

	public VendingMachine(I[] itemArry) {
		this(100_000, itemArry);
	}

	public VendingMachine(int money, I[] itemArray) { // 제네릭을 통해 생성자 생성을 할 경우 초기화가 안되므로 제네릭을 받아온다.
		this.productArray = itemArray;

		this.money = money;
	}

	// productArray 는 I[]배열이므로 product 또한 I형태의 인스턴스가되어야한다.
	@Override
	public void insertMoney(Customer customer, String productName) {
		for (I product : this.productArray) {
			this.insertMoneyHandler.handle(this, customer, product, productName);
		}
//			if (product.equals(productName)) {
//				this.money += product.getPrice();
//				customer.pay(product.getPrice());
//				break; // 반복중단
//			}

	}

	@Override
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer, productName, VendingMachine.PRODUCT_COUNT);

	}

	@Override
	public void pressButton(Customer customer, String productName, int orderCount) {
		for (I product : productArray) {
			this.pressButtonHandler.handle(this, product, customer, productName, orderCount);
//			if (product.getName().equals(productName)) {
//				if (product.getQuantity() < 0) {
//					this.refund(customer, product.getPrice());
//					return; // 메소드를 종료.
//				}
//
//				if (product.getQuantity() < orderCount) {
//					this.refund(customer, product.getPrice());
//					return; // 메소드 종료
//				}
//
//				int quantity = product.getQuantity();
//				quantity -= orderCount;
//				product.setQuantity(quantity);
//
//				customer.addStock(product.getName(), product.getPrice(), orderCount);
//			}
		}
	}

	protected void refund(Customer customer, int refundMoney) {

	}

	@Override
	public void printProducts() {
		System.out.println("자판기의 상품 금액: " + this.getMoney());
		for (I product : this.productArray) {
			this.printHandler.handle(product);
//			if (product != null) {
//				System.out.println("자판기의 상품 수량: " + product.getQuantity());
//				System.out.println("자판기의 상품 이름: " + product.getName());
//			}
		}
	}

//	public VendingMachine() {
//		super();
//	}
//
//	public VendingMachine(int money) {
//		super(money); // 슈퍼 클래스의 int 파라미터가 있는 생성자를 호출한다.
//	}
//	
//	@Override
//	protected void refund(Customer customer, int refundMoney) {
//		System.out.println("재고가 없습니다.");
//		System.out.println("환불은 못 해드려요.");
//	}

}
